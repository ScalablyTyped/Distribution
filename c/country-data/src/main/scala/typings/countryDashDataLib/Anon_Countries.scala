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
    countries: js.Any => js.Array[countryDashDataLib.countryDashDataMod.Country],
    currencies: js.Any => js.Array[countryDashDataLib.countryDashDataMod.Currency],
    languages: js.Any => js.Array[countryDashDataLib.countryDashDataMod.Language]
  ): Anon_Countries = {
    val __obj = js.Dynamic.literal(countries = js.Any.fromFunction1(countries), currencies = js.Any.fromFunction1(currencies), languages = js.Any.fromFunction1(languages))
  
    __obj.asInstanceOf[Anon_Countries]
  }
}

