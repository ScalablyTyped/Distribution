package typings.catalog.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSpecimenProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var src: String
  var title: js.UndefOr[String] = js.undefined
}

object VideoSpecimenProps {
  @scala.inline
  def apply(
    src: String,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): VideoSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VideoSpecimenProps]
  }
}

