package typings.bip174

import typings.bip174.interfacesMod.FinalScriptSig
import typings.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalScriptSigMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "decode")
  @js.native
  def decode(keyVal: KeyValue): FinalScriptSig = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "encode")
  @js.native
  def encode(data: FinalScriptSig): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
