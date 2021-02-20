package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("cucumber", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status with String] = js.native
  
  @js.native
  sealed trait AMBIGUOUS extends Status
  /* "ambiguous" */ val AMBIGUOUS: typings.cucumber.mod.Status.AMBIGUOUS with String = js.native
  
  @js.native
  sealed trait FAILED extends Status
  /* "failed" */ val FAILED: typings.cucumber.mod.Status.FAILED with String = js.native
  
  @js.native
  sealed trait PASSED extends Status
  /* "passed" */ val PASSED: typings.cucumber.mod.Status.PASSED with String = js.native
  
  @js.native
  sealed trait PENDING extends Status
  /* "pending" */ val PENDING: typings.cucumber.mod.Status.PENDING with String = js.native
  
  @js.native
  sealed trait SKIPPED extends Status
  /* "skipped" */ val SKIPPED: typings.cucumber.mod.Status.SKIPPED with String = js.native
  
  @js.native
  sealed trait UNDEFINED extends Status
  /* "undefined" */ val UNDEFINED: typings.cucumber.mod.Status.UNDEFINED with String = js.native
}
