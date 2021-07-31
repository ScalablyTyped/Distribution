package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVolumeRequest extends StObject {
  
  /**
    * The Availability Zone for the resulting EBS volume.
    */
  var AvailabilityZone: String
  
  /**
    * A description of the volume.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The disk image.
    */
  var Image: DiskImageDetail
  
  /**
    * The volume size.
    */
  var Volume: VolumeDetail
}
object ImportVolumeRequest {
  
  @scala.inline
  def apply(AvailabilityZone: String, Image: DiskImageDetail, Volume: VolumeDetail): ImportVolumeRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVolumeRequest]
  }
  
  @scala.inline
  implicit class ImportVolumeRequestMutableBuilder[Self <: ImportVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setImage(value: DiskImageDetail): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: VolumeDetail): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
  }
}
