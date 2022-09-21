package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAvailabilityZoneGroupRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Availability Zone group, Local Zone group, or Wavelength Zone group.
    */
  var GroupName: String
  
  /**
    * Indicates whether you are opted in to the Local Zone group or Wavelength Zone group. The only valid value is opted-in. You must contact Amazon Web Services Support to opt out of a Local Zone or Wavelength Zone group.
    */
  var OptInStatus: ModifyAvailabilityZoneOptInStatus
}
object ModifyAvailabilityZoneGroupRequest {
  
  inline def apply(GroupName: String, OptInStatus: ModifyAvailabilityZoneOptInStatus): ModifyAvailabilityZoneGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], OptInStatus = OptInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupRequest]
  }
  
  extension [Self <: ModifyAvailabilityZoneGroupRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setOptInStatus(value: ModifyAvailabilityZoneOptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
  }
}
