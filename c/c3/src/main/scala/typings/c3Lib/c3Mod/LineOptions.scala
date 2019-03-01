package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | scala.Double | stdLib.Date
}

object LineOptions {
  @scala.inline
  def apply(
    value: java.lang.String | scala.Double | stdLib.Date,
    axis: java.lang.String = null,
    `class`: java.lang.String = null,
    position: java.lang.String = null,
    text: java.lang.String = null
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LineOptions]
  }
}

