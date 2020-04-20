package typings.chayns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media Functions
  * Miscellaneous
  * chayns
  * interfaces
  */
// chayns.saveAppointment()
trait SaveAppointmentConfig extends js.Object {
  var description: String
  var end: Date
  var location: String
  var name: String
  var start: Date
}

object SaveAppointmentConfig {
  @scala.inline
  def apply(description: String, end: Date, location: String, name: String, start: Date): SaveAppointmentConfig = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAppointmentConfig]
  }
}

