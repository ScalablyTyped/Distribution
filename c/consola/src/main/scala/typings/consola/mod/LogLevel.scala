package typings.consola.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait Debug extends LogLevel
  /* 4 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  @js.native
  sealed trait Error extends LogLevel
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Fatal extends LogLevel
  /* 0 */ @js.native
  object Fatal extends TopLevel[Fatal with Double]
  
  @js.native
  sealed trait Info extends LogLevel
  /* 3 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  @js.native
  sealed trait Log extends LogLevel
  /* 2 */ @js.native
  object Log extends TopLevel[Log with Double]
  
  @js.native
  sealed trait Silent extends LogLevel
  /* -Infinity */ @js.native
  object Silent extends TopLevel[Silent with Double]
  
  @js.native
  sealed trait Success extends LogLevel
  /* 3 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  @js.native
  sealed trait Trace extends LogLevel
  /* 5 */ @js.native
  object Trace extends TopLevel[Trace with Double]
  
  @js.native
  sealed trait Verbose extends LogLevel
  /* Infinity */ @js.native
  object Verbose extends TopLevel[Verbose with Double]
  
  @js.native
  sealed trait Warn extends LogLevel
  /* 1 */ @js.native
  object Warn extends TopLevel[Warn with Double]
}
