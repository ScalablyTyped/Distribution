package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVolumeAttributeRequest extends StObject {
  
  /**
    * Indicates whether the volume should be auto-enabled for I/O operations.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}
object ModifyVolumeAttributeRequest {
  
  @scala.inline
  def apply(VolumeId: VolumeId): ModifyVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyVolumeAttributeRequestMutableBuilder[Self <: ModifyVolumeAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnableIO(value: AttributeBooleanValue): Self = StObject.set(x, "AutoEnableIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEnableIOUndefined: Self = StObject.set(x, "AutoEnableIO", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
