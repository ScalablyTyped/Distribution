package typings.countriesAndTimezones.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var id: String
  var name: String
  var timezones: js.Array[String]
}

object Country {
  @scala.inline
  def apply(id: String, name: String, timezones: js.Array[String]): Country = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezones = timezones.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Country]
  }
}

