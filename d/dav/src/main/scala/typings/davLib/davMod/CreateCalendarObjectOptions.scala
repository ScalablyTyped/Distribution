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

