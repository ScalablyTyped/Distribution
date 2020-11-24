package typings.brorand.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rand extends js.Object {
  
  def getByte(): Double = js.native
}
object rand {
  
  @scala.inline
  def apply(getByte: () => Double): rand = {
    val __obj = js.Dynamic.literal(getByte = js.Any.fromFunction0(getByte))
    __obj.asInstanceOf[rand]
  }
  
  @scala.inline
  implicit class randOps[Self <: rand] (val x: Self) extends AnyVal {
    
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
    def setGetByte(value: () => Double): Self = this.set("getByte", js.Any.fromFunction0(value))
  }
}
