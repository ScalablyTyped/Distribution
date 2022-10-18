package typings.awsSdkBuildTypes.buildCustomizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition
  - typings.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends StObject
object ConfigurationPropertyDefinition {
  
  inline def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation
  ): typings.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forked")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition]
  }
  
  inline def UnifiedConfigurationPropertyDefinition(documentation: String, inputType: String, required: Boolean): typings.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unified")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition]
  }
}
