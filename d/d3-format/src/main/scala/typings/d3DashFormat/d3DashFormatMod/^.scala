package typings.d3DashFormat.d3DashFormatMod

import typings.d3DashFormat.Anon_ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(specifier: String): js.Function1[/* n */ Double | Anon_ValueOf, String] = js.native
  def formatDefaultLocale(defaultLocale: FormatLocaleDefinition): FormatLocaleObject = js.native
  def formatLocale(locale: FormatLocaleDefinition): FormatLocaleObject = js.native
  def formatPrefix(specifier: String, value: Double): js.Function1[/* n */ Double | Anon_ValueOf, String] = js.native
  def formatSpecifier(specifier: String): FormatSpecifier = js.native
  def precisionFixed(step: Double): Double = js.native
  def precisionPrefix(step: Double, value: Double): Double = js.native
  def precisionRound(step: Double, max: Double): Double = js.native
}

