package typings.dateFns

import typings.dateFns.anon.Format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/formatISO/index", JSImport.Namespace)
@js.native
object dateFnsFormatISOIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: Format): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: Format): String = js.native
  }
  
}

