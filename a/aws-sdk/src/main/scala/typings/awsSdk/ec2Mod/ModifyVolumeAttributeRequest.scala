package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVolumeAttributeRequest extends StObject {
  
  /**
    * Indicates whether the volume should be auto-enabled for I/O operations.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId
}
object ModifyVolumeAttributeRequest {
  
  inline def apply(VolumeId: VolumeId): ModifyVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeAttributeRequest]
  }
  
  extension [Self <: ModifyVolumeAttributeRequest](x: Self) {
    
    inline def setAutoEnableIO(value: AttributeBooleanValue): Self = StObject.set(x, "AutoEnableIO", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableIOUndefined: Self = StObject.set(x, "AutoEnableIO", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
