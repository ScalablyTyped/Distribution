package typings
package d3DashTimeDashFormatLib.d3DashTimeDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-time-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isoFormat(date: stdLib.Date): java.lang.String = js.native
  def isoParse(dateString: java.lang.String): stdLib.Date | scala.Null = js.native
  def timeFormat(specifier: java.lang.String): js.Function1[/* date */ stdLib.Date, java.lang.String] = js.native
  def timeFormatDefaultLocale(defaultTimeLocale: d3DashTimeDashFormatLib.d3DashTimeDashFormatMod.TimeLocaleDefinition): d3DashTimeDashFormatLib.d3DashTimeDashFormatMod.TimeLocaleObject = js.native
  def timeFormatLocale(timeLocale: d3DashTimeDashFormatLib.d3DashTimeDashFormatMod.TimeLocaleDefinition): d3DashTimeDashFormatLib.d3DashTimeDashFormatMod.TimeLocaleObject = js.native
  def timeParse(specifier: java.lang.String): js.Function1[/* dateString */ java.lang.String, stdLib.Date | scala.Null] = js.native
  def utcFormat(specifier: java.lang.String): js.Function1[/* date */ stdLib.Date, java.lang.String] = js.native
  def utcParse(specifier: java.lang.String): js.Function1[/* dateString */ java.lang.String, stdLib.Date | scala.Null] = js.native
}

