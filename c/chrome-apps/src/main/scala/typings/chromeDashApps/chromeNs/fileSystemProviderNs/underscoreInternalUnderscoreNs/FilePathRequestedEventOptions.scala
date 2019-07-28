package typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
trait FilePathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry for the operation */
  var filePath: String
}

object FilePathRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, requestId: integer): FilePathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[FilePathRequestedEventOptions]
  }
}

