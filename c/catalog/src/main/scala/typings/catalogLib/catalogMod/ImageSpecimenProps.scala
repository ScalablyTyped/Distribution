package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSpecimenProps extends js.Object {
  var dark: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var light: js.UndefOr[scala.Boolean] = js.undefined
  var overlay: js.UndefOr[java.lang.String] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ImageSpecimenProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    dark: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    light: js.UndefOr[scala.Boolean] = js.undefined,
    overlay: java.lang.String = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): ImageSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
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

