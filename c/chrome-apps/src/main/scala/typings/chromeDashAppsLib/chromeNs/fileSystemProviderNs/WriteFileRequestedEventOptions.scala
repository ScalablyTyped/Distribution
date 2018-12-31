package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: stdLib.ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: chromeDashAppsLib.chromeNs.integer
  /** A request ID used to open the file. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

