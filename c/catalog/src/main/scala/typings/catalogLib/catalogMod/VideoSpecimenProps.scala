package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSpecimenProps extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object VideoSpecimenProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): VideoSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VideoSpecimenProps]
  }
}

