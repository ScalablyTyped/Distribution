package typings.contentfulManagement.personalAccessTokenMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.content_management_manage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalAccessToken
  extends PersonalAccessTokenProp
     with DefaultElements[PersonalAccessTokenProp] {
  
  /**
    * Revokes a personal access token
    * @return Object the revoked personal access token
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *  accessToken: <content_management_api_key>
    * })
    *
    * client.getPersonalAccessToken('<token-id>')
    *  .then((personalAccessToken) => {
    *    return personalAccessToken.revoke()
    *  })
    *  .catch(console.error)
    * ```
    */
  def revoke(): js.Promise[PersonalAccessToken] = js.native
}
object PersonalAccessToken {
  
  @scala.inline
  def apply(
    name: String,
    revoke: () => js.Promise[PersonalAccessToken],
    scopes: js.Array[content_management_manage],
    sys: MetaSysProps,
    toPlainObject: () => PersonalAccessTokenProp
  ): PersonalAccessToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke), scopes = scopes.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[PersonalAccessToken]
  }
  
  @scala.inline
  implicit class PersonalAccessTokenOps[Self <: PersonalAccessToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRevoke(value: () => js.Promise[PersonalAccessToken]): Self = this.set("revoke", js.Any.fromFunction0(value))
  }
}
