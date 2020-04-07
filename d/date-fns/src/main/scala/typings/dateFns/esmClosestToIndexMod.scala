package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/closestTo/index", JSImport.Namespace)
@js.native
object esmClosestToIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateToCompare: Double, datesArray: js.Array[Date | Double]): Date = js.native
    def apply(dateToCompare: Date, datesArray: js.Array[Date | Double]): Date = js.native
  }
  
}

