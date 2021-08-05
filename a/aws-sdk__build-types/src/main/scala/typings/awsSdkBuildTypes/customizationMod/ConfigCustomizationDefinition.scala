package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigCustomizationDefinition
  extends StObject
     with CustomizationDefinition {
  
  var configuration: ConfigurationDefinition
  
  var `type`: Configuration
}
object ConfigCustomizationDefinition {
  
  inline def apply(configuration: ConfigurationDefinition): ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Configuration")
    __obj.asInstanceOf[ConfigCustomizationDefinition]
  }
  
  extension [Self <: ConfigCustomizationDefinition](x: Self) {
    
    inline def setConfiguration(value: ConfigurationDefinition): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setType(value: Configuration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
