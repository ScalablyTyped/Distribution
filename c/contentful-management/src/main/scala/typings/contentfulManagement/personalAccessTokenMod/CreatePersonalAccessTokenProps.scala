package typings.contentfulManagement.personalAccessTokenMod

import typings.contentfulManagement.contentfulManagementStrings.content_management_manage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<contentful-management.contentful-management/dist/typings/entities/personal-access-token.PersonalAccessToken, 'name' | 'scopes'> */
@js.native
trait CreatePersonalAccessTokenProps extends js.Object {
  
  var name: String = js.native
  
  var scopes: js.Array[content_management_manage] = js.native
}
object CreatePersonalAccessTokenProps {
  
  @scala.inline
  def apply(name: String, scopes: js.Array[content_management_manage]): CreatePersonalAccessTokenProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePersonalAccessTokenProps]
  }
  
  @scala.inline
  implicit class CreatePersonalAccessTokenPropsOps[Self <: CreatePersonalAccessTokenProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: content_management_manage*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[content_management_manage]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
}
