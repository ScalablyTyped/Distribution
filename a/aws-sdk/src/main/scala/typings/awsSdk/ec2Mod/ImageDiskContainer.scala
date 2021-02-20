package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDiskContainer extends StObject {
  
  /**
    * The description of the disk image.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The block device mapping for the disk.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * The format of the disk image being imported. Valid values: OVA | VHD | VHDX |VMDK 
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * The ID of the EBS snapshot to be used for importing the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  
  /**
    * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an Amazon S3 URL (s3://..)
    */
  var Url: js.UndefOr[String] = js.native
  
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.ec2Mod.UserBucket] = js.native
}
object ImageDiskContainer {
  
  @scala.inline
  def apply(): ImageDiskContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDiskContainer]
  }
  
  @scala.inline
  implicit class ImageDiskContainerMutableBuilder[Self <: ImageDiskContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUserBucket(value: UserBucket): Self = StObject.set(x, "UserBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserBucketUndefined: Self = StObject.set(x, "UserBucket", js.undefined)
  }
}
