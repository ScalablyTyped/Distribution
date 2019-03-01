package typings
package countryDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Africa extends js.Object {
  val africa: countryDashDataLib.countryDashDataMod.Continent
  val antarctica: countryDashDataLib.countryDashDataMod.Continent
  val asia: countryDashDataLib.countryDashDataMod.Continent
  val europe: countryDashDataLib.countryDashDataMod.Continent
  val northAmerica: countryDashDataLib.countryDashDataMod.Continent
  val oceania: countryDashDataLib.countryDashDataMod.Continent
  val southAmerica: countryDashDataLib.countryDashDataMod.Continent
}

object Anon_Africa {
  @scala.inline
  def apply(
    africa: countryDashDataLib.countryDashDataMod.Continent,
    antarctica: countryDashDataLib.countryDashDataMod.Continent,
    asia: countryDashDataLib.countryDashDataMod.Continent,
    europe: countryDashDataLib.countryDashDataMod.Continent,
    northAmerica: countryDashDataLib.countryDashDataMod.Continent,
    oceania: countryDashDataLib.countryDashDataMod.Continent,
    southAmerica: countryDashDataLib.countryDashDataMod.Continent
  ): Anon_Africa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("africa")(africa)
    __obj.updateDynamic("antarctica")(antarctica)
    __obj.updateDynamic("asia")(asia)
    __obj.updateDynamic("europe")(europe)
    __obj.updateDynamic("northAmerica")(northAmerica)
    __obj.updateDynamic("oceania")(oceania)
    __obj.updateDynamic("southAmerica")(southAmerica)
    __obj.asInstanceOf[Anon_Africa]
  }
}

