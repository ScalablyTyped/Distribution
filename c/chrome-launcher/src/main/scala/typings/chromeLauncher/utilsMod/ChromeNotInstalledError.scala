package typings.chromeLauncher.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/utils", "ChromeNotInstalledError")
@js.native
class ChromeNotInstalledError () extends LauncherError {
  @JSName("code")
  var code_ChromeNotInstalledError: LaunchErrorCodes = js.native
}

