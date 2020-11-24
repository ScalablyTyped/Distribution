package typings.bip174

import typings.bip174.interfacesMod.FinalScriptSig
import typings.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter/input/finalScriptSig", JSImport.Namespace)
@js.native
object finalScriptSigMod extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = js.native
  
  def decode(keyVal: KeyValue): FinalScriptSig = js.native
  
  def encode(data: FinalScriptSig): KeyValue = js.native
  
  val expected: /* "Buffer" */ String = js.native
}
