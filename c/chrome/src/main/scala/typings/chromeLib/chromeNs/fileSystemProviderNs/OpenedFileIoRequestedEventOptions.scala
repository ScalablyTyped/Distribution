package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: stdLib.ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: scala.Double
}

