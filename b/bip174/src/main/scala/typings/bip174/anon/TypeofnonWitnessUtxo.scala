package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.NonWitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofnonWitnessUtxo extends StObject {
  
  def canAdd(currentData: Any, newData: Any): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean
  
  def decode(keyVal: KeyValue): NonWitnessUtxo
  
  def encode(data: NonWitnessUtxo): KeyValue
  
  val expected: /* "Buffer" */ String
}
object TypeofnonWitnessUtxo {
  
  inline def apply(
    canAdd: (Any, Any) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean,
    decode: KeyValue => NonWitnessUtxo,
    encode: NonWitnessUtxo => KeyValue,
    expected: /* "Buffer" */ String
  ): TypeofnonWitnessUtxo = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnonWitnessUtxo]
  }
  
  extension [Self <: TypeofnonWitnessUtxo](x: Self) {
    
    inline def setCanAdd(value: (Any, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => NonWitnessUtxo): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: NonWitnessUtxo => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "Buffer" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
