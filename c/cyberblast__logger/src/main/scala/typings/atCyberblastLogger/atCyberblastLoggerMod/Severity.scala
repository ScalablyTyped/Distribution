package typings.atCyberblastLogger.atCyberblastLoggerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("@cyberblast/logger", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Error extends Severity
  
  @js.native
  sealed trait Info extends Severity
  
  @js.native
  sealed trait Verbose extends Severity
  
  @js.native
  sealed trait Warning extends Severity
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Severity with String] = js.native
  /* "Error" */ @js.native
  object Error extends TopLevel[Error with String]
  
  /* "Info" */ @js.native
  object Info extends TopLevel[Info with String]
  
  /* "Verbose" */ @js.native
  object Verbose extends TopLevel[Verbose with String]
  
  /* "Warning" */ @js.native
  object Warning extends TopLevel[Warning with String]
  
}

