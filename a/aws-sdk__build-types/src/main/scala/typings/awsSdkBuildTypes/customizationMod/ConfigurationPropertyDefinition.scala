package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.forked
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.unified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition
  - typings.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends js.Object
object ConfigurationPropertyDefinition {
  
  @scala.inline
  def UnifiedConfigurationPropertyDefinition(documentation: String, inputType: String, required: Boolean, `type`: unified): ConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition]
  }
  
  @scala.inline
  def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  ): ConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition]
  }
}
