package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/formatISO", JSImport.Namespace)
@js.native
object dateFnsFormatISOMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: AnonFormat): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: AnonFormat): String = js.native
  }
  
}

