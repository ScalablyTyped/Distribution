package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeviceAuthorizationResponse extends js.Object {
  /**
    * The short-lived code that is used by the device when polling for a session token.
    */
  var deviceCode: js.UndefOr[DeviceCode] = js.native
  /**
    * Indicates the number of seconds in which the verification code will become invalid.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  /**
    * Indicates the number of seconds the client must wait between attempts when polling for a session.
    */
  var interval: js.UndefOr[IntervalInSeconds] = js.native
  /**
    * A one-time user verification code. This is needed to authorize an in-use device.
    */
  var userCode: js.UndefOr[UserCode] = js.native
  /**
    * The URI of the verification page that takes the userCode to authorize the device.
    */
  var verificationUri: js.UndefOr[URI] = js.native
  /**
    * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in which the user visits the verification page and enters their code.
    */
  var verificationUriComplete: js.UndefOr[URI] = js.native
}

object StartDeviceAuthorizationResponse {
  @scala.inline
  def apply(
    deviceCode: DeviceCode = null,
    expiresIn: js.UndefOr[ExpirationInSeconds] = js.undefined,
    interval: js.UndefOr[IntervalInSeconds] = js.undefined,
    userCode: UserCode = null,
    verificationUri: URI = null,
    verificationUriComplete: URI = null
  ): StartDeviceAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceCode != null) __obj.updateDynamic("deviceCode")(deviceCode.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (userCode != null) __obj.updateDynamic("userCode")(userCode.asInstanceOf[js.Any])
    if (verificationUri != null) __obj.updateDynamic("verificationUri")(verificationUri.asInstanceOf[js.Any])
    if (verificationUriComplete != null) __obj.updateDynamic("verificationUriComplete")(verificationUriComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceAuthorizationResponse]
  }
}

