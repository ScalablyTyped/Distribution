package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  /** Class to apply to the line. */
  var `class`: js.UndefOr[String] = js.undefined
  var value_x1: js.UndefOr[Double] = js.undefined
  var value_x2: js.UndefOr[Double] = js.undefined
  var value_y1: js.UndefOr[Double] = js.undefined
  var value_y2: js.UndefOr[Double] = js.undefined
}

object AnonClass {
  @scala.inline
  def apply(
    `class`: String = null,
    value_x1: Int | Double = null,
    value_x2: Int | Double = null,
    value_y1: Int | Double = null,
    value_y2: Int | Double = null
  ): AnonClass = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (value_x1 != null) __obj.updateDynamic("value_x1")(value_x1.asInstanceOf[js.Any])
    if (value_x2 != null) __obj.updateDynamic("value_x2")(value_x2.asInstanceOf[js.Any])
    if (value_y1 != null) __obj.updateDynamic("value_y1")(value_y1.asInstanceOf[js.Any])
    if (value_y2 != null) __obj.updateDynamic("value_y2")(value_y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

