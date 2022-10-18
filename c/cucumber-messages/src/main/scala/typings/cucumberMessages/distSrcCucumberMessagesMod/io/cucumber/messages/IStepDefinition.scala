package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinition. */
trait IStepDefinition extends StObject {
  
  /** StepDefinition id */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** StepDefinition pattern */
  var pattern: js.UndefOr[IStepDefinitionPattern | Null] = js.undefined
  
  /** StepDefinition sourceReference */
  var sourceReference: js.UndefOr[ISourceReference | Null] = js.undefined
}
object IStepDefinition {
  
  inline def apply(): IStepDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinition]
  }
  
  extension [Self <: IStepDefinition](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPattern(value: IStepDefinitionPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSourceReference(value: ISourceReference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceNull: Self = StObject.set(x, "sourceReference", null)
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
  }
}
