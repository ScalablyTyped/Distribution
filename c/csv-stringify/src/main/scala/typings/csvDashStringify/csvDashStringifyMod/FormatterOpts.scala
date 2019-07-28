package typings.csvDashStringify.csvDashStringifyMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOpts extends js.Object {
  var bool: js.UndefOr[js.Function1[/* value */ Boolean, String]] = js.undefined
  var date: js.UndefOr[js.Function1[/* value */ Date, String]] = js.undefined
  var `object`: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.undefined
}

object FormatterOpts {
  @scala.inline
  def apply(
    bool: /* value */ Boolean => String = null,
    date: /* value */ Date => String = null,
    `object`: /* value */ js.Any => String = null
  ): FormatterOpts = {
    val __obj = js.Dynamic.literal()
    if (bool != null) __obj.updateDynamic("bool")(js.Any.fromFunction1(bool))
    if (date != null) __obj.updateDynamic("date")(js.Any.fromFunction1(date))
    if (`object` != null) __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[FormatterOpts]
  }
}

