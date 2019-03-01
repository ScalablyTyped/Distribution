package typings
package builderDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object builderDashUtilLibStrings {
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait arm64
    extends builderDashUtilLib.outArchMod.ArchType
  
  @js.native
  sealed trait armv7l
    extends builderDashUtilLib.outArchMod.ArchType
  
  @js.native
  sealed trait debug
    extends builderDashUtilLib.outLogMod.LogLevel
  
  @js.native
  sealed trait error
    extends builderDashUtilLib.outLogMod.LogLevel
  
  @js.native
  sealed trait ia32
    extends builderDashUtilLib.outArchMod.ArchType
  
  @js.native
  sealed trait info
    extends builderDashUtilLib.outLogMod.LogLevel
  
  @js.native
  sealed trait notice
    extends builderDashUtilLib.outLogMod.LogLevel
  
  @js.native
  sealed trait warn
    extends builderDashUtilLib.outLogMod.LogLevel
  
  @js.native
  sealed trait x64
    extends builderDashUtilLib.outArchMod.ArchType
  
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def arm64: arm64 = "arm64".asInstanceOf[arm64]
  @scala.inline
  def armv7l: armv7l = "armv7l".asInstanceOf[armv7l]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def ia32: ia32 = "ia32".asInstanceOf[ia32]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
}

