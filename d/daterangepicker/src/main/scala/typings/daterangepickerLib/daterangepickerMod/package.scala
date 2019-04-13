package typings
package daterangepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object daterangepickerMod {
  type DataRangePickerCallback = js.Function3[
    /* start */ momentLib.momentMod.Moment, 
    /* end */ momentLib.momentMod.Moment, 
    /* label */ java.lang.String | scala.Null, 
    scala.Unit
  ]
  type DateOrString = java.lang.String | momentLib.momentMod.Moment | stdLib.Date
}
