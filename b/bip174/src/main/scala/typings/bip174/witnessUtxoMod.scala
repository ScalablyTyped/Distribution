package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnessUtxoMod {
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "decode")
  @js.native
  def decode(keyVal: KeyValue): WitnessUtxo = js.native
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "encode")
  @js.native
  def encode(data: WitnessUtxo): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "expected")
  @js.native
  val expected: /* "{ script: Buffer; value: number; }" */ String = js.native
}
