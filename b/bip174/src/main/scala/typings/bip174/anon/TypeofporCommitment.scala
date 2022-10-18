package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PorCommitment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofporCommitment extends StObject {
  
  def canAdd(currentData: Any, newData: Any): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean
  
  def decode(keyVal: KeyValue): PorCommitment
  
  def encode(data: PorCommitment): KeyValue
  
  val expected: /* "string" */ String
}
object TypeofporCommitment {
  
  inline def apply(
    canAdd: (Any, Any) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean,
    decode: KeyValue => PorCommitment,
    encode: PorCommitment => KeyValue,
    expected: /* "string" */ String
  ): TypeofporCommitment = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofporCommitment]
  }
  
  extension [Self <: TypeofporCommitment](x: Self) {
    
    inline def setCanAdd(value: (Any, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => PorCommitment): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: PorCommitment => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "string" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
