package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitcoin extends js.Object {
  var bitcoin: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network
  var testnet: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network
}

object Anon_Bitcoin {
  @scala.inline
  def apply(
    bitcoin: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network,
    testnet: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network
  ): Anon_Bitcoin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitcoin")(bitcoin)
    __obj.updateDynamic("testnet")(testnet)
    __obj.asInstanceOf[Anon_Bitcoin]
  }
}

