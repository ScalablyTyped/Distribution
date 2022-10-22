package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.awsSdkUtilEndpointsStrings.error
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ConditionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesErrorRuleObjectMod {
  
  trait ErrorRuleObject extends StObject {
    
    var conditions: js.UndefOr[js.Array[ConditionObject]] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var error: Expression
    
    var `type`: error
  }
  object ErrorRuleObject {
    
    inline def apply(error: Expression): ErrorRuleObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorRuleObject]
    }
    
    extension [Self <: ErrorRuleObject](x: Self) {
      
      inline def setConditions(value: js.Array[ConditionObject]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: ConditionObject*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setError(value: Expression): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
