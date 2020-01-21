package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSourceUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * Object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
    */
  var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object S3ReferenceDataSourceUpdate {
  @scala.inline
  def apply(
    BucketARNUpdate: BucketARN = null,
    FileKeyUpdate: FileKey = null,
    ReferenceRoleARNUpdate: RoleARN = null
  ): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARNUpdate != null) __obj.updateDynamic("BucketARNUpdate")(BucketARNUpdate.asInstanceOf[js.Any])
    if (FileKeyUpdate != null) __obj.updateDynamic("FileKeyUpdate")(FileKeyUpdate.asInstanceOf[js.Any])
    if (ReferenceRoleARNUpdate != null) __obj.updateDynamic("ReferenceRoleARNUpdate")(ReferenceRoleARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
}

