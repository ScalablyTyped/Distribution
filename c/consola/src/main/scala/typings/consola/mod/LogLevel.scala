package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait Debug
    extends StObject
       with LogLevel
  /* 4 */ val Debug: typings.consola.mod.LogLevel.Debug & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with LogLevel
  /* 0 */ val Error: typings.consola.mod.LogLevel.Error & Double = js.native
  
  @js.native
  sealed trait Fatal
    extends StObject
       with LogLevel
  /* 0 */ val Fatal: typings.consola.mod.LogLevel.Fatal & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with LogLevel
  /* 3 */ val Info: typings.consola.mod.LogLevel.Info & Double = js.native
  
  @js.native
  sealed trait Log
    extends StObject
       with LogLevel
  /* 2 */ val Log: typings.consola.mod.LogLevel.Log & Double = js.native
  
  @js.native
  sealed trait Silent
    extends StObject
       with LogLevel
  /* -Infinity */ val Silent: typings.consola.mod.LogLevel.Silent & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with LogLevel
  /* 3 */ val Success: typings.consola.mod.LogLevel.Success & Double = js.native
  
  @js.native
  sealed trait Trace
    extends StObject
       with LogLevel
  /* 5 */ val Trace: typings.consola.mod.LogLevel.Trace & Double = js.native
  
  @js.native
  sealed trait Verbose
    extends StObject
       with LogLevel
  /* Infinity */ val Verbose: typings.consola.mod.LogLevel.Verbose & Double = js.native
  
  @js.native
  sealed trait Warn
    extends StObject
       with LogLevel
  /* 1 */ val Warn: typings.consola.mod.LogLevel.Warn & Double = js.native
}
