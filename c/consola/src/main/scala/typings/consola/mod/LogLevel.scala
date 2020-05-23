package typings.consola.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait Debug extends LogLevel
  
  @js.native
  sealed trait Error extends LogLevel
  
  @js.native
  sealed trait Fatal extends LogLevel
  
  @js.native
  sealed trait Info extends LogLevel
  
  @js.native
  sealed trait Log extends LogLevel
  
  @js.native
  sealed trait Silent extends LogLevel
  
  @js.native
  sealed trait Success extends LogLevel
  
  @js.native
  sealed trait Trace extends LogLevel
  
  @js.native
  sealed trait Warn extends LogLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  /* 4 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 0 */ @js.native
  object Fatal extends TopLevel[Fatal with Double]
  
  /* 3 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 2 */ @js.native
  object Log extends TopLevel[Log with Double]
  
  /* Infinity */ @js.native
  object Silent extends TopLevel[Silent with Double]
  
  /* 3 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 5 */ @js.native
  object Trace extends TopLevel[Trace with Double]
  
  /* 1 */ @js.native
  object Warn extends TopLevel[Warn with Double]
  
}

