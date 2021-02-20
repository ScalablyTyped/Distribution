package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.NonWitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonWitnessUtxoMod {
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "decode")
  @js.native
  def decode(keyVal: KeyValue): NonWitnessUtxo = js.native
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "encode")
  @js.native
  def encode(data: NonWitnessUtxo): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
