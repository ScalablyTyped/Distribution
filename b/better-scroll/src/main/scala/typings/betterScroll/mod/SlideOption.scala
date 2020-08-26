package typings.betterScroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideOption extends js.Object {
  var el: Element = js.native
  var listenFlick: Boolean = js.native
  var loop: Boolean = js.native
  var speed: Double = js.native
  var stepX: Double = js.native
  var stepY: Double = js.native
  var threshold: Double = js.native
}

object SlideOption {
  @scala.inline
  def apply(
    el: Element,
    listenFlick: Boolean,
    loop: Boolean,
    speed: Double,
    stepX: Double,
    stepY: Double,
    threshold: Double
  ): SlideOption = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], listenFlick = listenFlick.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], stepX = stepX.asInstanceOf[js.Any], stepY = stepY.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideOption]
  }
  @scala.inline
  implicit class SlideOptionOps[Self <: SlideOption] (val x: Self) extends AnyVal {
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
    def setListenFlick(value: Boolean): Self = this.set("listenFlick", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepX(value: Double): Self = this.set("stepX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepY(value: Double): Self = this.set("stepY", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
  
}

