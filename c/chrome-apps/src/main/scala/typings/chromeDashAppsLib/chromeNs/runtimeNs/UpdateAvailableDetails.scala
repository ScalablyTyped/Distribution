package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAvailableDetails extends js.Object {
  /** The version number of the available update. */
  var version: java.lang.String
}

object UpdateAvailableDetails {
  @scala.inline
  def apply(version: java.lang.String): UpdateAvailableDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateAvailableDetails]
  }
}

