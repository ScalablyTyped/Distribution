package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.SighashType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sighashTypeMod {
  
  @JSImport("bip174/src/lib/converter/input/sighashType", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/sighashType", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/sighashType", "decode")
  @js.native
  def decode(keyVal: KeyValue): SighashType = js.native
  
  @JSImport("bip174/src/lib/converter/input/sighashType", "encode")
  @js.native
  def encode(data: SighashType): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/sighashType", "expected")
  @js.native
  val expected: /* "number" */ String = js.native
}
