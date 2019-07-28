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
    val __obj = js.Dynamic.literal(el = el, listenFlick = listenFlick, loop = loop, speed = speed, stepX = stepX, stepY = stepY, threshold = threshold)
  
    __obj.asInstanceOf[SlideOption]
  }
}

