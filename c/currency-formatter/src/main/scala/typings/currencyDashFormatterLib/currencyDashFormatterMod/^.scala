package typings
package currencyDashFormatterLib.currencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("currency-formatter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val currencies: js.Array[currencyDashFormatterLib.currencyDashFormatterMod.Currency] = js.native
  val defaultCurrency: currencyDashFormatterLib.currencyDashFormatterMod.Currency = js.native
  def findCurrency(currencyCode: java.lang.String): currencyDashFormatterLib.currencyDashFormatterMod.Currency = js.native
  def format(value: scala.Double, options: currencyDashFormatterLib.Anon_Code): java.lang.String = js.native
  def unformat(value: java.lang.String, options: currencyDashFormatterLib.Anon_Code): scala.Double = js.native
}

