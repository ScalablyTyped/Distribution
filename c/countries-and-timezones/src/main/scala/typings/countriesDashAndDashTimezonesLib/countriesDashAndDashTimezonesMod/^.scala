package typings
package countriesDashAndDashTimezonesLib.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("countries-and-timezones", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllCountries(): org.scalablytyped.runtime.StringDictionary[Country] = js.native
  def getAllTimezones(): org.scalablytyped.runtime.StringDictionary[Timezone] = js.native
  def getCountriesForTimezone(timezoneId: java.lang.String): js.Array[Country] = js.native
  def getTimezonesForCountry(countryId: java.lang.String): js.Array[Timezone] = js.native
}

