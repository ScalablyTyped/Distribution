package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportVolumeTaskDetails extends js.Object {
  
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
  implicit class ImportVolumeTaskDetailsOps[Self <: ImportVolumeTaskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBytesConverted(value: Long): Self = this.set("BytesConverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesConverted: Self = this.set("BytesConverted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setImage(value: DiskImageDescription): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    
    @scala.inline
    def setVolume(value: DiskImageVolumeDescription): Self = this.set("Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("Volume", js.undefined)
  }
}
