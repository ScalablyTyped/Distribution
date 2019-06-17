package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderStyle: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[java.lang.String] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    borderStyle: java.lang.String = null,
    borderWidth: java.lang.String = null
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.asInstanceOf[Border]
  }
}

