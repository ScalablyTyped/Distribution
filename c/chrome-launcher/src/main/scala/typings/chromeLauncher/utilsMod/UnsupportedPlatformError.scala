package typings.chromeLauncher.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/utils", "UnsupportedPlatformError")
@js.native
class UnsupportedPlatformError () extends LauncherError {
  @JSName("code")
  var code_UnsupportedPlatformError: LaunchErrorCodes = js.native
}

