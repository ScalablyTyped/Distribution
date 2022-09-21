package typings.builderUtil

import typings.builderUtil.archMod.ArchType
import typings.builderUtil.logMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderUtilStrings {
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait arm64
    extends StObject
       with ArchType
  inline def arm64: arm64 = "arm64".asInstanceOf[arm64]
  
  @js.native
  sealed trait armv7l
    extends StObject
       with ArchType
  inline def armv7l: armv7l = "armv7l".asInstanceOf[armv7l]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait ia32
    extends StObject
       with ArchType
  inline def ia32: ia32 = "ia32".asInstanceOf[ia32]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice
    extends StObject
       with LogLevel
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait universal
    extends StObject
       with ArchType
  inline def universal: universal = "universal".asInstanceOf[universal]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait x64
    extends StObject
       with ArchType
  inline def x64: x64 = "x64".asInstanceOf[x64]
}
