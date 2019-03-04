package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPath: java.lang.String
}

object EntryPathRequestedEventOptions {
  @scala.inline
  def apply(entryPath: java.lang.String, fileSystemId: java.lang.String, requestId: scala.Double): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
}

