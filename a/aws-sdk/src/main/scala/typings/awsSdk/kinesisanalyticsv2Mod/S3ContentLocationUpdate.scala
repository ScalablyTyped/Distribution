package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ContentLocationUpdate extends js.Object {
  /**
    * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * The new file key for the object containing the application code.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  /**
    * The new version of the object containing the application code.
    */
  var ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.native
}

object S3ContentLocationUpdate {
  @scala.inline
  def apply(): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
  @scala.inline
  implicit class S3ContentLocationUpdateOps[Self <: S3ContentLocationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketARNUpdate(value: BucketARN): Self = this.set("BucketARNUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketARNUpdate: Self = this.set("BucketARNUpdate", js.undefined)
    @scala.inline
    def setFileKeyUpdate(value: FileKey): Self = this.set("FileKeyUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileKeyUpdate: Self = this.set("FileKeyUpdate", js.undefined)
    @scala.inline
    def setObjectVersionUpdate(value: ObjectVersion): Self = this.set("ObjectVersionUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectVersionUpdate: Self = this.set("ObjectVersionUpdate", js.undefined)
  }
  
}

