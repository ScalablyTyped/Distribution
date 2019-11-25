package typings.bip32.typesBip32Mod

import typings.bip32.Anon_Private
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var bech32: js.UndefOr[String] = js.undefined
  var bip32: Anon_Private
  var messagePrefix: js.UndefOr[String] = js.undefined
  var pubKeyHash: js.UndefOr[Double] = js.undefined
  var scriptHash: js.UndefOr[Double] = js.undefined
  var wif: Double
}

object Network {
  @scala.inline
  def apply(
    bip32: Anon_Private,
    wif: Double,
    bech32: String = null,
    messagePrefix: String = null,
    pubKeyHash: Int | Double = null,
    scriptHash: Int | Double = null
  ): Network = {
    val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
    if (bech32 != null) __obj.updateDynamic("bech32")(bech32.asInstanceOf[js.Any])
    if (messagePrefix != null) __obj.updateDynamic("messagePrefix")(messagePrefix.asInstanceOf[js.Any])
    if (pubKeyHash != null) __obj.updateDynamic("pubKeyHash")(pubKeyHash.asInstanceOf[js.Any])
    if (scriptHash != null) __obj.updateDynamic("scriptHash")(scriptHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

