package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libModelsStepDefinitionMod.default
import typings.cucumberMessages.mod.UndefinedParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDefinitions extends StObject {
  
  var stepDefinitions: js.Array[default]
  
  var undefinedParameterTypes: js.Array[UndefinedParameterType]
}
object StepDefinitions {
  
  inline def apply(stepDefinitions: js.Array[default], undefinedParameterTypes: js.Array[UndefinedParameterType]): StepDefinitions = {
    val __obj = js.Dynamic.literal(stepDefinitions = stepDefinitions.asInstanceOf[js.Any], undefinedParameterTypes = undefinedParameterTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepDefinitions] (val x: Self) extends AnyVal {
    
    inline def setStepDefinitions(value: js.Array[default]): Self = StObject.set(x, "stepDefinitions", value.asInstanceOf[js.Any])
    
    inline def setStepDefinitionsVarargs(value: default*): Self = StObject.set(x, "stepDefinitions", js.Array(value*))
    
    inline def setUndefinedParameterTypes(value: js.Array[UndefinedParameterType]): Self = StObject.set(x, "undefinedParameterTypes", value.asInstanceOf[js.Any])
    
    inline def setUndefinedParameterTypesVarargs(value: UndefinedParameterType*): Self = StObject.set(x, "undefinedParameterTypes", js.Array(value*))
  }
}
