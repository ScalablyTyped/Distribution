package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.GlobalXpub
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofglobalXpub extends StObject {
  
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean
  
  def decode(keyVal: KeyValue): GlobalXpub
  
  def encode(data: GlobalXpub): KeyValue
  
  val expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String
}
object TypeofglobalXpub {
  
  inline def apply(
    canAddToArray: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean,
    decode: KeyValue => GlobalXpub,
    encode: GlobalXpub => KeyValue,
    expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String
  ): TypeofglobalXpub = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofglobalXpub]
  }
  
  extension [Self <: TypeofglobalXpub](x: Self) {
    
    inline def setCanAddToArray(value: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => GlobalXpub): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: GlobalXpub => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
