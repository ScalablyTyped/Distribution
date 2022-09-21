package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * The classification within a configuration.
    */
  var classification: String1024
  
  /**
    * A list of additional configurations to apply within a configuration object.
    */
  var configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * A set of properties specified within a configuration classification.
    */
  var properties: js.UndefOr[SensitivePropertiesMap] = js.undefined
}
object Configuration {
  
  inline def apply(classification: String1024): Configuration = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setClassification(value: String1024): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "configurations", js.Array(value*))
    
    inline def setProperties(value: SensitivePropertiesMap): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
