package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActionsRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[java.lang.String]
}

object GetActionsRequestedEventOptions {
  @scala.inline
  def apply(
    entryPaths: js.Array[java.lang.String],
    fileSystemId: java.lang.String,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entryPaths")(entryPaths)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
}

