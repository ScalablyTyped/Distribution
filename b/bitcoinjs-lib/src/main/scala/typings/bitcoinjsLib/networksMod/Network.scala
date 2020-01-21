package typings.bitcoinjsLib.networksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var bech32: String
  var bip32: Bip32
  var messagePrefix: String
  var pubKeyHash: Double
  var scriptHash: Double
  var wif: Double
}

object Network {
  @scala.inline
  def apply(
    bech32: String,
    bip32: Bip32,
    messagePrefix: String,
    pubKeyHash: Double,
    scriptHash: Double,
    wif: Double
  ): Network = {
    val __obj = js.Dynamic.literal(bech32 = bech32.asInstanceOf[js.Any], bip32 = bip32.asInstanceOf[js.Any], messagePrefix = messagePrefix.asInstanceOf[js.Any], pubKeyHash = pubKeyHash.asInstanceOf[js.Any], scriptHash = scriptHash.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Network]
  }
}

