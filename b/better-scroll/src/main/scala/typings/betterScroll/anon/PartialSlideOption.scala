package typings.betterScroll.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<better-scroll.better-scroll.SlideOption> */
@js.native
trait PartialSlideOption extends js.Object {
  
  var el: js.UndefOr[Element] = js.native
  
  var listenFlick: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var stepX: js.UndefOr[Double] = js.native
  
  var stepY: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object PartialSlideOption {
  
  @scala.inline
  def apply(): PartialSlideOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlideOption]
  }
  
  @scala.inline
  implicit class PartialSlideOptionOps[Self <: PartialSlideOption] (val x: Self) extends AnyVal {
    
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
    def setEl(value: Element): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setListenFlick(value: Boolean): Self = this.set("listenFlick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenFlick: Self = this.set("listenFlick", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStepX(value: Double): Self = this.set("stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepX: Self = this.set("stepX", js.undefined)
    
    @scala.inline
    def setStepY(value: Double): Self = this.set("stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepY: Self = this.set("stepY", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
