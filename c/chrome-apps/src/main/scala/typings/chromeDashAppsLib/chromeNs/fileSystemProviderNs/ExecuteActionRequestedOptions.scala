package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 45. */
trait ExecuteActionRequestedOptions extends js.Object {
  /** The identifier of the action to be executed. */
  var actionId: java.lang.String
  /** The path of the entry to be used for the action. */
  var entryPath: java.lang.String
  /** The identifier of the file system related to this operation. */
  var fileSystemId: java.lang.String
  /** The unique identifier of this request. */
  var requestId: chromeDashAppsLib.chromeNs.integer
}

object ExecuteActionRequestedOptions {
  @scala.inline
  def apply(
    actionId: java.lang.String,
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionId")(actionId)
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
}

