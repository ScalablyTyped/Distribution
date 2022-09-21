package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.TapScriptSig
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapScriptSigMod {
  
  @JSImport("bip174/src/lib/converter/input/tapScriptSig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAddToArray(array: js.Array[TapScriptSig], item: TapScriptSig, dupeSet: Set[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAddToArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], dupeSet.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapScriptSig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.TapScriptSig */ Boolean]
  
  inline def decode(keyVal: KeyValue): TapScriptSig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[TapScriptSig]
  
  inline def encode(tSig: TapScriptSig): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tSig.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/tapScriptSig", "expected")
  @js.native
  val expected: /* "{ pubkey: Buffer; leafHash: Buffer; signature: Buffer; }" */ String = js.native
}
