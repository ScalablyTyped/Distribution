package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryPathRecursiveRequestedEventOptions extends DirectoryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}

object DirectoryPathRecursiveRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: Double): DirectoryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[DirectoryPathRecursiveRequestedEventOptions]
  }
}

