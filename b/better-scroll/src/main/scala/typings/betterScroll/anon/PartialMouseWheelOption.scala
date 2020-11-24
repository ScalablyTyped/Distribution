package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<better-scroll.better-scroll.MouseWheelOption> */
@js.native
trait PartialMouseWheelOption extends js.Object {
  
  var easeTime: js.UndefOr[Double] = js.native
  
  var invert: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object PartialMouseWheelOption {
  
  @scala.inline
  def apply(): PartialMouseWheelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMouseWheelOption]
  }
  
  @scala.inline
  implicit class PartialMouseWheelOptionOps[Self <: PartialMouseWheelOption] (val x: Self) extends AnyVal {
    
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
    def setEaseTime(value: Double): Self = this.set("easeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseTime: Self = this.set("easeTime", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
}
