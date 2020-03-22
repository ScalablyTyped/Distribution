package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/formatRFC3339", JSImport.Namespace)
@js.native
object dateFnsFormatRFC3339Mod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: AnonFractionDigits): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: AnonFractionDigits): String = js.native
  }
  
}

