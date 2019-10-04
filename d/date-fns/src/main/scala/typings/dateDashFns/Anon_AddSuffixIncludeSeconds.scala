package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSuffixIncludeSeconds extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var includeSeconds: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
}

object Anon_AddSuffixIncludeSeconds {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    includeSeconds: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null
  ): Anon_AddSuffixIncludeSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix)
    if (!js.isUndefined(includeSeconds)) __obj.updateDynamic("includeSeconds")(includeSeconds)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Anon_AddSuffixIncludeSeconds]
  }
}

