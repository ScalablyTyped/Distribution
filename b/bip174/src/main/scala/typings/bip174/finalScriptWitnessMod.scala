package typings.bip174

import typings.bip174.interfacesMod.FinalScriptWitness
import typings.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalScriptWitnessMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "decode")
  @js.native
  def decode(keyVal: KeyValue): FinalScriptWitness = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "encode")
  @js.native
  def encode(data: FinalScriptWitness): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
