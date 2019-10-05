package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.Anon_READ
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.READ
import typings.chromeDashApps.chromeDashAppsStrings.WRITE
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: String
  /**
    * Whether the file was opened for reading or writing.
    * @see OpenFileMode
    */
  var mode: ToStringLiteral[Anon_READ, String, Exclude[String, READ | WRITE]]
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: integer
}

object OpenedFileInfo {
  @scala.inline
  def apply(
    filePath: String,
    mode: ToStringLiteral[Anon_READ, String, Exclude[String, READ | WRITE]],
    openRequestId: integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath, mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId)
  
    __obj.asInstanceOf[OpenedFileInfo]
  }
}

