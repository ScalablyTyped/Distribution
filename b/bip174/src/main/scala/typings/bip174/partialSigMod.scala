package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PartialSig
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialSigMod {
  
  @JSImport("bip174/src/lib/converter/input/partialSig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAddToArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], dupeSet.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean]
  
  inline def decode(keyVal: KeyValue): PartialSig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[PartialSig]
  
  inline def encode(pSig: PartialSig): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(pSig.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "expected")
  @js.native
  val expected: /* "{ pubkey: Buffer; signature: Buffer; }" */ String = js.native
}
