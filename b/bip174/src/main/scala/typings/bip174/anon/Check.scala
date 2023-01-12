package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.TapBip32Derivation
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  def canAddToArray(array: js.Array[TapBip32Derivation], item: TapBip32Derivation, dupeSet: Set[String]): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapBip32Derivation */ Boolean
  
  def decode(keyVal: KeyValue): TapBip32Derivation
  
  def encode(data: TapBip32Derivation): KeyValue
  
  var expected: String
}
object Check {
  
  inline def apply(
    canAddToArray: (js.Array[TapBip32Derivation], TapBip32Derivation, Set[String]) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.TapBip32Derivation */ Boolean,
    decode: KeyValue => TapBip32Derivation,
    encode: TapBip32Derivation => KeyValue,
    expected: String
  ): Check = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    inline def setCanAddToArray(value: (js.Array[TapBip32Derivation], TapBip32Derivation, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.TapBip32Derivation */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => TapBip32Derivation): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: TapBip32Derivation => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
