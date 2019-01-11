package typings
package d3DashFormatLib.d3DashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(specifier: java.lang.String): js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String] = js.native
  def formatDefaultLocale(defaultLocale: d3DashFormatLib.d3DashFormatMod.FormatLocaleDefinition): d3DashFormatLib.d3DashFormatMod.FormatLocaleObject = js.native
  def formatLocale(locale: d3DashFormatLib.d3DashFormatMod.FormatLocaleDefinition): d3DashFormatLib.d3DashFormatMod.FormatLocaleObject = js.native
  def formatPrefix(specifier: java.lang.String, value: scala.Double): js.Function1[/* n */ scala.Double | d3DashFormatLib.Anon_ValueOf, java.lang.String] = js.native
  def formatSpecifier(specifier: java.lang.String): d3DashFormatLib.d3DashFormatMod.FormatSpecifier = js.native
  def precisionFixed(step: scala.Double): scala.Double = js.native
  def precisionPrefix(step: scala.Double, value: scala.Double): scala.Double = js.native
  def precisionRound(step: scala.Double, max: scala.Double): scala.Double = js.native
}

