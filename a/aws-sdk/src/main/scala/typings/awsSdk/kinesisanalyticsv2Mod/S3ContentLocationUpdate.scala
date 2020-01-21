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
  def apply(
    BucketARNUpdate: BucketARN = null,
    FileKeyUpdate: FileKey = null,
    ObjectVersionUpdate: ObjectVersion = null
  ): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARNUpdate != null) __obj.updateDynamic("BucketARNUpdate")(BucketARNUpdate.asInstanceOf[js.Any])
    if (FileKeyUpdate != null) __obj.updateDynamic("FileKeyUpdate")(FileKeyUpdate.asInstanceOf[js.Any])
    if (ObjectVersionUpdate != null) __obj.updateDynamic("ObjectVersionUpdate")(ObjectVersionUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
}

