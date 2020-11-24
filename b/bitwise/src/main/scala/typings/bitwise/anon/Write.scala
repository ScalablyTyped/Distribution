package typings.bitwise.anon

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Write extends js.Object {
  
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
}
object Write {
  
  @scala.inline
  def apply(read: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit], write: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Write = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
    
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
    def setRead(value: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit]): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
