package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.TapLeafScript
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftapLeafScript extends StObject {
  
  def canAddToArray(array: js.Array[TapLeafScript], item: TapLeafScript, dupeSet: Set[String]): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapLeafScript */ Boolean
  
  def decode(keyVal: KeyValue): TapLeafScript
  
  def encode(tScript: TapLeafScript): KeyValue
  
  val expected: /* "{ controlBlock: Buffer; leafVersion: number, script: Buffer; }" */ String
}
object TypeoftapLeafScript {
  
  inline def apply(
    canAddToArray: (js.Array[TapLeafScript], TapLeafScript, Set[String]) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.TapLeafScript */ Boolean,
    decode: KeyValue => TapLeafScript,
    encode: TapLeafScript => KeyValue,
    expected: /* "{ controlBlock: Buffer; leafVersion: number, script: Buffer; }" */ String
  ): TypeoftapLeafScript = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftapLeafScript]
  }
  
  extension [Self <: TypeoftapLeafScript](x: Self) {
    
    inline def setCanAddToArray(value: (js.Array[TapLeafScript], TapLeafScript, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.TapLeafScript */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => TapLeafScript): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: TapLeafScript => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "{ controlBlock: Buffer; leafVersion: number, script: Buffer; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
