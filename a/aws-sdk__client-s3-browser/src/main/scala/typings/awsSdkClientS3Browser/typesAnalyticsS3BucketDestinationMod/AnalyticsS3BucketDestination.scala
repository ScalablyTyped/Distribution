package typings.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
    */
  var BucketAccountId: js.UndefOr[String] = js.native
  /**
    * <p>The file format used when exporting data to Amazon S3.</p>
    */
  var Format: CSV | String = js.native
  /**
    * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | String): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
  @scala.inline
  implicit class AnalyticsS3BucketDestinationOps[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: CSV | String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketAccountId(value: String): Self = this.set("BucketAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketAccountId: Self = this.set("BucketAccountId", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

