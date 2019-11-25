package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.Configuration
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.Middleware
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.ParameterSuppression
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.ParserDecorator
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.SyntheticParameter
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.input
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.output
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.ConfigCustomizationDefinition
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.MiddlewareCustomizationDefinition
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends js.Object

object CustomizationDefinition {
  @scala.inline
  def ConfigCustomizationDefinition(configuration: ConfigurationDefinition, `type`: Configuration): CustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizationDefinition]
  }
  @scala.inline
  def SyntheticParameterCustomizationDefinition(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String,
    imports: js.Array[Import] = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): CustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizationDefinition]
  }
  @scala.inline
  def ParserDecoratorCustomizationDefinition(
    expression: String,
    priority: Double,
    `type`: ParserDecorator,
    configuration: ConfigurationDefinition = null,
    imports: js.Array[Import] = null
  ): CustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizationDefinition]
  }
  @scala.inline
  def ParameterSuppressionCustomizationDefinition(location: input | output, name: String, `type`: ParameterSuppression): CustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizationDefinition]
  }
  @scala.inline
  def MiddlewareCustomizationDefinition(
    expression: String,
    priority: Double,
    step: Step,
    `type`: Middleware,
    conditionExpression: String = null,
    configuration: ConfigurationDefinition = null,
    imports: js.Array[Import] = null,
    tags: String = null
  ): CustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizationDefinition]
  }
}

