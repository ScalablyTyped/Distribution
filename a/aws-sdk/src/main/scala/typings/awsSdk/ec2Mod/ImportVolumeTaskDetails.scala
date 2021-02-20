package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportVolumeTaskDetails extends StObject {
  
  /**
    * The Availability Zone where the resulting volume will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.native
  
  /**
    * The description you provided when starting the import volume task.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.native
  
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.native
}
object ImportVolumeTaskDetails {
  
  @scala.inline
  def apply(): ImportVolumeTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeTaskDetails]
  }
  
  @scala.inline
  implicit class ImportVolumeTaskDetailsMutableBuilder[Self <: ImportVolumeTaskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBytesConverted(value: Long): Self = StObject.set(x, "BytesConverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesConvertedUndefined: Self = StObject.set(x, "BytesConverted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setImage(value: DiskImageDescription): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    @scala.inline
    def setVolume(value: DiskImageVolumeDescription): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
