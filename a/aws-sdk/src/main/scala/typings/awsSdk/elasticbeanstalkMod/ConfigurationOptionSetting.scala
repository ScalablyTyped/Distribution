package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptionSetting extends StObject {
  
  /**
    * A unique namespace that identifies the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  
  /**
    * A unique resource name for the option setting. Use it for a time–based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceName] = js.native
  
  /**
    * The current value for the configuration option.
    */
  var Value: js.UndefOr[ConfigurationOptionValue] = js.native
}
object ConfigurationOptionSetting {
  
  @scala.inline
  def apply(): ConfigurationOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionSetting]
  }
  
  @scala.inline
  implicit class ConfigurationOptionSettingMutableBuilder[Self <: ConfigurationOptionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setOptionName(value: ConfigurationOptionName): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    @scala.inline
    def setValue(value: ConfigurationOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
