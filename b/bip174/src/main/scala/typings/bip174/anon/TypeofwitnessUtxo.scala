package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofwitnessUtxo extends StObject {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean
  
  def decode(keyVal: KeyValue): WitnessUtxo
  
  def encode(data: WitnessUtxo): KeyValue
  
  val expected: /* "{ script: Buffer; value: number; }" */ String
}
object TypeofwitnessUtxo {
  
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean,
    decode: KeyValue => WitnessUtxo,
    encode: WitnessUtxo => KeyValue,
    expected: /* "{ script: Buffer; value: number; }" */ String
  ): TypeofwitnessUtxo = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwitnessUtxo]
  }
  
  @scala.inline
  implicit class TypeofwitnessUtxoMutableBuilder[Self <: TypeofwitnessUtxo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => WitnessUtxo): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: WitnessUtxo => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: /* "{ script: Buffer; value: number; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
