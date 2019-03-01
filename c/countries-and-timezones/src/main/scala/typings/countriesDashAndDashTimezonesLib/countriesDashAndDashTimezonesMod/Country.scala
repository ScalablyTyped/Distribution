package typings
package countriesDashAndDashTimezonesLib.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var timezones: js.Array[java.lang.String]
}

object Country {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, timezones: js.Array[java.lang.String]): Country = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("timezones")(timezones)
    __obj.asInstanceOf[Country]
  }
}

