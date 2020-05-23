package typings.d3pie.anon

import typings.d3pie.d3pieStrings.back
import typings.d3pie.d3pieStrings.bounce
import typings.d3pie.d3pieStrings.elastic
import typings.d3pie.d3pieStrings.linear
import typings.d3pie.d3pieStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var effect: js.UndefOr[none | linear | bounce | elastic | back] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(
    effect: none | linear | bounce | elastic | back = null,
    size: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): Size = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

