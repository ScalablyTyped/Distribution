package typings.awsSdkBuildTypes.buildCustomizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkTypes.distTypesMiddlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition
  - typings.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition
  - typings.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition
  - typings.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition
  - typings.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends StObject
object CustomizationDefinition {
  
  inline def ConfigCustomizationDefinition(configuration: ConfigurationDefinition): typings.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Configuration")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition]
  }
  
  inline def MiddlewareCustomizationDefinition(expression: String, priority: Double, step: Step): typings.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Middleware")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition]
  }
  
  inline def ParameterSuppressionCustomizationDefinition(location: input | output, name: String): typings.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterSuppression")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition]
  }
  
  inline def ParserDecoratorCustomizationDefinition(expression: String, priority: Double): typings.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParserDecorator")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition]
  }
  
  inline def SyntheticParameterCustomizationDefinition(documentation: String, location: input | output, name: String, typeExpression: String): typings.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SyntheticParameter")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition]
  }
}
