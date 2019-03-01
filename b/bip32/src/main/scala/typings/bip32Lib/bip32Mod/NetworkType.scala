package typings
package bip32Lib.bip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkType extends js.Object {
   // UInt8
  var bip32: bip32Lib.Anon_Private
  var wif: scala.Double
}

object NetworkType {
  @scala.inline
  def apply(bip32: bip32Lib.Anon_Private, wif: scala.Double): NetworkType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bip32")(bip32)
    __obj.updateDynamic("wif")(wif)
    __obj.asInstanceOf[NetworkType]
  }
}

