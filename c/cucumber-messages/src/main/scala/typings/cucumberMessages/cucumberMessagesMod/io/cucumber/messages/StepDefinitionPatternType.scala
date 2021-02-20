package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepDefinitionPatternType extends StObject
/** StepDefinitionPatternType enum. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPatternType")
@js.native
object StepDefinitionPatternType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StepDefinitionPatternType with Double] = js.native
  
  @js.native
  sealed trait CUCUMBER_EXPRESSION extends StepDefinitionPatternType
  /* 0 */ val CUCUMBER_EXPRESSION: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPatternType.CUCUMBER_EXPRESSION with Double = js.native
  
  @js.native
  sealed trait REGULAR_EXPRESSION extends StepDefinitionPatternType
  /* 1 */ val REGULAR_EXPRESSION: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinitionPatternType.REGULAR_EXPRESSION with Double = js.native
}
