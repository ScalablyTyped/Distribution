package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyEntryRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: java.lang.String
  /** The destination path for the operation. */
  var targetPath: java.lang.String
}

object CopyEntryRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    requestId: chromeDashAppsLib.chromeNs.integer,
    sourcePath: java.lang.String,
    targetPath: java.lang.String
  ): CopyEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId, sourcePath = sourcePath, targetPath = targetPath)
  
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
}

