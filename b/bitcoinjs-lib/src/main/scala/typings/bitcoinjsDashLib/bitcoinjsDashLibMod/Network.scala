package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_Private
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var bech32: js.UndefOr[String] = js.undefined
  var bip32: Anon_Private
  var messagePrefix: String
  var pubKeyHash: Double
  var scriptHash: Double
  var wif: Double
}

object Network {
  @scala.inline
  def apply(
    bip32: Anon_Private,
    messagePrefix: String,
    pubKeyHash: Double,
    scriptHash: Double,
    wif: Double,
    bech32: String = null
  ): Network = {
    val __obj = js.Dynamic.literal(bip32 = bip32, messagePrefix = messagePrefix, pubKeyHash = pubKeyHash, scriptHash = scriptHash, wif = wif)
    if (bech32 != null) __obj.updateDynamic("bech32")(bech32)
    __obj.asInstanceOf[Network]
  }
}

