package typings.chromeLauncher.utilsMod

import typings.chromeLauncher.chromeLauncherStrings.aix
import typings.chromeLauncher.chromeLauncherStrings.android
import typings.chromeLauncher.chromeLauncherStrings.cygwin
import typings.chromeLauncher.chromeLauncherStrings.darwin
import typings.chromeLauncher.chromeLauncherStrings.freebsd
import typings.chromeLauncher.chromeLauncherStrings.linux
import typings.chromeLauncher.chromeLauncherStrings.netbsd
import typings.chromeLauncher.chromeLauncherStrings.openbsd
import typings.chromeLauncher.chromeLauncherStrings.sunos
import typings.chromeLauncher.chromeLauncherStrings.win32
import typings.chromeLauncher.chromeLauncherStrings.wsl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-launcher/dist/utils", "getPlatform")
@js.native
object getPlatform extends js.Object {
  
  def apply(): aix | android | darwin | freebsd | linux | openbsd | sunos | win32 | cygwin | netbsd | wsl = js.native
}
