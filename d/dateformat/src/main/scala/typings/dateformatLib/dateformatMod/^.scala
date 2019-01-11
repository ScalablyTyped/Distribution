package typings
package dateformatLib.dateformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dateformat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val i18n: dateformatLib.dateformatMod.dateFormatNs.DateFormatI18n = js.native
  val masks: dateformatLib.dateformatMod.dateFormatNs.DateFormatMasks = js.native
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
  def apply(): java.lang.String = js.native
  def apply(date: stdLib.Date | java.lang.String | scala.Double): java.lang.String = js.native
  def apply(date: stdLib.Date | java.lang.String | scala.Double, mask: java.lang.String): java.lang.String = js.native
  def apply(date: stdLib.Date | java.lang.String | scala.Double, mask: java.lang.String, utc: scala.Boolean): java.lang.String = js.native
  def apply(
    date: stdLib.Date | java.lang.String | scala.Double,
    mask: java.lang.String,
    utc: scala.Boolean,
    gmt: scala.Boolean
  ): java.lang.String = js.native
  def apply(mask: java.lang.String): java.lang.String = js.native
  def apply(mask: java.lang.String, utc: scala.Boolean): java.lang.String = js.native
  def apply(mask: java.lang.String, utc: scala.Boolean, gmt: scala.Boolean): java.lang.String = js.native
}

