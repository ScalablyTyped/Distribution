package typings.awsSdkBuildTypes.buildCustomizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterSuppressionCustomizationDefinition
  extends StObject
     with CustomizationDefinition {
  
  /**
    * The I/O shape from which this parameter should be suppressed.
    */
  var location: input | output
  
  /**
    * The name of the property to be suppressed. The property will be removed
    * from the input or output shape interface, but the underlying
    * serialization will not be changed.
    */
  var name: String
  
  var `type`: ParameterSuppression
}
object ParameterSuppressionCustomizationDefinition {
  
  inline def apply(location: input | output, name: String): ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterSuppression")
    __obj.asInstanceOf[ParameterSuppressionCustomizationDefinition]
  }
  
  extension [Self <: ParameterSuppressionCustomizationDefinition](x: Self) {
    
    inline def setLocation(value: input | output): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParameterSuppression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
