package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the bucket to which data is exported.
    */
  var Bucket: BucketName = js.native
  /**
    * The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.native
  /**
    * Specifies the file format used when exporting data to Amazon S3.
    */
  var Format: AnalyticsS3ExportFileFormat = js.native
  /**
    * The prefix to use when exporting data. The prefix is prepended to all results.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Format: AnalyticsS3ExportFileFormat,
    BucketAccountId: AccountId = null,
    Prefix: Prefix = null
  ): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (BucketAccountId != null) __obj.updateDynamic("BucketAccountId")(BucketAccountId.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
}

