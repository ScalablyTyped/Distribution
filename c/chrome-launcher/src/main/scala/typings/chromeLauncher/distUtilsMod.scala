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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("chrome-launcher/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chrome-launcher/dist/utils", "ChromeNotInstalledError")
  @js.native
  open class ChromeNotInstalledError () extends LauncherError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    @JSName("code")
    var code_ChromeNotInstalledError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "ChromePathNotSetError")
  @js.native
  open class ChromePathNotSetError () extends LauncherError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    @JSName("code")
    var code_ChromePathNotSetError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "InvalidUserDataDirectoryError")
  @js.native
  open class InvalidUserDataDirectoryError () extends LauncherError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    @JSName("code")
    var code_InvalidUserDataDirectoryError: LaunchErrorCodes = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "LauncherError")
  @js.native
  open class LauncherError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    var code: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("chrome-launcher/dist/utils", "UnsupportedPlatformError")
  @js.native
  open class UnsupportedPlatformError () extends LauncherError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    @JSName("code")
    var code_UnsupportedPlatformError: LaunchErrorCodes = js.native
  }
  
  inline def defaults[T](`val`: T, `def`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(`val`.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def defaults[T](`val`: Unit, `def`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(`val`.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def delay(time: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getPlatform(): wsl | aix | android | darwin | freebsd | linux | openbsd | sunos | win32 | cygwin | netbsd = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[wsl | aix | android | darwin | freebsd | linux | openbsd | sunos | win32 | cygwin | netbsd]
  
  inline def getWSLLocalAppDataPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWSLLocalAppDataPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeTmpDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTmpDir")().asInstanceOf[String]
  
  inline def toWSLPath(dir: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWSLPath")(dir.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toWin32Path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWin32Path")().asInstanceOf[String]
  inline def toWin32Path(dir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWin32Path")(dir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM
    - typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED
  */
  trait LaunchErrorCodes extends StObject
  object LaunchErrorCodes {
    
    inline def ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY = "ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY]
    
    inline def ERR_LAUNCHER_NOT_INSTALLED: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED = "ERR_LAUNCHER_NOT_INSTALLED".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_NOT_INSTALLED]
    
    inline def ERR_LAUNCHER_PATH_NOT_SET: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET = "ERR_LAUNCHER_PATH_NOT_SET".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_PATH_NOT_SET]
    
    inline def ERR_LAUNCHER_UNSUPPORTED_PLATFORM: typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM = "ERR_LAUNCHER_UNSUPPORTED_PLATFORM".asInstanceOf[typings.chromeLauncher.chromeLauncherStrings.ERR_LAUNCHER_UNSUPPORTED_PLATFORM]
  }
}
