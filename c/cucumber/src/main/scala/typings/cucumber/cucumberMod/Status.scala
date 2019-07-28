package typings.cucumber.cucumberMod

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
  
  /* "ambiguous" */ val AMBIGUOUS: typings.cucumber.cucumberMod.Status.AMBIGUOUS with String = js.native
  /* "failed" */ val FAILED: typings.cucumber.cucumberMod.Status.FAILED with String = js.native
  /* "passed" */ val PASSED: typings.cucumber.cucumberMod.Status.PASSED with String = js.native
  /* "pending" */ val PENDING: typings.cucumber.cucumberMod.Status.PENDING with String = js.native
  /* "skipped" */ val SKIPPED: typings.cucumber.cucumberMod.Status.SKIPPED with String = js.native
  /* "undefined" */ val UNDEFINED: typings.cucumber.cucumberMod.Status.UNDEFINED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status with String] = js.native
}

