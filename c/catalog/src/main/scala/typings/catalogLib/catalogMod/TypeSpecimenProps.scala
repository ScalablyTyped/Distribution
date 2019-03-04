package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSpecimenProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: java.lang.String
  var headings: js.Array[java.lang.String] | js.Array[scala.Double]
  var style: js.UndefOr[java.lang.String] = js.undefined
  var weight: java.lang.String
}

object TypeSpecimenProps {
  @scala.inline
  def apply(
    font: java.lang.String,
    headings: js.Array[java.lang.String] | js.Array[scala.Double],
    weight: java.lang.String,
    color: java.lang.String = null,
    style: java.lang.String = null
  ): TypeSpecimenProps = {
    val __obj = js.Dynamic.literal(font = font, headings = headings.asInstanceOf[js.Any], weight = weight)
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TypeSpecimenProps]
  }
}

