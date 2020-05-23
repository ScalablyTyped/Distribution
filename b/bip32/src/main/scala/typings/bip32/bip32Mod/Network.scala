package typings.bip32.bip32Mod

import typings.bip32.anon.Private
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var bech32: js.UndefOr[String] = js.undefined
  var bip32: Private
  var messagePrefix: js.UndefOr[String] = js.undefined
  var pubKeyHash: js.UndefOr[Double] = js.undefined
  var scriptHash: js.UndefOr[Double] = js.undefined
  var wif: Double
}

object Network {
  @scala.inline
  def apply(
    bip32: Private,
    wif: Double,
    bech32: String = null,
    messagePrefix: String = null,
    pubKeyHash: js.UndefOr[Double] = js.undefined,
    scriptHash: js.UndefOr[Double] = js.undefined
  ): Network = {
    val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
    if (bech32 != null) __obj.updateDynamic("bech32")(bech32.asInstanceOf[js.Any])
    if (messagePrefix != null) __obj.updateDynamic("messagePrefix")(messagePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(pubKeyHash)) __obj.updateDynamic("pubKeyHash")(pubKeyHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scriptHash)) __obj.updateDynamic("scriptHash")(scriptHash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

