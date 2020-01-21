package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSourceUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * The object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
}

object S3ReferenceDataSourceUpdate {
  @scala.inline
  def apply(BucketARNUpdate: BucketARN = null, FileKeyUpdate: FileKey = null): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARNUpdate != null) __obj.updateDynamic("BucketARNUpdate")(BucketARNUpdate.asInstanceOf[js.Any])
    if (FileKeyUpdate != null) __obj.updateDynamic("FileKeyUpdate")(FileKeyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
}

