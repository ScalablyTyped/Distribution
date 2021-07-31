package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAdd extends StObject {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  
  def check(data: js.Any): /* is node.Buffer */ Boolean
  
  def decode(keyVal: KeyValue): Buffer
  
  def encode(data: Buffer): KeyValue
  
  var expected: String
}
object CanAdd {
  
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is node.Buffer */ Boolean,
    decode: KeyValue => Buffer,
    encode: Buffer => KeyValue,
    expected: String
  ): CanAdd = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAdd]
  }
  
  @scala.inline
  implicit class CanAddMutableBuilder[Self <: CanAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is node.Buffer */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => Buffer): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: Buffer => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
