package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.TapScriptSig
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftapScriptSig extends StObject {
  
  def canAddToArray(array: js.Array[TapScriptSig], item: TapScriptSig, dupeSet: Set[String]): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapScriptSig */ Boolean
  
  def decode(keyVal: KeyValue): TapScriptSig
  
  def encode(tSig: TapScriptSig): KeyValue
  
  val expected: /* "{ pubkey: Buffer; leafHash: Buffer; signature: Buffer; }" */ String
}
object TypeoftapScriptSig {
  
  inline def apply(
    canAddToArray: (js.Array[TapScriptSig], TapScriptSig, Set[String]) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.TapScriptSig */ Boolean,
    decode: KeyValue => TapScriptSig,
    encode: TapScriptSig => KeyValue,
    expected: /* "{ pubkey: Buffer; leafHash: Buffer; signature: Buffer; }" */ String
  ): TypeoftapScriptSig = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftapScriptSig]
  }
  
  extension [Self <: TypeoftapScriptSig](x: Self) {
    
    inline def setCanAddToArray(value: (js.Array[TapScriptSig], TapScriptSig, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.TapScriptSig */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => TapScriptSig): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: TapScriptSig => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "{ pubkey: Buffer; leafHash: Buffer; signature: Buffer; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
