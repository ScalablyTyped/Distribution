package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PorCommitment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofporCommitment extends StObject {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean
  
  def decode(keyVal: KeyValue): PorCommitment
  
  def encode(data: PorCommitment): KeyValue
  
  val expected: /* "string" */ String
}
object TypeofporCommitment {
  
  inline def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean,
    decode: KeyValue => PorCommitment,
    encode: PorCommitment => KeyValue,
    expected: /* "string" */ String
  ): TypeofporCommitment = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofporCommitment]
  }
  
  extension [Self <: TypeofporCommitment](x: Self) {
    
    inline def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => PorCommitment): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: PorCommitment => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "string" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
