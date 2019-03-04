package typings
package countryDashSelectDashJsLib.CountrySelectJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryData extends js.Object {
  var iso2: java.lang.String
  var name: java.lang.String
}

object CountryData {
  @scala.inline
  def apply(iso2: java.lang.String, name: java.lang.String): CountryData = {
    val __obj = js.Dynamic.literal(iso2 = iso2, name = name)
  
    __obj.asInstanceOf[CountryData]
  }
}

