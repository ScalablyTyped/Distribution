package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSpecimenProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: String
  var headings: js.Array[Double | String]
  var style: js.UndefOr[String] = js.undefined
  var weight: String
}

object TypeSpecimenProps {
  @scala.inline
  def apply(
    font: String,
    headings: js.Array[Double | String],
    weight: String,
    color: String = null,
    style: String = null
  ): TypeSpecimenProps = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], headings = headings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSpecimenProps]
  }
}

