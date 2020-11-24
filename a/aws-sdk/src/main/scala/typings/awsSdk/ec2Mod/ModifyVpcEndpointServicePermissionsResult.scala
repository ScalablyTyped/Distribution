package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointServicePermissionsResult extends js.Object {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}
object ModifyVpcEndpointServicePermissionsResult {
  
  @scala.inline
  def apply(): ModifyVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsResult]
  }
  
  @scala.inline
  implicit class ModifyVpcEndpointServicePermissionsResultOps[Self <: ModifyVpcEndpointServicePermissionsResult] (val x: Self) extends AnyVal {
    
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
    def setReturnValue(value: Boolean): Self = this.set("ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("ReturnValue", js.undefined)
  }
}
