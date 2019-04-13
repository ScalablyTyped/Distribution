package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends Silenceable {
  var at: js.UndefOr[scala.Double] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    at: scala.Int | scala.Double = null,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[AddOptions]
  }
}

