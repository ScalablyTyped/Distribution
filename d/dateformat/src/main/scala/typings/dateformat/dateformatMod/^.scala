package typings.dateformat.dateformatMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dateformat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var i18n: DateFormatI18n = js.native
  val masks: DateFormatMasks = js.native
  /**
    * dateFormat()
    *
    * Accepts a date, a mask, or a date and a mask.
    * Returns a formatted version of the given date.
    * The date defaults to the current date/time.
    * The mask defaults to dateFormat.masks.default.
    *
    * https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L18
    */
  def apply(): String = js.native
  def apply(date: Date | String | Double): String = js.native
  def apply(date: Date | String | Double, mask: String): String = js.native
  def apply(date: Date | String | Double, mask: String, utc: Boolean): String = js.native
  def apply(date: Date | String | Double, mask: String, utc: Boolean, gmt: Boolean): String = js.native
  def apply(mask: String): String = js.native
  def apply(mask: String, utc: Boolean): String = js.native
  def apply(mask: String, utc: Boolean, gmt: Boolean): String = js.native
}

