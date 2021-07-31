package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition
  - typings.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends StObject
object ConfigurationPropertyDefinition {
  
  @scala.inline
  def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation
  ): typings.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forked")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition]
  }
  
  @scala.inline
  def UnifiedConfigurationPropertyDefinition(documentation: String, inputType: String, required: Boolean): typings.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unified")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition]
  }
}
