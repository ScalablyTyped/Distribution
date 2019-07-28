package typings.bip32.bip32Mod

import typings.bip32.Anon_Private
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkType extends js.Object {
   // UInt8
  var bip32: Anon_Private
  var wif: Double
}

object NetworkType {
  @scala.inline
  def apply(bip32: Anon_Private, wif: Double): NetworkType = {
    val __obj = js.Dynamic.literal(bip32 = bip32, wif = wif)
  
    __obj.asInstanceOf[NetworkType]
  }
}

