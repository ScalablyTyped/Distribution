package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationTag extends StObject {
  
  /**
    * The configuration ID for the item to tag. You can specify a list of keys and values.
    */
  var configurationId: js.UndefOr[ConfigurationId] = js.native
  
  /**
    * A type of IT asset to tag.
    */
  var configurationType: js.UndefOr[ConfigurationItemType] = js.native
  
  /**
    * A type of tag on which to filter. For example, serverType.
    */
  var key: js.UndefOr[TagKey] = js.native
  
  /**
    * The time the configuration tag was created in Coordinated Universal Time (UTC).
    */
  var timeOfCreation: js.UndefOr[TimeStamp] = js.native
  
  /**
    * A value on which to filter. For example key = serverType and value = web server.
    */
  var value: js.UndefOr[TagValue] = js.native
}
object ConfigurationTag {
  
  @scala.inline
  def apply(): ConfigurationTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTag]
  }
  
  @scala.inline
  implicit class ConfigurationTagMutableBuilder[Self <: ConfigurationTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: ConfigurationItemType): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUndefined: Self = StObject.set(x, "configurationType", js.undefined)
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTimeOfCreation(value: TimeStamp): Self = StObject.set(x, "timeOfCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOfCreationUndefined: Self = StObject.set(x, "timeOfCreation", js.undefined)
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
