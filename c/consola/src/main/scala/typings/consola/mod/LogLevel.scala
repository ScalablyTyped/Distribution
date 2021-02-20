package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait Debug extends LogLevel
  /* 4 */ val Debug: typings.consola.mod.LogLevel.Debug with Double = js.native
  
  @js.native
  sealed trait Error extends LogLevel
  /* 0 */ val Error: typings.consola.mod.LogLevel.Error with Double = js.native
  
  @js.native
  sealed trait Fatal extends LogLevel
  /* 0 */ val Fatal: typings.consola.mod.LogLevel.Fatal with Double = js.native
  
  @js.native
  sealed trait Info extends LogLevel
  /* 3 */ val Info: typings.consola.mod.LogLevel.Info with Double = js.native
  
  @js.native
  sealed trait Log extends LogLevel
  /* 2 */ val Log: typings.consola.mod.LogLevel.Log with Double = js.native
  
  @js.native
  sealed trait Silent extends LogLevel
  /* -Infinity */ val Silent: typings.consola.mod.LogLevel.Silent with Double = js.native
  
  @js.native
  sealed trait Success extends LogLevel
  /* 3 */ val Success: typings.consola.mod.LogLevel.Success with Double = js.native
  
  @js.native
  sealed trait Trace extends LogLevel
  /* 5 */ val Trace: typings.consola.mod.LogLevel.Trace with Double = js.native
  
  @js.native
  sealed trait Verbose extends LogLevel
  /* Infinity */ val Verbose: typings.consola.mod.LogLevel.Verbose with Double = js.native
  
  @js.native
  sealed trait Warn extends LogLevel
  /* 1 */ val Warn: typings.consola.mod.LogLevel.Warn with Double = js.native
}
