package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/witnessUtxo", JSImport.Namespace)
@js.native
object witnessUtxoMod extends js.Object {
  val expected: /* "{ script: Buffer; value: number; }" */ String = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean = js.native
  def decode(keyVal: KeyValue): WitnessUtxo = js.native
  def encode(data: WitnessUtxo): KeyValue = js.native
}

