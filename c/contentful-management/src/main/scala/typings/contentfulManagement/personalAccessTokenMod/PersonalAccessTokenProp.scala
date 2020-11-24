package typings.contentfulManagement.personalAccessTokenMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.content_management_manage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalAccessTokenProp extends js.Object {
  
  var name: String = js.native
  
  var revokedAt: Null | String = js.native
  
  var scopes: js.Array[content_management_manage] = js.native
  
  var sys: MetaSysProps = js.native
  
  var token: js.UndefOr[String] = js.native
}
object PersonalAccessTokenProp {
  
  @scala.inline
  def apply(name: String, scopes: js.Array[content_management_manage], sys: MetaSysProps): PersonalAccessTokenProp = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalAccessTokenProp]
  }
  
  @scala.inline
  implicit class PersonalAccessTokenPropOps[Self <: PersonalAccessTokenProp] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedAt(value: String): Self = this.set("revokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedAtNull: Self = this.set("revokedAt", null)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
