package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddSuffix extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var includeSeconds: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
}

object AnonAddSuffix {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    includeSeconds: js.UndefOr[Boolean] = js.undefined,
    locale: typings.dateFns.mod.Locale = null
  ): AnonAddSuffix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSeconds)) __obj.updateDynamic("includeSeconds")(includeSeconds.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddSuffix]
  }
}

