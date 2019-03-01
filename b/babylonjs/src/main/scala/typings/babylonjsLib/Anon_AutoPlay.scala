package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPlay extends js.Object {
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var clickToPlay: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var useDirectMapping: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoPlay {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    clickToPlay: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    poster: java.lang.String = null,
    resolution: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    useDirectMapping: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoPlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping)
    __obj.asInstanceOf[Anon_AutoPlay]
  }
}

