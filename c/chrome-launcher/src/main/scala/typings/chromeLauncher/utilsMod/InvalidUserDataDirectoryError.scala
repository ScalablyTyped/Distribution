package typings.chromeLauncher.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/utils", "InvalidUserDataDirectoryError")
@js.native
class InvalidUserDataDirectoryError () extends LauncherError {
  @JSName("code")
  var code_InvalidUserDataDirectoryError: LaunchErrorCodes = js.native
}

