package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationTag extends StObject {
  
  /**
    * The configuration ID for the item to tag. You can specify a list of keys and values.
    */
  var configurationId: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * A type of IT asset to tag.
    */
  var configurationType: js.UndefOr[ConfigurationItemType] = js.undefined
  
  /**
    * A type of tag on which to filter. For example, serverType.
    */
  var key: js.UndefOr[TagKey] = js.undefined
  
  /**
    * The time the configuration tag was created in Coordinated Universal Time (UTC).
    */
  var timeOfCreation: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value on which to filter. For example key = serverType and value = web server.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}
object ConfigurationTag {
  
  inline def apply(): ConfigurationTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTag]
  }
  
  extension [Self <: ConfigurationTag](x: Self) {
    
    inline def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    inline def setConfigurationType(value: ConfigurationItemType): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeUndefined: Self = StObject.set(x, "configurationType", js.undefined)
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTimeOfCreation(value: js.Date): Self = StObject.set(x, "timeOfCreation", value.asInstanceOf[js.Any])
    
    inline def setTimeOfCreationUndefined: Self = StObject.set(x, "timeOfCreation", js.undefined)
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
