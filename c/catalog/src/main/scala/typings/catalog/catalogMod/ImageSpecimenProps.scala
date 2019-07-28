package typings.catalog.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSpecimenProps extends js.Object {
  var dark: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var src: String
  var title: js.UndefOr[String] = js.undefined
}

object ImageSpecimenProps {
  @scala.inline
  def apply(
    src: String,
    dark: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    light: js.UndefOr[Boolean] = js.undefined,
    overlay: String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    scale: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): ImageSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ImageSpecimenProps]
  }
}

