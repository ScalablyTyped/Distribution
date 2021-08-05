package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkTypes.middlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition
  - typings.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition
  - typings.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition
  - typings.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition
  - typings.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends StObject
object CustomizationDefinition {
  
  inline def ConfigCustomizationDefinition(configuration: ConfigurationDefinition): typings.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Configuration")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition]
  }
  
  inline def MiddlewareCustomizationDefinition(expression: String, priority: Double, step: Step): typings.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Middleware")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition]
  }
  
  inline def ParameterSuppressionCustomizationDefinition(location: input | output, name: String): typings.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterSuppression")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition]
  }
  
  inline def ParserDecoratorCustomizationDefinition(expression: String, priority: Double): typings.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParserDecorator")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition]
  }
  
  inline def SyntheticParameterCustomizationDefinition(documentation: String, location: input | output, name: String, typeExpression: String): typings.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SyntheticParameter")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition]
  }
}
