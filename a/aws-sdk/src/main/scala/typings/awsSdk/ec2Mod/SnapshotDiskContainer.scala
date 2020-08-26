package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDiskContainer extends js.Object {
  /**
    * The description of the disk image being imported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..).
    */
  var Url: js.UndefOr[String] = js.native
  /**
    * The Amazon S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.ec2Mod.UserBucket] = js.native
}

object SnapshotDiskContainer {
  @scala.inline
  def apply(): SnapshotDiskContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDiskContainer]
  }
  @scala.inline
  implicit class SnapshotDiskContainerOps[Self <: SnapshotDiskContainer] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setUserBucket(value: UserBucket): Self = this.set("UserBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserBucket: Self = this.set("UserBucket", js.undefined)
  }
  
}

