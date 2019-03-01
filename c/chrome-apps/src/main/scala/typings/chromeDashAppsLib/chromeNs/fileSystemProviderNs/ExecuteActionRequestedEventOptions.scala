package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteActionRequestedEventOptions extends GetActionsRequestedEventOptions {
  /** The identifier of the action to be executed. */
  var actionId: java.lang.String
}

object ExecuteActionRequestedEventOptions {
  @scala.inline
  def apply(
    actionId: java.lang.String,
    entryPaths: js.Array[java.lang.String],
    fileSystemId: java.lang.String,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): ExecuteActionRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionId")(actionId)
    __obj.updateDynamic("entryPaths")(entryPaths)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[ExecuteActionRequestedEventOptions]
  }
}

