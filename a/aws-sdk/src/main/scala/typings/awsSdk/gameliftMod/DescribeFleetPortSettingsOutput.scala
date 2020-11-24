package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetPortSettingsOutput extends js.Object {
  
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.native
}
object DescribeFleetPortSettingsOutput {
  
  @scala.inline
  def apply(): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
  
  @scala.inline
  implicit class DescribeFleetPortSettingsOutputOps[Self <: DescribeFleetPortSettingsOutput] (val x: Self) extends AnyVal {
    
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
    def setInboundPermissionsVarargs(value: IpPermission*): Self = this.set("InboundPermissions", js.Array(value :_*))
    
    @scala.inline
    def setInboundPermissions(value: IpPermissionsList): Self = this.set("InboundPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundPermissions: Self = this.set("InboundPermissions", js.undefined)
  }
}
