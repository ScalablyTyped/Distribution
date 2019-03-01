package typings
package dateDashFnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffix extends js.Object {
  var addSuffix: js.UndefOr[scala.Boolean] = js.undefined
  var includeSeconds: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
}

object Anon_AddSuffix {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[scala.Boolean] = js.undefined,
    includeSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    locale: js.Object = null
  ): Anon_AddSuffix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix)
    if (!js.isUndefined(includeSeconds)) __obj.updateDynamic("includeSeconds")(includeSeconds)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Anon_AddSuffix]
  }
}

