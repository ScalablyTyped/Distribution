package typings.chromeLauncher

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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("chrome-launcher/dist/utils", "ChromeNotInstalledError")
  @js.native
  class ChromeNotInstalledError () extends LauncherError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    @JSName("code")
    var code_ChromeNotInstalledError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "ChromePathNotSetError")
  @js.native
  class ChromePathNotSetError () extends LauncherError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    @JSName("code")
    var code_ChromePathNotSetError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "InvalidUserDataDirectoryError")
  @js.native
  class InvalidUserDataDirectoryError () extends LauncherError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    @JSName("code")
    var code_InvalidUserDataDirectoryError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "LauncherError")
  @js.native
  class LauncherError () extends Error {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    var code: js.UndefOr[String] = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "UnsupportedPlatformError")
  @js.native
  class UnsupportedPlatformError () extends LauncherError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    @JSName("code")
    var code_UnsupportedPlatformError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "defaults")
  @js.native
  def defaults[T](`val`: T, `def`: T): T = js.native
  @JSImport("chrome-launcher/dist/utils", "defaults")
  @js.native
  def defaults[T](`val`: js.UndefOr[scala.Nothing], `def`: T): T = js.native
  
  @JSImport("chrome-launcher/dist/utils", "delay")
  @js.native
  def delay(time: Double): js.Promise[_] = js.native
  
  @JSImport("chrome-launcher/dist/utils", "getLocalAppDataPath")
  @js.native
  def getLocalAppDataPath(path: String): String = js.native
  
  @JSImport("chrome-launcher/dist/utils", "getPlatform")
  @js.native
  def getPlatform(): aix | android | darwin | freebsd | linux | openbsd | sunos | win32 | cygwin | netbsd | wsl = js.native
  
  @JSImport("chrome-launcher/dist/utils", "makeTmpDir")
  @js.native
  def makeTmpDir(): String = js.native
  
  @JSImport("chrome-launcher/dist/utils", "toWinDirFormat")
  @js.native
  def toWinDirFormat(): String = js.native
  @JSImport("chrome-launcher/dist/utils", "toWinDirFormat")
  @js.native
  def toWinDirFormat(dir: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED
  */
  trait LaunchErrorCodes extends StObject
  object LaunchErrorCodes {
    
    @scala.inline
    def ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY = "ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY]
    
    @scala.inline
    def ERR_LAUNCHER_NOT_INSTALLED: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED = "ERR_LAUNCHER_NOT_INSTALLED".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED]
    
    @scala.inline
    def ERR_LAUNCHER_PATH_NOT_SET: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET = "ERR_LAUNCHER_PATH_NOT_SET".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET]
    
    @scala.inline
    def ERR_LAUNCHER_UNSUPPORTED_PLATFORM: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM = "ERR_LAUNCHER_UNSUPPORTED_PLATFORM".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM]
  }
}
