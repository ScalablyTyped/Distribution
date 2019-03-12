package typings
package bootstrapDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerCustomFormatOptions extends js.Object {
  var toDisplay: js.UndefOr[
    js.Function3[
      /* date */ java.lang.String, 
      /* format */ js.Any, 
      /* language */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  var toValue: js.UndefOr[
    js.Function3[/* date */ java.lang.String, /* format */ js.Any, /* language */ js.Any, stdLib.Date]
  ] = js.undefined
}

object DatepickerCustomFormatOptions {
  @scala.inline
  def apply(
    toDisplay: (/* date */ java.lang.String, /* format */ js.Any, /* language */ js.Any) => java.lang.String = null,
    toValue: (/* date */ java.lang.String, /* format */ js.Any, /* language */ js.Any) => stdLib.Date = null
  ): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (toDisplay != null) __obj.updateDynamic("toDisplay")(js.Any.fromFunction3(toDisplay))
    if (toValue != null) __obj.updateDynamic("toValue")(js.Any.fromFunction3(toValue))
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
}

