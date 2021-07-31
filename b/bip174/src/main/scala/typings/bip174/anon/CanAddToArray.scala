package typings.bip174.anon

import typings.bip174.interfacesMod.Bip32Derivation
import typings.bip174.interfacesMod.KeyValue
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAddToArray extends StObject {
  
  def canAddToArray(array: js.Array[Bip32Derivation], item: Bip32Derivation, dupeSet: Set[String]): Boolean
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean
  
  def decode(keyVal: KeyValue): Bip32Derivation
  
  def encode(data: Bip32Derivation): KeyValue
  
  var expected: String
}
object CanAddToArray {
  
  @scala.inline
  def apply(
    canAddToArray: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean,
    decode: KeyValue => Bip32Derivation,
    encode: Bip32Derivation => KeyValue,
    expected: String
  ): CanAddToArray = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddToArray]
  }
  
  @scala.inline
  implicit class CanAddToArrayMutableBuilder[Self <: CanAddToArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAddToArray(value: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => Bip32Derivation): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: Bip32Derivation => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
