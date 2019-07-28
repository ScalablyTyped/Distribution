package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.Anon_READ
import typings.chromeDashApps.chromeDashAppsStrings.READ
import typings.chromeDashApps.chromeDashAppsStrings.WRITE
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.FilePathRequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, mode = mode.asInstanceOf[js.Any], requestId = requestId)
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

