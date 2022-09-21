package typings.bip174

import typings.bip174.interfacesMod.GlobalXpub
import typings.bip174.interfacesMod.KeyValue
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalXpubMod {
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAddToArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], dupeSet.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean]
  
  inline def decode(keyVal: KeyValue): GlobalXpub = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[GlobalXpub]
  
  inline def encode(data: GlobalXpub): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "expected")
  @js.native
  val expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String = js.native
}
