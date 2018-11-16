package typings
package currencyDashFormatterLib.currencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("currency-formatter", JSImport.Namespace)
@js.native
object currencyDashFormatterModMembers extends js.Object {
  val currencies: js.Array[Currency] = js.native
  val defaultCurrency: Currency = js.native
  def findCurrency(currencyCode: java.lang.String): Currency = js.native
  def format(value: scala.Double, options: currencyDashFormatterLib.Anon_Format): java.lang.String = js.native
  def unformat(value: java.lang.String, options: currencyDashFormatterLib.Anon_Format): scala.Double = js.native
}

