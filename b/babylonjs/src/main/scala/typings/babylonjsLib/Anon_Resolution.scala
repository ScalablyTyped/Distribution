package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resolution extends js.Object {
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var useDirectMapping: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Resolution {
  @scala.inline
  def apply(
    resolution: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    useDirectMapping: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Resolution = {
    val __obj = js.Dynamic.literal()
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping)
    __obj.asInstanceOf[Anon_Resolution]
  }
}

