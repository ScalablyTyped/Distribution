package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtmpOutputSettings extends js.Object {
  /**
    * If set to verifyAuthenticity, verify the tls certificate chain to a trusted Certificate Authority (CA).  This will cause rtmps outputs with self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.native
  /**
    * Number of seconds to wait before retrying a connection to the Flash Media server if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin1] = js.native
  /**
    * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname). For connection to Akamai, a username and password must be supplied. URI fields accept format identifiers.
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
}

object RtmpOutputSettings {
  @scala.inline
  def apply(
    Destination: OutputLocationRef,
    CertificateMode: RtmpOutputCertificateMode = null,
    ConnectionRetryInterval: Int | Double = null,
    NumRetries: Int | Double = null
  ): RtmpOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    if (CertificateMode != null) __obj.updateDynamic("CertificateMode")(CertificateMode.asInstanceOf[js.Any])
    if (ConnectionRetryInterval != null) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.asInstanceOf[js.Any])
    if (NumRetries != null) __obj.updateDynamic("NumRetries")(NumRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmpOutputSettings]
  }
}

