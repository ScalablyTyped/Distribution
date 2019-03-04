package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
trait EntryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPath: java.lang.String
}

object EntryPathRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
}

