package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPath: String
}

object EntryPathRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: Double): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
}

