package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigCustomizationDefinition extends CustomizationDefinition {
  
  var configuration: ConfigurationDefinition = js.native
  
  var `type`: Configuration = js.native
}
object ConfigCustomizationDefinition {
  
  @scala.inline
  def apply(configuration: ConfigurationDefinition, `type`: Configuration): ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigCustomizationDefinition]
  }
  
  @scala.inline
  implicit class ConfigCustomizationDefinitionMutableBuilder[Self <: ConfigCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ConfigurationDefinition): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Configuration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
