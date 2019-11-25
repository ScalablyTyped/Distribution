package typings.betterDashScroll.betterDashScrollMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideOption extends js.Object {
  var el: Element
  var listenFlick: Boolean
  var loop: Boolean
  var speed: Double
  var stepX: Double
  var stepY: Double
  var threshold: Double
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
}

