package typings.browserfs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbuffer extends js.Object {
  
  var Buffer: TypeofBuffer_ = js.native
}
object Typeofbuffer {
  
  @scala.inline
  def apply(Buffer: TypeofBuffer_): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbuffer]
  }
  
  @scala.inline
  implicit class TypeofbufferOps[Self <: Typeofbuffer] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: TypeofBuffer_): Self = this.set("Buffer", value.asInstanceOf[js.Any])
  }
}
