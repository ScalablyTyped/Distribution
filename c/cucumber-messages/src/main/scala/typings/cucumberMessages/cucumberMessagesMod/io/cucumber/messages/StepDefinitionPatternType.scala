package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepDefinitionPatternType extends js.Object
/** StepDefinitionPatternType enum. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPatternType")
@js.native
object StepDefinitionPatternType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StepDefinitionPatternType with Double] = js.native
  
  @js.native
  sealed trait CUCUMBER_EXPRESSION extends StepDefinitionPatternType
  /* 0 */ @js.native
  object CUCUMBER_EXPRESSION extends TopLevel[CUCUMBER_EXPRESSION with Double]
  
  @js.native
  sealed trait REGULAR_EXPRESSION extends StepDefinitionPatternType
  /* 1 */ @js.native
  object REGULAR_EXPRESSION extends TopLevel[REGULAR_EXPRESSION with Double]
}
