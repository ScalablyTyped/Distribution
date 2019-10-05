package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
}

object DirectoryPathRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, requestId: Double): DirectoryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[DirectoryPathRequestedEventOptions]
  }
}

