package typings.cucumberMessages.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepDefinitionPatternType extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "StepDefinitionPatternType")
@js.native
object StepDefinitionPatternType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepDefinitionPatternType & String] = js.native
  
  @js.native
  sealed trait CUCUMBER_EXPRESSION
    extends StObject
       with StepDefinitionPatternType
  /* "CUCUMBER_EXPRESSION" */ val CUCUMBER_EXPRESSION: typings.cucumberMessages.messagesMod.StepDefinitionPatternType.CUCUMBER_EXPRESSION & String = js.native
  
  @js.native
  sealed trait REGULAR_EXPRESSION
    extends StObject
       with StepDefinitionPatternType
  /* "REGULAR_EXPRESSION" */ val REGULAR_EXPRESSION: typings.cucumberMessages.messagesMod.StepDefinitionPatternType.REGULAR_EXPRESSION & String = js.native
}
