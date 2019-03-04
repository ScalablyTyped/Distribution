package typings
package chaynsLib

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
  var description: java.lang.String
  var end: stdLib.Date
  var location: java.lang.String
  var name: java.lang.String
  var start: stdLib.Date
}

object SaveAppointmentConfig {
  @scala.inline
  def apply(
    description: java.lang.String,
    end: stdLib.Date,
    location: java.lang.String,
    name: java.lang.String,
    start: stdLib.Date
  ): SaveAppointmentConfig = {
    val __obj = js.Dynamic.literal(description = description, end = end, location = location, name = name, start = start)
  
    __obj.asInstanceOf[SaveAppointmentConfig]
  }
}

