package typings
package countriesDashAndDashTimezonesLib.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("countries-and-timezones", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllCountries(): js.Array[Country] = js.native
  def getAllTimezones(): js.Array[Timezone] = js.native
  def getCountriesForTimezone(timezoneId: java.lang.String): js.Array[Country] = js.native
  def getTimezonesForCountry(countryId: java.lang.String): js.Array[Timezone] = js.native
}

