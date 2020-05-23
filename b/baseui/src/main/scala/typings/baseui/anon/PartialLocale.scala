package typings.baseui.anon

import typings.dateFns.anon.DateTime
import typings.dateFns.anon.Day
import typings.dateFns.anon.FirstWeekContainsDateWeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<date-fns.Locale> */
trait PartialLocale extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var formatLong: js.UndefOr[DateTime] = js.undefined
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var localize: js.UndefOr[Day] = js.undefined
  var `match`: js.UndefOr[Day] = js.undefined
  var options: js.UndefOr[FirstWeekContainsDateWeekStartsOn] = js.undefined
}

object PartialLocale {
  @scala.inline
  def apply(
    code: String = null,
    formatDistance: /* repeated */ js.Any => _ = null,
    formatLong: DateTime = null,
    formatRelative: /* repeated */ js.Any => _ = null,
    localize: Day = null,
    `match`: Day = null,
    options: FirstWeekContainsDateWeekStartsOn = null
  ): PartialLocale = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (formatDistance != null) __obj.updateDynamic("formatDistance")(js.Any.fromFunction1(formatDistance))
    if (formatLong != null) __obj.updateDynamic("formatLong")(formatLong.asInstanceOf[js.Any])
    if (formatRelative != null) __obj.updateDynamic("formatRelative")(js.Any.fromFunction1(formatRelative))
    if (localize != null) __obj.updateDynamic("localize")(localize.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLocale]
  }
}

