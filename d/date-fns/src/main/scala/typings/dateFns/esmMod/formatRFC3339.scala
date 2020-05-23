package typings.dateFns.esmMod

import typings.dateFns.anon.FractionDigits
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "formatRFC3339")
@js.native
object formatRFC3339 extends js.Object {
  def apply(date: Double): String = js.native
  def apply(date: Double, options: FractionDigits): String = js.native
  def apply(date: Date): String = js.native
  def apply(date: Date, options: FractionDigits): String = js.native
}

