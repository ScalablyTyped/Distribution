package typings.cyberblastLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Severity extends js.Object
@JSImport("@cyberblast/logger", "Severity")
@js.native
object Severity extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Severity with String] = js.native
  
  @js.native
  sealed trait Error extends Severity
  /* "Error" */ @js.native
  object Error extends TopLevel[Error with String]
  
  @js.native
  sealed trait Info extends Severity
  /* "Info" */ @js.native
  object Info extends TopLevel[Info with String]
  
  @js.native
  sealed trait Verbose extends Severity
  /* "Verbose" */ @js.native
  object Verbose extends TopLevel[Verbose with String]
  
  @js.native
  sealed trait Warning extends Severity
  /* "Warning" */ @js.native
  object Warning extends TopLevel[Warning with String]
}
