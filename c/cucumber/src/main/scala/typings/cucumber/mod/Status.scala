package typings.cucumber.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
@JSImport("cucumber", "Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status with String] = js.native
  
  @js.native
  sealed trait AMBIGUOUS extends Status
  /* "ambiguous" */ @js.native
  object AMBIGUOUS extends TopLevel[AMBIGUOUS with String]
  
  @js.native
  sealed trait FAILED extends Status
  /* "failed" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  @js.native
  sealed trait PASSED extends Status
  /* "passed" */ @js.native
  object PASSED extends TopLevel[PASSED with String]
  
  @js.native
  sealed trait PENDING extends Status
  /* "pending" */ @js.native
  object PENDING extends TopLevel[PENDING with String]
  
  @js.native
  sealed trait SKIPPED extends Status
  /* "skipped" */ @js.native
  object SKIPPED extends TopLevel[SKIPPED with String]
  
  @js.native
  sealed trait UNDEFINED extends Status
  /* "undefined" */ @js.native
  object UNDEFINED extends TopLevel[UNDEFINED with String]
}
