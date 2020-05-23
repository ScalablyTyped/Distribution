package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  /** Class to apply to the line. */
  var `class`: js.UndefOr[String] = js.undefined
  var value_x1: js.UndefOr[Double] = js.undefined
  var value_x2: js.UndefOr[Double] = js.undefined
  var value_y1: js.UndefOr[Double] = js.undefined
  var value_y2: js.UndefOr[Double] = js.undefined
}

object Class {
  @scala.inline
  def apply(
    `class`: String = null,
    value_x1: js.UndefOr[Double] = js.undefined,
    value_x2: js.UndefOr[Double] = js.undefined,
    value_y1: js.UndefOr[Double] = js.undefined,
    value_y2: js.UndefOr[Double] = js.undefined
  ): Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(value_x1)) __obj.updateDynamic("value_x1")(value_x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value_x2)) __obj.updateDynamic("value_x2")(value_x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value_y1)) __obj.updateDynamic("value_y1")(value_y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value_y2)) __obj.updateDynamic("value_y2")(value_y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

