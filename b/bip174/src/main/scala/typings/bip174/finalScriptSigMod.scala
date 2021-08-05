package typings.bip174

import typings.bip174.interfacesMod.FinalScriptSig
import typings.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalScriptSigMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: js.Any, newData: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean]
  
  inline def decode(keyVal: KeyValue): FinalScriptSig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[FinalScriptSig]
  
  inline def encode(data: FinalScriptSig): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
