package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.SighashType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter/input/sighashType", JSImport.Namespace)
@js.native
object sighashTypeMod extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean = js.native
  
  def decode(keyVal: KeyValue): SighashType = js.native
  
  def encode(data: SighashType): KeyValue = js.native
  
  val expected: /* "number" */ String = js.native
}
