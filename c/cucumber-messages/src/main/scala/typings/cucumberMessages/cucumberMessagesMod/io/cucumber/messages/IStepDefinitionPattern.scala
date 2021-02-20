package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinitionPattern. */
@js.native
trait IStepDefinitionPattern extends StObject {
  
  /** StepDefinitionPattern source */
  var source: js.UndefOr[String | Null] = js.native
  
  /** StepDefinitionPattern type */
  var `type`: js.UndefOr[StepDefinitionPatternType | Null] = js.native
}
object IStepDefinitionPattern {
  
  @scala.inline
  def apply(): IStepDefinitionPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinitionPattern]
  }
  
  @scala.inline
  implicit class IStepDefinitionPatternMutableBuilder[Self <: IStepDefinitionPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: StepDefinitionPatternType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
