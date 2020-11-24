package typings.chromeLauncher.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-launcher/dist/utils", "UnsupportedPlatformError")
@js.native
class UnsupportedPlatformError () extends LauncherError {
  
  @JSName("code")
  var code_UnsupportedPlatformError: LaunchErrorCodes = js.native
}
