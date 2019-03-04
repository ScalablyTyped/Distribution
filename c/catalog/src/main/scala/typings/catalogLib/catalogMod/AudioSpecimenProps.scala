package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSpecimenProps extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AudioSpecimenProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): AudioSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AudioSpecimenProps]
  }
}

