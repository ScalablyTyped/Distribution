package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVolumeRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target IOPS rate of the volume. This is only valid for Provisioned IOPS SSD (io1 and io2) volumes. For moreinformation, see  Provisioned IOPS SSD (io1 and io2) volumes. Default: If no IOPS value is specified, the existing value is retained.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing size of the volume. For information about available EBS volume sizes, see Amazon EBS Volume Types. Default: If no size is specified, the existing size is retained.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId
  
  /**
    * The target EBS volume type of the volume. Default: If no type is specified, the existing type is retained.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.undefined
}
object ModifyVolumeRequest {
  
  inline def apply(VolumeId: VolumeId): ModifyVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeRequest]
  }
  
  extension [Self <: ModifyVolumeRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
