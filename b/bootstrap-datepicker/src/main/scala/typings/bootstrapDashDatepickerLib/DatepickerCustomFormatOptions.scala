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

