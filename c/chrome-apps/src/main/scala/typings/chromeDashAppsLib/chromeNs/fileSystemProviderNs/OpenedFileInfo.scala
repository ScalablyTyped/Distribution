package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: java.lang.String
  /**
    * Whether the file was opened for reading or writing.
    * @see OpenFileMode
    */
  var mode: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_READ, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.READ | chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
    ]
  ]
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

object OpenedFileInfo {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    mode: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_READ, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.READ | chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
      ]
    ],
    openRequestId: chromeDashAppsLib.chromeNs.integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath, mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId)
  
    __obj.asInstanceOf[OpenedFileInfo]
  }
}

