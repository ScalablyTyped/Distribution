package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PartialSig
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpartialSig extends StObject {
  
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean
  
  def decode(keyVal: KeyValue): PartialSig
  
  def encode(pSig: PartialSig): KeyValue
  
  val expected: /* "{ pubkey: Buffer; signature: Buffer; }" */ String
}
object TypeofpartialSig {
  
  inline def apply(
    canAddToArray: (js.Array[PartialSig], PartialSig, Set[String]) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean,
    decode: KeyValue => PartialSig,
    encode: PartialSig => KeyValue,
    expected: /* "{ pubkey: Buffer; signature: Buffer; }" */ String
  ): TypeofpartialSig = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpartialSig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofpartialSig] (val x: Self) extends AnyVal {
    
    inline def setCanAddToArray(value: (js.Array[PartialSig], PartialSig, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => PartialSig): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: PartialSig => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "{ pubkey: Buffer; signature: Buffer; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
