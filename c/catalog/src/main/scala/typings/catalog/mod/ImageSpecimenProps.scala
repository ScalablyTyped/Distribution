package typings.catalog.mod

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
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSpecimenProps]
  }
}

