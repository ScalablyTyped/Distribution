package typings.dav.mod

import typings.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCalendarObjectOptions extends js.Object {
  /**
    * rfc 5545 VCALENDAR object.
    */
  var data: String
  /**
    * name for the calendar ics file.
    */
  var filename: String
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object CreateCalendarObjectOptions {
  @scala.inline
  def apply(data: String, filename: String, sandbox: Sandbox = null, xhr: Transport = null): CreateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCalendarObjectOptions]
  }
}

