package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinitionPattern. */
trait IStepDefinitionPattern extends StObject {
  
  /** StepDefinitionPattern source */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /** StepDefinitionPattern type */
  var `type`: js.UndefOr[StepDefinitionPatternType | Null] = js.undefined
}
object IStepDefinitionPattern {
  
  inline def apply(): IStepDefinitionPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinitionPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStepDefinitionPattern] (val x: Self) extends AnyVal {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: StepDefinitionPatternType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
