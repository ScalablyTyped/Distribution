package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var bech32: js.UndefOr[java.lang.String] = js.undefined
  var bip32: bitcoinjsDashLibLib.Anon_Private
  var messagePrefix: java.lang.String
  var pubKeyHash: scala.Double
  var scriptHash: scala.Double
  var wif: scala.Double
}

object Network {
  @scala.inline
  def apply(
    bip32: bitcoinjsDashLibLib.Anon_Private,
    messagePrefix: java.lang.String,
    pubKeyHash: scala.Double,
    scriptHash: scala.Double,
    wif: scala.Double,
    bech32: java.lang.String = null
  ): Network = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bip32")(bip32)
    __obj.updateDynamic("messagePrefix")(messagePrefix)
    __obj.updateDynamic("pubKeyHash")(pubKeyHash)
    __obj.updateDynamic("scriptHash")(scriptHash)
    __obj.updateDynamic("wif")(wif)
    if (bech32 != null) __obj.updateDynamic("bech32")(bech32)
    __obj.asInstanceOf[Network]
  }
}

