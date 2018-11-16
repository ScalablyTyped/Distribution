package typings
package daterangepickerLib.daterangepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object daterangepickerNs {
  type DataRangePickerCallback = js.Function3[
    /* start */ momentLib.momentMod.momentNs.Moment, 
    /* end */ momentLib.momentMod.momentNs.Moment, 
    /* label */ java.lang.String | scala.Null, 
    scala.Unit
  ]
  type DateOrString = java.lang.String | momentLib.momentMod.momentNs.Moment | stdLib.Date
}
