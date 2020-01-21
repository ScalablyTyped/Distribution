package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccepttlschannelid extends js.Object {
  /**
    * Determines if messages sent via `runtime.connect` or `runtime.sendMessage`
    * are allowed to set `runtime.MessageSender.tlsChannelId`.
    */
  var accept_tls_channel_id: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of extensions or apps that are allowed to connect.
    * If left empty or unspecified, no extensions or apps can connect.
    * The wildcard '*' will allow all extensions and apps to connect.
    */
  var id: js.Array[String]
  /**
    * The URL patterns for web pages that are allowed to connect.
    * This does not affect content scripts.
    * If left empty or unspecified, no web pages can connect.
    */
  var matches: js.Array[String]
}

object AnonAccepttlschannelid {
  @scala.inline
  def apply(
    id: js.Array[String],
    matches: js.Array[String],
    accept_tls_channel_id: js.UndefOr[Boolean] = js.undefined
  ): AnonAccepttlschannelid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    if (!js.isUndefined(accept_tls_channel_id)) __obj.updateDynamic("accept_tls_channel_id")(accept_tls_channel_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepttlschannelid]
  }
}

