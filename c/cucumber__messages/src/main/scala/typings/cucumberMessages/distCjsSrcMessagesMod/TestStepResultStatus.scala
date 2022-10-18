package typings.cucumberMessages.distCjsSrcMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestStepResultStatus extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "TestStepResultStatus")
@js.native
object TestStepResultStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TestStepResultStatus & String] = js.native
  
  @js.native
  sealed trait AMBIGUOUS
    extends StObject
       with TestStepResultStatus
  /* "AMBIGUOUS" */ val AMBIGUOUS: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.AMBIGUOUS & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with TestStepResultStatus
  /* "FAILED" */ val FAILED: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.FAILED & String = js.native
  
  @js.native
  sealed trait PASSED
    extends StObject
       with TestStepResultStatus
  /* "PASSED" */ val PASSED: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.PASSED & String = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with TestStepResultStatus
  /* "PENDING" */ val PENDING: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.PENDING & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with TestStepResultStatus
  /* "SKIPPED" */ val SKIPPED: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.SKIPPED & String = js.native
  
  @js.native
  sealed trait UNDEFINED
    extends StObject
       with TestStepResultStatus
  /* "UNDEFINED" */ val UNDEFINED: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.UNDEFINED & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with TestStepResultStatus
  /* "UNKNOWN" */ val UNKNOWN: typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus.UNKNOWN & String = js.native
}
