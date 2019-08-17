package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.forked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentForkedConfigurationPropertyDefinition
  extends ConfigurationPropertyDefinitionSharedAttributes
     with ConfigurationPropertyDefinition {
  /**
    * The generation configuration to apply when creating an SDK for a browser
    * runtime environment.
    */
  var browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  /**
    * The generation configuration to apply when creating an SDK for a Node.JS
    * runtime environment.
    */
  var node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  var `type`: forked
  /**
    * The generation configuration to apply when creating an SDK for an
    * isomorphic runtime environment.
    */
  var universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
}

object EnvironmentForkedConfigurationPropertyDefinition {
  @scala.inline
  def apply(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    imports: js.Array[Import] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    resolvedType: String = null
  ): EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser, documentation = documentation, inputType = inputType, node = node, universal = universal)
    __obj.updateDynamic("type")(`type`)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType)
    __obj.asInstanceOf[EnvironmentForkedConfigurationPropertyDefinition]
  }
}

