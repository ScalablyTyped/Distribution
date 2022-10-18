package typings.awsSdkBuildTypes.buildCustomizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * valid value for this configuration property.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String
  
  var `type`: value
}
object DefaultValue {
  
  inline def apply(expression: String): DefaultValue = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
