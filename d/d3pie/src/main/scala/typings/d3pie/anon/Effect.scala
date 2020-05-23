package typings.d3pie.anon

import typings.d3pie.d3pieStrings.default
import typings.d3pie.d3pieStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  var effect: js.UndefOr[none | default] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Effect {
  @scala.inline
  def apply(effect: none | default = null, speed: js.UndefOr[Double] = js.undefined): Effect = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
}

