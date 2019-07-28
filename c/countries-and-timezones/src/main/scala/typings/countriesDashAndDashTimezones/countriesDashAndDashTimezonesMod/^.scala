package typings.countriesDashAndDashTimezones.countriesDashAndDashTimezonesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("countries-and-timezones", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllCountries(): StringDictionary[Country] = js.native
  def getAllTimezones(): StringDictionary[Timezone] = js.native
  def getCountriesForTimezone(timezoneId: String): js.Array[Country] = js.native
  def getTimezonesForCountry(countryId: String): js.Array[Timezone] = js.native
}

