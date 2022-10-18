package typings.bip174.anon

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAdd extends StObject {
  
  def canAdd(currentData: Any, newData: Any): Boolean
  
  def check(data: Any): /* is node.buffer.<global>.Buffer */ Boolean
  
  def decode(keyVal: KeyValue): Buffer
  
  def encode(data: Buffer): KeyValue
  
  var expected: String
}
object CanAdd {
  
  inline def apply(
    canAdd: (Any, Any) => Boolean,
    check: Any => /* is node.buffer.<global>.Buffer */ Boolean,
    decode: KeyValue => Buffer,
    encode: Buffer => KeyValue,
    expected: String
  ): CanAdd = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAdd]
  }
  
  extension [Self <: CanAdd](x: Self) {
    
    inline def setCanAdd(value: (Any, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: Any => /* is node.buffer.<global>.Buffer */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => Buffer): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: Buffer => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
