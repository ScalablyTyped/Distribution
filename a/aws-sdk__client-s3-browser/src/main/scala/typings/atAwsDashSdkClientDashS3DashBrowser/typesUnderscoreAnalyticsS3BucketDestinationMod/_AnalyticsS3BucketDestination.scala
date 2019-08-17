package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsS3BucketDestinationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnalyticsS3BucketDestination extends js.Object {
  /**
    * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
    */
  var Bucket: String
  /**
    * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
    */
  var BucketAccountId: js.UndefOr[String] = js.undefined
  /**
    * <p>The file format used when exporting data to Amazon S3.</p>
    */
  var Format: CSV | String
  /**
    * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object _AnalyticsS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | String, BucketAccountId: String = null, Prefix: String = null): _AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Format = Format.asInstanceOf[js.Any])
    if (BucketAccountId != null) __obj.updateDynamic("BucketAccountId")(BucketAccountId)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[_AnalyticsS3BucketDestination]
  }
}

