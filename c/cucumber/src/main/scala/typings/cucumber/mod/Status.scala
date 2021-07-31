package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("cucumber", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status & String] = js.native
  
  @js.native
  sealed trait AMBIGUOUS
    extends StObject
       with Status
  /* "ambiguous" */ val AMBIGUOUS: typings.cucumber.mod.Status.AMBIGUOUS & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with Status
  /* "failed" */ val FAILED: typings.cucumber.mod.Status.FAILED & String = js.native
  
  @js.native
  sealed trait PASSED
    extends StObject
       with Status
  /* "passed" */ val PASSED: typings.cucumber.mod.Status.PASSED & String = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with Status
  /* "pending" */ val PENDING: typings.cucumber.mod.Status.PENDING & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with Status
  /* "skipped" */ val SKIPPED: typings.cucumber.mod.Status.SKIPPED & String = js.native
  
  @js.native
  sealed trait UNDEFINED
    extends StObject
       with Status
  /* "undefined" */ val UNDEFINED: typings.cucumber.mod.Status.UNDEFINED & String = js.native
}
