package typings.bip174.anon

import typings.bip174.interfacesMod.FinalScriptSig
import typings.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoffinalScriptSig extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = js.native
  
  def decode(keyVal: KeyValue): FinalScriptSig = js.native
  
  def encode(data: FinalScriptSig): KeyValue = js.native
  
  val expected: /* "Buffer" */ String = js.native
}
object TypeoffinalScriptSig {
  
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean,
    decode: KeyValue => FinalScriptSig,
    encode: FinalScriptSig => KeyValue,
    expected: /* "Buffer" */ String
  ): TypeoffinalScriptSig = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoffinalScriptSig]
  }
  
  @scala.inline
  implicit class TypeoffinalScriptSigOps[Self <: TypeoffinalScriptSig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = this.set("canAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => FinalScriptSig): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: FinalScriptSig => KeyValue): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: /* "Buffer" */ String): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
}
