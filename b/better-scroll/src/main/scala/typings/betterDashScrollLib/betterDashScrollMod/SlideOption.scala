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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("el")(el)
    __obj.updateDynamic("listenFlick")(listenFlick)
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("stepX")(stepX)
    __obj.updateDynamic("stepY")(stepY)
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[SlideOption]
  }
}

