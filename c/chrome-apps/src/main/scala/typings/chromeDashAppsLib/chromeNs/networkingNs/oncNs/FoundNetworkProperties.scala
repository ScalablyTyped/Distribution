package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundNetworkProperties extends js.Object {
  /** The network operator's long-format name. */
  var LongName: js.UndefOr[java.lang.String] = js.undefined
  /** Network ID. */
  var NetworkId: java.lang.String
  /** The network operator's short-format name. */
  var ShortName: js.UndefOr[java.lang.String] = js.undefined
  /** Network availability. */
  var Status: java.lang.String
  /** Access technology used by the network. */
  var Technology: java.lang.String
}

object FoundNetworkProperties {
  @scala.inline
  def apply(
    NetworkId: java.lang.String,
    Status: java.lang.String,
    Technology: java.lang.String,
    LongName: java.lang.String = null,
    ShortName: java.lang.String = null
  ): FoundNetworkProperties = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, Status = Status, Technology = Technology)
    if (LongName != null) __obj.updateDynamic("LongName")(LongName)
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName)
    __obj.asInstanceOf[FoundNetworkProperties]
  }
}

