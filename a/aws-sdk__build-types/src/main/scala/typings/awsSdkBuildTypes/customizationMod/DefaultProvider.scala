package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProvider extends StObject {
  
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * function that, when called, will return a valid value for this
    * configuration property.
    *
    * This function will be called with the full configuration object at its
    * current point in processing.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String
  
  var `type`: provider
}
object DefaultProvider {
  
  inline def apply(expression: String): DefaultProvider = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("provider")
    __obj.asInstanceOf[DefaultProvider]
  }
  
  extension [Self <: DefaultProvider](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: provider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
