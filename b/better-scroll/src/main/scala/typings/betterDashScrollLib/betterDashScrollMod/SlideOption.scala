package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideOption extends js.Object {
  var el: stdLib.Element
  var listenFlick: scala.Boolean
  var loop: scala.Boolean
  var speed: scala.Double
  var stepX: scala.Double
  var stepY: scala.Double
  var threshold: scala.Double
}

object SlideOption {
  @scala.inline
  def apply(
    el: stdLib.Element,
    listenFlick: scala.Boolean,
    loop: scala.Boolean,
    speed: scala.Double,
    stepX: scala.Double,
    stepY: scala.Double,
    threshold: scala.Double
  ): SlideOption = {
    val __obj = js.Dynamic.literal(el = el, listenFlick = listenFlick, loop = loop, speed = speed, stepX = stepX, stepY = stepY, threshold = threshold)
  
    __obj.asInstanceOf[SlideOption]
  }
}

