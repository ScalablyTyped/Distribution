package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessScript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decode extends StObject {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean
  
  def decode(keyVal: KeyValue): WitnessScript
  
  def encode(data: WitnessScript): KeyValue
  
  var expected: String
}
object Decode {
  
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean,
    decode: KeyValue => WitnessScript,
    encode: WitnessScript => KeyValue,
    expected: String
  ): Decode = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  
  @scala.inline
  implicit class DecodeMutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => WitnessScript): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: WitnessScript => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
