package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningProfileParameter extends js.Object {
  /**
    * Certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The location of the code-signing certificate on your device.
    */
  var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.native
  /**
    * The hardware platform of your device.
    */
  var platform: js.UndefOr[Platform] = js.native
}

object SigningProfileParameter {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificatePathOnDevice: CertificatePathOnDevice = null,
    platform: Platform = null
  ): SigningProfileParameter = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificatePathOnDevice != null) __obj.updateDynamic("certificatePathOnDevice")(certificatePathOnDevice.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningProfileParameter]
  }
}

