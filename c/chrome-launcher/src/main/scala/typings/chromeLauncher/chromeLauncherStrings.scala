package typings.chromeLauncher

import typings.chromeLauncher.utilsMod.LaunchErrorCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chromeLauncherStrings {
  @js.native
  sealed trait ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY extends LaunchErrorCodes
  
  @js.native
  sealed trait ERR_LAUNCHER_NOT_INSTALLED extends LaunchErrorCodes
  
  @js.native
  sealed trait ERR_LAUNCHER_PATH_NOT_SET extends LaunchErrorCodes
  
  @js.native
  sealed trait ERR_LAUNCHER_UNSUPPORTED_PLATFORM extends LaunchErrorCodes
  
  @js.native
  sealed trait aix extends js.Object
  
  @js.native
  sealed trait android extends js.Object
  
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait cygwin extends js.Object
  
  @js.native
  sealed trait darwin extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait freebsd extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait linux extends js.Object
  
  @js.native
  sealed trait netbsd extends js.Object
  
  @js.native
  sealed trait openbsd extends js.Object
  
  @js.native
  sealed trait silent extends js.Object
  
  @js.native
  sealed trait sunos extends js.Object
  
  @js.native
  sealed trait verbose extends js.Object
  
  @js.native
  sealed trait win32 extends js.Object
  
  @js.native
  sealed trait wsl extends js.Object
  
  @scala.inline
  def ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY: ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY = "ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY".asInstanceOf[ERR_LAUNCHER_INVALID_USER_DATA_DIRECTORY]
  @scala.inline
  def ERR_LAUNCHER_NOT_INSTALLED: ERR_LAUNCHER_NOT_INSTALLED = "ERR_LAUNCHER_NOT_INSTALLED".asInstanceOf[ERR_LAUNCHER_NOT_INSTALLED]
  @scala.inline
  def ERR_LAUNCHER_PATH_NOT_SET: ERR_LAUNCHER_PATH_NOT_SET = "ERR_LAUNCHER_PATH_NOT_SET".asInstanceOf[ERR_LAUNCHER_PATH_NOT_SET]
  @scala.inline
  def ERR_LAUNCHER_UNSUPPORTED_PLATFORM: ERR_LAUNCHER_UNSUPPORTED_PLATFORM = "ERR_LAUNCHER_UNSUPPORTED_PLATFORM".asInstanceOf[ERR_LAUNCHER_UNSUPPORTED_PLATFORM]
  @scala.inline
  def aix: aix = "aix".asInstanceOf[aix]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def cygwin: cygwin = "cygwin".asInstanceOf[cygwin]
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def freebsd: freebsd = "freebsd".asInstanceOf[freebsd]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def netbsd: netbsd = "netbsd".asInstanceOf[netbsd]
  @scala.inline
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def sunos: sunos = "sunos".asInstanceOf[sunos]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
  @scala.inline
  def wsl: wsl = "wsl".asInstanceOf[wsl]
}

