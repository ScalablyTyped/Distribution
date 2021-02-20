package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationSettingsDescriptions extends StObject {
  
  /**
    *  A list of ConfigurationSettingsDescription. 
    */
  var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.native
}
object ConfigurationSettingsDescriptions {
  
  @scala.inline
  def apply(): ConfigurationSettingsDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsDescriptions]
  }
  
  @scala.inline
  implicit class ConfigurationSettingsDescriptionsMutableBuilder[Self <: ConfigurationSettingsDescriptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSettings(value: ConfigurationSettingsDescriptionList): Self = StObject.set(x, "ConfigurationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSettingsUndefined: Self = StObject.set(x, "ConfigurationSettings", js.undefined)
    
    @scala.inline
    def setConfigurationSettingsVarargs(value: ConfigurationSettingsDescription*): Self = StObject.set(x, "ConfigurationSettings", js.Array(value :_*))
  }
}
