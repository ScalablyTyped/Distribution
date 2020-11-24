package typings.contractProxyKit.anon

import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRLP extends js.Object {
  
  def decode(data: BytesLike): js.Any = js.native
  
  def encode(`object`: js.Any): String = js.native
}
object TypeofRLP {
  
  @scala.inline
  def apply(decode: BytesLike => js.Any, encode: js.Any => String): TypeofRLP = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[TypeofRLP]
  }
  
  @scala.inline
  implicit class TypeofRLPOps[Self <: TypeofRLP] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: BytesLike => js.Any): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.Any => String): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
