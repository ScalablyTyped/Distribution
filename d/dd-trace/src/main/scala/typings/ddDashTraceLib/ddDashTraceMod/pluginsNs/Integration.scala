package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Integration extends js.Object {
  /**
    * The service name to be used for this plugin.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object Integration {
  @scala.inline
  def apply(service: java.lang.String = null): Integration = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Integration]
  }
}

