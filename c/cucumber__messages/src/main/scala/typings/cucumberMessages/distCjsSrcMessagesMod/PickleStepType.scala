package typings.cucumberMessages.distCjsSrcMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PickleStepType extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "PickleStepType")
@js.native
object PickleStepType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PickleStepType & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with PickleStepType
  /* "Action" */ val ACTION: typings.cucumberMessages.distCjsSrcMessagesMod.PickleStepType.ACTION & String = js.native
  
  @js.native
  sealed trait CONTEXT
    extends StObject
       with PickleStepType
  /* "Context" */ val CONTEXT: typings.cucumberMessages.distCjsSrcMessagesMod.PickleStepType.CONTEXT & String = js.native
  
  @js.native
  sealed trait OUTCOME
    extends StObject
       with PickleStepType
  /* "Outcome" */ val OUTCOME: typings.cucumberMessages.distCjsSrcMessagesMod.PickleStepType.OUTCOME & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with PickleStepType
  /* "Unknown" */ val UNKNOWN: typings.cucumberMessages.distCjsSrcMessagesMod.PickleStepType.UNKNOWN & String = js.native
}
