package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachVolumeRequest extends StObject {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var Device: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}
object AttachVolumeRequest {
  
  @scala.inline
  def apply(Device: String, InstanceId: InstanceId, VolumeId: VolumeId): AttachVolumeRequest = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVolumeRequest]
  }
  
  @scala.inline
  implicit class AttachVolumeRequestMutableBuilder[Self <: AttachVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
