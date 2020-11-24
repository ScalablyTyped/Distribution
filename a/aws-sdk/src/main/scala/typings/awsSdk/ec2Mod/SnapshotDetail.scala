package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotDetail extends js.Object {
  
  /**
    * A description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The block device mapping for the snapshot.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * The size of the disk in the snapshot, in GiB.
    */
  var DiskImageSize: js.UndefOr[Double] = js.native
  
  /**
    * The format of the disk image from which the snapshot is created.
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * The percentage of progress for the task.
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * The snapshot ID of the disk being imported.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  
  /**
    * A brief status of the snapshot creation.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * A detailed status message for the snapshot creation.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The URL used to access the disk image.
    */
  var Url: js.UndefOr[String] = js.native
  
  /**
    * The Amazon S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucketDetails] = js.native
}
object SnapshotDetail {
  
  @scala.inline
  def apply(): SnapshotDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDetail]
  }
  
  @scala.inline
  implicit class SnapshotDetailOps[Self <: SnapshotDetail] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    
    @scala.inline
    def setDiskImageSize(value: Double): Self = this.set("DiskImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskImageSize: Self = this.set("DiskImageSize", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    
    @scala.inline
    def setUserBucket(value: UserBucketDetails): Self = this.set("UserBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserBucket: Self = this.set("UserBucket", js.undefined)
  }
}
