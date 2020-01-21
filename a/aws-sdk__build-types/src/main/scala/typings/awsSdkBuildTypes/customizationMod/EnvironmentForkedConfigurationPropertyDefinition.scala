package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.forked
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
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentForkedConfigurationPropertyDefinition]
  }
}

