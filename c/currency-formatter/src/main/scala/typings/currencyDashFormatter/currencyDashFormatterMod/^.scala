package typings.currencyDashFormatter.currencyDashFormatterMod

import typings.currencyDashFormatter.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("currency-formatter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val currencies: js.Array[Currency] = js.native
  val defaultCurrency: Currency = js.native
  def findCurrency(currencyCode: String): Currency = js.native
  def format(value: Double, options: Anon_Code): String = js.native
  def unformat(value: String, options: Anon_Code): Double = js.native
}

