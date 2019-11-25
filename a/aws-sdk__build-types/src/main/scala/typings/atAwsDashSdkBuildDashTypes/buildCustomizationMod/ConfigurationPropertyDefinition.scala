package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.forked
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.unified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition
  - typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends js.Object

object ConfigurationPropertyDefinition {
  @scala.inline
  def UnifiedConfigurationPropertyDefinition(
    documentation: String,
    inputType: String,
    required: Boolean,
    `type`: unified,
    apply: String = null,
    default: DefaultValue | DefaultProvider = null,
    imports: js.Array[Import] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    normalize: String = null,
    resolvedType: String = null
  ): ConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition]
  }
  @scala.inline
  def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    imports: js.Array[Import] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    resolvedType: String = null
  ): ConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition]
  }
}

