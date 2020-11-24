package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAppCatalogRequest extends js.Object {
  
  /**
    * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub in your account. Otherwise, the role that you provide must have the policy and trust policy described in the AWS Migration Hub User Guide.
    */
  var roleName: js.UndefOr[RoleName] = js.native
}
object ImportAppCatalogRequest {
  
  @scala.inline
  def apply(): ImportAppCatalogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAppCatalogRequest]
  }
  
  @scala.inline
  implicit class ImportAppCatalogRequestOps[Self <: ImportAppCatalogRequest] (val x: Self) extends AnyVal {
    
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
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
  }
}
