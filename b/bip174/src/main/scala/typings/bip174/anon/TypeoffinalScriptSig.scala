package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.FinalScriptSig
import typings.bip174.srcLibInterfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffinalScriptSig extends StObject {
  
  def canAdd(currentData: Any, newData: Any): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean
  
  def decode(keyVal: KeyValue): FinalScriptSig
  
  def encode(data: FinalScriptSig): KeyValue
  
  val expected: /* "Buffer" */ String
}
object TypeoffinalScriptSig {
  
  inline def apply(
    canAdd: (Any, Any) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean,
    decode: KeyValue => FinalScriptSig,
    encode: FinalScriptSig => KeyValue,
    expected: /* "Buffer" */ String
  ): TypeoffinalScriptSig = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoffinalScriptSig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeoffinalScriptSig] (val x: Self) extends AnyVal {
    
    inline def setCanAdd(value: (Any, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => FinalScriptSig): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: FinalScriptSig => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "Buffer" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
