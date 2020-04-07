package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/differenceInMilliseconds/index", JSImport.Namespace)
@js.native
object differenceInMillisecondsIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Double = js.native
    def apply(dateLeft: Double, dateRight: Date): Double = js.native
    def apply(dateLeft: Date, dateRight: Double): Double = js.native
    def apply(dateLeft: Date, dateRight: Date): Double = js.native
  }
  
}

