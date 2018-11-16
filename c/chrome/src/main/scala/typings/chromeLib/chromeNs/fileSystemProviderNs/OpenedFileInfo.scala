package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: java.lang.String
  /** Whether the file was opened for reading or writing. */
  var mode: java.lang.String
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: scala.Double
}

