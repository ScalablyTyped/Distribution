package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends js.Object {
  
  /**
    * The number of passwords belonging to the user. The maximum is two.
    */
  var PasswordCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Indicates whether the user requires a password to authenticate.
    */
  var Type: js.UndefOr[AuthenticationType] = js.native
}
object Authentication {
  
  @scala.inline
  def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationOps[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPasswordCount(value: IntegerOptional): Self = this.set("PasswordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordCount: Self = this.set("PasswordCount", js.undefined)
    
    @scala.inline
    def setType(value: AuthenticationType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
