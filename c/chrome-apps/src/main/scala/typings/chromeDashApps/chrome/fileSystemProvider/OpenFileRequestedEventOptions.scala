package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.Anon_READ
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.fileSystemProvider._internal_.FilePathRequestedEventOptions
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.READ
import typings.chromeDashApps.chromeDashAppsStrings.WRITE
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFileRequestedEventOptions extends FilePathRequestedEventOptions {
  /**
    * Whether the file will be used for reading or writing.
    * @see ChangeType
    */
  var mode: ToStringLiteral[Anon_READ, String, Exclude[String, READ | WRITE]]
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: String,
    fileSystemId: String,
    mode: ToStringLiteral[Anon_READ, String, Exclude[String, READ | WRITE]],
    requestId: integer
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

