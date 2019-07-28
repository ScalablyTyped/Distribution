package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  def apply(date: Date | String | Double): String = js.native
  def apply(date: Date | String | Double, format: String): String = js.native
  def apply(date: Date | String | Double, format: String, options: Anon_Locale): String = js.native
}

