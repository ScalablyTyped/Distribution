package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.forked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentForkedConfigurationPropertyDefinition
  extends ConfigurationPropertyDefinitionSharedAttributes
     with ConfigurationPropertyDefinition {
  
  /**
    * The generation configuration to apply when creating an SDK for a browser
    * runtime environment.
    */
  var browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
  
  /**
    * The generation configuration to apply when creating an SDK for a Node.JS
    * runtime environment.
    */
  var node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
  
  var `type`: forked = js.native
  
  /**
    * The generation configuration to apply when creating an SDK for an
    * isomorphic runtime environment.
    */
  var universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
}
object EnvironmentForkedConfigurationPropertyDefinition {
  
  @scala.inline
  def apply(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  ): EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentForkedConfigurationPropertyDefinition]
  }
  
  @scala.inline
  implicit class EnvironmentForkedConfigurationPropertyDefinitionMutableBuilder[Self <: EnvironmentForkedConfigurationPropertyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: forked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversal(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
  }
}
