package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceVolumeDetailItem extends StObject {
  
  /**
    * The Availability Zone where the resulting instance will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.undefined
  
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.undefined
  
  /**
    * The status of the import of this particular disk image.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The status information or errors related to the disk image.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined
}
object ImportInstanceVolumeDetailItem {
  
  @scala.inline
  def apply(): ImportInstanceVolumeDetailItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceVolumeDetailItem]
  }
  
  @scala.inline
  implicit class ImportInstanceVolumeDetailItemMutableBuilder[Self <: ImportInstanceVolumeDetailItem] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVolume(value: DiskImageVolumeDescription): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
