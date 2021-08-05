package typings.bip174.anon

import typings.bip174.interfacesMod.FinalScriptWitness
import typings.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffinalScriptWitness extends StObject {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean
  
  def decode(keyVal: KeyValue): FinalScriptWitness
  
  def encode(data: FinalScriptWitness): KeyValue
  
  val expected: /* "Buffer" */ String
}
object TypeoffinalScriptWitness {
  
  inline def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean,
    decode: KeyValue => FinalScriptWitness,
    encode: FinalScriptWitness => KeyValue,
    expected: /* "Buffer" */ String
  ): TypeoffinalScriptWitness = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoffinalScriptWitness]
  }
  
  extension [Self <: TypeoffinalScriptWitness](x: Self) {
    
    inline def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => FinalScriptWitness): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: FinalScriptWitness => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "Buffer" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
