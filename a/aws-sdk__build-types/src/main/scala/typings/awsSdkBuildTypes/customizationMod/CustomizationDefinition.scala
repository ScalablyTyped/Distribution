package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Configuration
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParserDecorator
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkTypes.middlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def ConfigCustomizationDefinition(configuration: ConfigurationDefinition, `type`: Configuration): typings.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition]
  }
  
  @scala.inline
  def MiddlewareCustomizationDefinition(expression: String, priority: Double, step: Step, `type`: Middleware): typings.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition]
  }
  
  @scala.inline
  def ParameterSuppressionCustomizationDefinition(location: input | output, name: String, `type`: ParameterSuppression): typings.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition]
  }
  
  @scala.inline
  def ParserDecoratorCustomizationDefinition(expression: String, priority: Double, `type`: ParserDecorator): typings.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition]
  }
  
  @scala.inline
  def SyntheticParameterCustomizationDefinition(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String
  ): typings.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition]
  }
}
