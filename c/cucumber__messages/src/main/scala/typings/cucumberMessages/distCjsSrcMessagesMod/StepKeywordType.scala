package typings.cucumberMessages.distCjsSrcMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepKeywordType extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "StepKeywordType")
@js.native
object StepKeywordType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepKeywordType & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with StepKeywordType
  /* "Action" */ val ACTION: typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.ACTION & String = js.native
  
  @js.native
  sealed trait CONJUNCTION
    extends StObject
       with StepKeywordType
  /* "Conjunction" */ val CONJUNCTION: typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.CONJUNCTION & String = js.native
  
  @js.native
  sealed trait CONTEXT
    extends StObject
       with StepKeywordType
  /* "Context" */ val CONTEXT: typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.CONTEXT & String = js.native
  
  @js.native
  sealed trait OUTCOME
    extends StObject
       with StepKeywordType
  /* "Outcome" */ val OUTCOME: typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.OUTCOME & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with StepKeywordType
  /* "Unknown" */ val UNKNOWN: typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.UNKNOWN & String = js.native
}
