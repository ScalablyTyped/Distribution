package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSChannelRequest extends js.Object {
  /**
    * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
    */
  var BundleId: js.UndefOr[string] = js.native
  /**
    * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with APNs by using an APNs certificate.
    */
  var Certificate: js.UndefOr[string] = js.native
  /**
    * The default authentication method that you want Amazon Pinpoint to use when authenticating with APNs, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.native
  /**
    * Specifies whether to enable the APNs channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with APNs.
    */
  var PrivateKey: js.UndefOr[string] = js.native
  /**
    * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
    */
  var TeamId: js.UndefOr[string] = js.native
  /**
    * The authentication key to use for APNs tokens.
    */
  var TokenKey: js.UndefOr[string] = js.native
  /**
    * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
    */
  var TokenKeyId: js.UndefOr[string] = js.native
}

object APNSChannelRequest {
  @scala.inline
  def apply(
    BundleId: string = null,
    Certificate: string = null,
    DefaultAuthenticationMethod: string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    PrivateKey: string = null,
    TeamId: string = null,
    TokenKey: string = null,
    TokenKeyId: string = null
  ): APNSChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey.asInstanceOf[js.Any])
    if (TeamId != null) __obj.updateDynamic("TeamId")(TeamId.asInstanceOf[js.Any])
    if (TokenKey != null) __obj.updateDynamic("TokenKey")(TokenKey.asInstanceOf[js.Any])
    if (TokenKeyId != null) __obj.updateDynamic("TokenKeyId")(TokenKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSChannelRequest]
  }
}

