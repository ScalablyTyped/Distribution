package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var HTTPPort: integer = js.native
  /**
    * The HTTPS port the custom origin listens on.
    */
  var HTTPSPort: integer = js.native
  /**
    * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1 second; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginKeepaliveTimeout: js.UndefOr[integer] = js.native
  /**
    * The origin protocol policy to apply to your origin.
    */
  var OriginProtocolPolicy: typings.awsSdk.cloudfrontMod.OriginProtocolPolicy = js.native
  /**
    * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 4 seconds; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginReadTimeout: js.UndefOr[integer] = js.native
  /**
    * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
    */
  var OriginSslProtocols: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginSslProtocols] = js.native
}

object CustomOriginConfig {
  @scala.inline
  def apply(
    HTTPPort: integer,
    HTTPSPort: integer,
    OriginProtocolPolicy: OriginProtocolPolicy,
    OriginKeepaliveTimeout: Int | Double = null,
    OriginReadTimeout: Int | Double = null,
    OriginSslProtocols: OriginSslProtocols = null
  ): CustomOriginConfig = {
    val __obj = js.Dynamic.literal(HTTPPort = HTTPPort.asInstanceOf[js.Any], HTTPSPort = HTTPSPort.asInstanceOf[js.Any], OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    if (OriginKeepaliveTimeout != null) __obj.updateDynamic("OriginKeepaliveTimeout")(OriginKeepaliveTimeout.asInstanceOf[js.Any])
    if (OriginReadTimeout != null) __obj.updateDynamic("OriginReadTimeout")(OriginReadTimeout.asInstanceOf[js.Any])
    if (OriginSslProtocols != null) __obj.updateDynamic("OriginSslProtocols")(OriginSslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOriginConfig]
  }
}

