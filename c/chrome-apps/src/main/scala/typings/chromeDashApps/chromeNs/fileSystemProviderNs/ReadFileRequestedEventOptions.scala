package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileRequestedEventOptions extends RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: double
  /** Position in the file (in bytes) to start reading from. */
  var offset: double
  /** A request ID used to open the file. */
  var openRequestId: integer
}

object ReadFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId, length = length, offset = offset, openRequestId = openRequestId, requestId = requestId)
  
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
}

