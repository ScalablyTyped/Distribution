package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepttlschannelid extends js.Object {
  /**
    * Determines if messages sent via `runtime.connect` or `runtime.sendMessage`
    * are allowed to set `runtime.MessageSender.tlsChannelId`.
    */
  var accept_tls_channel_id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The IDs of extensions or apps that are allowed to connect.
    * If left empty or unspecified, no extensions or apps can connect.
    * The wildcard '*' will allow all extensions and apps to connect.
    */
  var id: js.Array[java.lang.String]
  /**
    * The URL patterns for web pages that are allowed to connect.
    * This does not affect content scripts.
    * If left empty or unspecified, no web pages can connect.
    */
  var matches: js.Array[java.lang.String]
}

object Anon_Accepttlschannelid {
  @scala.inline
  def apply(
    id: js.Array[java.lang.String],
    matches: js.Array[java.lang.String],
    accept_tls_channel_id: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Accepttlschannelid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("matches")(matches)
    if (!js.isUndefined(accept_tls_channel_id)) __obj.updateDynamic("accept_tls_channel_id")(accept_tls_channel_id)
    __obj.asInstanceOf[Anon_Accepttlschannelid]
  }
}

