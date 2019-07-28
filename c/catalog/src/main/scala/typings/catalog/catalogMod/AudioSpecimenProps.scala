package typings.catalog.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSpecimenProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var src: String
  var title: js.UndefOr[String] = js.undefined
}

object AudioSpecimenProps {
  @scala.inline
  def apply(
    src: String,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): AudioSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AudioSpecimenProps]
  }
}

