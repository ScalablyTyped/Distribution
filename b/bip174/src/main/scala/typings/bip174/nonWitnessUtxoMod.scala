package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.NonWitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", JSImport.Namespace)
@js.native
object nonWitnessUtxoMod extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean = js.native
  
  def decode(keyVal: KeyValue): NonWitnessUtxo = js.native
  
  def encode(data: NonWitnessUtxo): KeyValue = js.native
  
  val expected: /* "Buffer" */ String = js.native
}
