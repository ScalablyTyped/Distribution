package typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSSandboxChannelRequest extends js.Object {
  /**
    * The bundle id used for APNs Tokens.
    */
  var BundleId: js.UndefOr[String] = js.undefined
  /**
    * The distribution certificate from Apple.
    */
  var Certificate: js.UndefOr[String] = js.undefined
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The certificate private key.
    */
  var PrivateKey: js.UndefOr[String] = js.undefined
  /**
    * The team id used for APNs Tokens.
    */
  var TeamId: js.UndefOr[String] = js.undefined
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKey: js.UndefOr[String] = js.undefined
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKeyId: js.UndefOr[String] = js.undefined
}

object APNSSandboxChannelRequest {
  @scala.inline
  def apply(
    BundleId: String = null,
    Certificate: String = null,
    DefaultAuthenticationMethod: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    PrivateKey: String = null,
    TeamId: String = null,
    TokenKey: String = null,
    TokenKeyId: String = null
  ): APNSSandboxChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey.asInstanceOf[js.Any])
    if (TeamId != null) __obj.updateDynamic("TeamId")(TeamId.asInstanceOf[js.Any])
    if (TokenKey != null) __obj.updateDynamic("TokenKey")(TokenKey.asInstanceOf[js.Any])
    if (TokenKeyId != null) __obj.updateDynamic("TokenKeyId")(TokenKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSSandboxChannelRequest]
  }
}

