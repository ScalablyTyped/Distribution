package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterSuppressionCustomizationDefinition extends CustomizationDefinition {
  
  /**
    * The I/O shape from which this parameter should be suppressed.
    */
  var location: input | output = js.native
  
  /**
    * The name of the property to be suppressed. The property will be removed
    * from the input or output shape interface, but the underlying
    * serialization will not be changed.
    */
  var name: String = js.native
  
  var `type`: ParameterSuppression = js.native
}
object ParameterSuppressionCustomizationDefinition {
  
  @scala.inline
  def apply(location: input | output, name: String, `type`: ParameterSuppression): ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterSuppressionCustomizationDefinition]
  }
  
  @scala.inline
  implicit class ParameterSuppressionCustomizationDefinitionMutableBuilder[Self <: ParameterSuppressionCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: input | output): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ParameterSuppression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
