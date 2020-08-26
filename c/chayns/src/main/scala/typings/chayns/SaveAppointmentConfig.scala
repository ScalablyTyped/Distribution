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
@js.native
trait SaveAppointmentConfig extends js.Object {
  var description: String = js.native
  var end: Date = js.native
  var location: String = js.native
  var name: String = js.native
  var start: Date = js.native
}

object SaveAppointmentConfig {
  @scala.inline
  def apply(description: String, end: Date, location: String, name: String, start: Date): SaveAppointmentConfig = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAppointmentConfig]
  }
  @scala.inline
  implicit class SaveAppointmentConfigOps[Self <: SaveAppointmentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

