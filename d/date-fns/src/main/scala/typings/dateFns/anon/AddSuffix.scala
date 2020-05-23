package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSuffix extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var includeSeconds: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
}

object AddSuffix {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    includeSeconds: js.UndefOr[Boolean] = js.undefined,
    locale: typings.dateFns.mod.Locale = null
  ): AddSuffix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSeconds)) __obj.updateDynamic("includeSeconds")(includeSeconds.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSuffix]
  }
}

