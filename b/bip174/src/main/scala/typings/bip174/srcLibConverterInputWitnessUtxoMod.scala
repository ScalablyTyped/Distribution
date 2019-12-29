package typings.bip174

import typings.bip174.bip174Strings.`Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.WitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/witnessUtxo", JSImport.Namespace)
@js.native
object srcLibConverterInputWitnessUtxoMod extends js.Object {
  val expected: `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket` = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean = js.native
  def decode(keyVal: KeyValue): WitnessUtxo = js.native
  def encode(data: WitnessUtxo): KeyValue = js.native
}

