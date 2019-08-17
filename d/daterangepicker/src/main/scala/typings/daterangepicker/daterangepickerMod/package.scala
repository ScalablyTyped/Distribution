package typings.daterangepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object daterangepickerMod {
  import typings.moment.momentMod.Moment
  import typings.std.Date

  type DataRangePickerCallback = js.Function3[/* start */ Moment, /* end */ Moment, /* label */ String | Null, Unit]
  type DateOrString = String | Moment | Date
}
