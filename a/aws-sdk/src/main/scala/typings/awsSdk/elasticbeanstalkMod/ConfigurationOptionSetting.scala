package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationOptionSetting extends StObject {
  
  /**
    * A unique namespace that identifies the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
  
  /**
    * A unique resource name for the option setting. Use it for a time–based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceName] = js.undefined
  
  /**
    * The current value for the configuration option.
    */
  var Value: js.UndefOr[ConfigurationOptionValue] = js.undefined
}
object ConfigurationOptionSetting {
  
  inline def apply(): ConfigurationOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionSetting]
  }
  
  extension [Self <: ConfigurationOptionSetting](x: Self) {
    
    inline def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOptionName(value: ConfigurationOptionName): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setValue(value: ConfigurationOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
