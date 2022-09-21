package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.TapLeafScript
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapLeafScriptMod {
  
  @JSImport("bip174/src/lib/converter/input/tapLeafScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAddToArray(array: js.Array[TapLeafScript], item: TapLeafScript, dupeSet: Set[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAddToArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], dupeSet.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapLeafScript */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.TapLeafScript */ Boolean]
  
  inline def decode(keyVal: KeyValue): TapLeafScript = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[TapLeafScript]
  
  inline def encode(tScript: TapLeafScript): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tScript.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/tapLeafScript", "expected")
  @js.native
  val expected: /* "{ controlBlock: Buffer; leafVersion: number, script: Buffer; }" */ String = js.native
}
