package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCalendarObjectOptions extends js.Object {
  /**
    * rfc 5545 VCALENDAR object.
    */
  var data: java.lang.String
  /**
    * name for the calendar ics file.
    */
  var filename: java.lang.String
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[davLib.davMod.transportNs.Transport] = js.undefined
}

object CreateCalendarObjectOptions {
  @scala.inline
  def apply(
    data: java.lang.String,
    filename: java.lang.String,
    sandbox: Sandbox = null,
    xhr: davLib.davMod.transportNs.Transport = null
  ): CreateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("filename")(filename)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CreateCalendarObjectOptions]
  }
}

