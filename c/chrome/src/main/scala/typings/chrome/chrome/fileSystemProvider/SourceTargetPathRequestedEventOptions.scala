package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTargetPathRequestedEventOptions extends RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: String
  /** The destination path for the operation. */
  var targetPath: String
}

object SourceTargetPathRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: Double, sourcePath: String, targetPath: String): SourceTargetPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, requestId = requestId, sourcePath = sourcePath, targetPath = targetPath)
  
    __obj.asInstanceOf[SourceTargetPathRequestedEventOptions]
  }
}

