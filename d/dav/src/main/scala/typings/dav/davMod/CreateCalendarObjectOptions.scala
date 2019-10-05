package typings.dav.davMod

import typings.dav.davMod.transport.Transport
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
    val __obj = js.Dynamic.literal(data = data, filename = filename)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CreateCalendarObjectOptions]
  }
}

