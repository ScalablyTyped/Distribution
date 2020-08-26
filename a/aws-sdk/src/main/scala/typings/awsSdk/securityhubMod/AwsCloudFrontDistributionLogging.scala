package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionLogging extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * With this field, you can enable or disable the selected distribution.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether you want CloudFront to include cookies in access logs.
    */
  var IncludeCookies: js.UndefOr[Boolean] = js.native
  /**
    * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionLogging {
  @scala.inline
  def apply(): AwsCloudFrontDistributionLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionLoggingOps[Self <: AwsCloudFrontDistributionLogging] (val x: Self) extends AnyVal {
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
    def setBucket(value: NonEmptyString): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setIncludeCookies(value: Boolean): Self = this.set("IncludeCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCookies: Self = this.set("IncludeCookies", js.undefined)
    @scala.inline
    def setPrefix(value: NonEmptyString): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

