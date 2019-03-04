package typings
package countryDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Countries extends js.Object {
  def countries(query: js.Any): js.Array[countryDashDataLib.countryDashDataMod.Country]
  def currencies(query: js.Any): js.Array[countryDashDataLib.countryDashDataMod.Currency]
  def languages(query: js.Any): js.Array[countryDashDataLib.countryDashDataMod.Language]
}

object Anon_Countries {
  @scala.inline
  def apply(
    countries: js.Function1[js.Any, js.Array[countryDashDataLib.countryDashDataMod.Country]],
    currencies: js.Function1[js.Any, js.Array[countryDashDataLib.countryDashDataMod.Currency]],
    languages: js.Function1[js.Any, js.Array[countryDashDataLib.countryDashDataMod.Language]]
  ): Anon_Countries = {
    val __obj = js.Dynamic.literal(countries = countries, currencies = currencies, languages = languages)
  
    __obj.asInstanceOf[Anon_Countries]
  }
}

