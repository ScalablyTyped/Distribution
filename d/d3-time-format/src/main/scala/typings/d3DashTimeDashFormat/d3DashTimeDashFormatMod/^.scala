package typings.d3DashTimeDashFormat.d3DashTimeDashFormatMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-time-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isoFormat(date: Date): String = js.native
  def isoParse(dateString: String): Date | Null = js.native
  def timeFormat(specifier: String): js.Function1[/* date */ Date, String] = js.native
  def timeFormatDefaultLocale(defaultTimeLocale: TimeLocaleDefinition): TimeLocaleObject = js.native
  def timeFormatLocale(timeLocale: TimeLocaleDefinition): TimeLocaleObject = js.native
  def timeParse(specifier: String): js.Function1[/* dateString */ String, Date | Null] = js.native
  def utcFormat(specifier: String): js.Function1[/* date */ Date, String] = js.native
  def utcParse(specifier: String): js.Function1[/* dateString */ String, Date | Null] = js.native
}

