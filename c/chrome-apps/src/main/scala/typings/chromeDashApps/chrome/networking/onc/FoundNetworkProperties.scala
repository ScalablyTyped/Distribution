package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundNetworkProperties extends js.Object {
  /** The network operator's long-format name. */
  var LongName: js.UndefOr[String] = js.undefined
  /** Network ID. */
  var NetworkId: String
  /** The network operator's short-format name. */
  var ShortName: js.UndefOr[String] = js.undefined
  /** Network availability. */
  var Status: String
  /** Access technology used by the network. */
  var Technology: String
}

object FoundNetworkProperties {
  @scala.inline
  def apply(
    NetworkId: String,
    Status: String,
    Technology: String,
    LongName: String = null,
    ShortName: String = null
  ): FoundNetworkProperties = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, Status = Status, Technology = Technology)
    if (LongName != null) __obj.updateDynamic("LongName")(LongName)
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName)
    __obj.asInstanceOf[FoundNetworkProperties]
  }
}

