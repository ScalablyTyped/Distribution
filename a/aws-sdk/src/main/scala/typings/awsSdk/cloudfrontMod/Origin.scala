package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origin extends js.Object {
  /**
    * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3, and the default (if you don’t specify otherwise) is 3. For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an Origin Response Timeout. For more information, see Origin Connection Attempts in the Amazon CloudFront Developer Guide.
    */
  var ConnectionAttempts: js.UndefOr[integer] = js.native
  /**
    * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds. For more information, see Origin Connection Timeout in the Amazon CloudFront Developer Guide.
    */
  var ConnectionTimeout: js.UndefOr[integer] = js.native
  /**
    * A list of HTTP header names and values that CloudFront adds to requests it sends to the origin. For more information, see Adding Custom Headers to Origin Requests in the Amazon CloudFront Developer Guide.
    */
  var CustomHeaders: js.UndefOr[typings.awsSdk.cloudfrontMod.CustomHeaders] = js.native
  /**
    * Use this type to specify an origin that is a content container or HTTP server, including an Amazon S3 bucket that is configured with static website hosting. To specify an Amazon S3 bucket that is  not  configured with static website hosting, use the S3OriginConfig type instead.
    */
  var CustomOriginConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CustomOriginConfig] = js.native
  /**
    * The domain name for the origin. For more information, see Origin Domain Name in the Amazon CloudFront Developer Guide.
    */
  var DomainName: String = js.native
  /**
    * A unique identifier for the origin. This value must be unique within the distribution. Use this value to specify the TargetOriginId in a CacheBehavior or DefaultCacheBehavior.
    */
  var Id: String = js.native
  /**
    * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the origin. For more information, see Origin Path in the Amazon CloudFront Developer Guide.
    */
  var OriginPath: js.UndefOr[String] = js.native
  /**
    * Use this type to specify an origin that is an Amazon S3 bucket that is  not  configured with static website hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static website hosting, use the CustomOriginConfig type instead.
    */
  var S3OriginConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.S3OriginConfig] = js.native
}

object Origin {
  @scala.inline
  def apply(
    DomainName: String,
    Id: String,
    ConnectionAttempts: js.UndefOr[integer] = js.undefined,
    ConnectionTimeout: js.UndefOr[integer] = js.undefined,
    CustomHeaders: CustomHeaders = null,
    CustomOriginConfig: CustomOriginConfig = null,
    OriginPath: String = null,
    S3OriginConfig: S3OriginConfig = null
  ): Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectionAttempts)) __obj.updateDynamic("ConnectionAttempts")(ConnectionAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectionTimeout)) __obj.updateDynamic("ConnectionTimeout")(ConnectionTimeout.get.asInstanceOf[js.Any])
    if (CustomHeaders != null) __obj.updateDynamic("CustomHeaders")(CustomHeaders.asInstanceOf[js.Any])
    if (CustomOriginConfig != null) __obj.updateDynamic("CustomOriginConfig")(CustomOriginConfig.asInstanceOf[js.Any])
    if (OriginPath != null) __obj.updateDynamic("OriginPath")(OriginPath.asInstanceOf[js.Any])
    if (S3OriginConfig != null) __obj.updateDynamic("S3OriginConfig")(S3OriginConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}

