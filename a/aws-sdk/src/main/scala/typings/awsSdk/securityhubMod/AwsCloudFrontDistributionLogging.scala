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
    * An optional string that you want CloudFront to prefix to the access log filenames for this distribution.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionLogging {
  @scala.inline
  def apply(
    Bucket: NonEmptyString = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    IncludeCookies: js.UndefOr[scala.Boolean] = js.undefined,
    Prefix: NonEmptyString = null
  ): AwsCloudFrontDistributionLogging = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeCookies)) __obj.updateDynamic("IncludeCookies")(IncludeCookies.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
  }
}

