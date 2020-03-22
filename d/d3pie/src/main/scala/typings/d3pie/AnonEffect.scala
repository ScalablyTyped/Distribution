package typings.d3pie

import typings.d3pie.d3pieStrings.default
import typings.d3pie.d3pieStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffect extends js.Object {
  var effect: js.UndefOr[none | default] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnonEffect {
  @scala.inline
  def apply(effect: none | default = null, speed: Int | Double = null): AnonEffect = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffect]
  }
}

