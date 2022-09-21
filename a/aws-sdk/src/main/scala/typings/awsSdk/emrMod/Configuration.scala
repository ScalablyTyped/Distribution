package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * The classification within a configuration.
    */
  var Classification: js.UndefOr[String] = js.undefined
  
  /**
    * A list of additional configurations to apply within a configuration object.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * A set of properties specified within a configuration classification.
    */
  var Properties: js.UndefOr[StringMap] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setClassification(value: String): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "Classification", js.undefined)
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setProperties(value: StringMap): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
