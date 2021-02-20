package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAvailabilityZoneGroupRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the Availability Zone group, Local Zone group, or Wavelength Zone group.
    */
  var GroupName: String = js.native
  
  /**
    * Indicates whether you are opted in to the Local Zone group or Wavelength Zone group. The only valid value is opted-in. You must contact AWS Support to opt out of a Local Zone group, or Wavelength Zone group.
    */
  var OptInStatus: ModifyAvailabilityZoneOptInStatus = js.native
}
object ModifyAvailabilityZoneGroupRequest {
  
  @scala.inline
  def apply(GroupName: String, OptInStatus: ModifyAvailabilityZoneOptInStatus): ModifyAvailabilityZoneGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], OptInStatus = OptInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupRequest]
  }
  
  @scala.inline
  implicit class ModifyAvailabilityZoneGroupRequestMutableBuilder[Self <: ModifyAvailabilityZoneGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInStatus(value: ModifyAvailabilityZoneOptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
  }
}
