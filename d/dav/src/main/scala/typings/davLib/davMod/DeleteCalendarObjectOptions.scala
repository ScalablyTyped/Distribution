package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCalendarObjectOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[davLib.davMod.transportNs.Transport] = js.undefined
}

object DeleteCalendarObjectOptions {
  @scala.inline
  def apply(sandbox: Sandbox = null, xhr: davLib.davMod.transportNs.Transport = null): DeleteCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[DeleteCalendarObjectOptions]
  }
}

