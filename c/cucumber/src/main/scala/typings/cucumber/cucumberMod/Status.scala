package typings.cucumber.cucumberMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("cucumber", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait AMBIGUOUS extends Status
  
  @js.native
  sealed trait FAILED extends Status
  
  @js.native
  sealed trait PASSED extends Status
  
  @js.native
  sealed trait PENDING extends Status
  
  @js.native
  sealed trait SKIPPED extends Status
  
  @js.native
  sealed trait UNDEFINED extends Status
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status with String] = js.native
  /* "ambiguous" */ @js.native
  object AMBIGUOUS extends TopLevel[AMBIGUOUS with String]
  
  /* "failed" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  /* "passed" */ @js.native
  object PASSED extends TopLevel[PASSED with String]
  
  /* "pending" */ @js.native
  object PENDING extends TopLevel[PENDING with String]
  
  /* "skipped" */ @js.native
  object SKIPPED extends TopLevel[SKIPPED with String]
  
  /* "undefined" */ @js.native
  object UNDEFINED extends TopLevel[UNDEFINED with String]
  
}

