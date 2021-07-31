package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetRequest extends StObject {
  
  /**
    * A data structure that contains the name of the configuration set.
    */
  var ConfigurationSet: typings.awsSdk.sesMod.ConfigurationSet
}
object CreateConfigurationSetRequest {
  
  @scala.inline
  def apply(ConfigurationSet: ConfigurationSet): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSet = ConfigurationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetRequestMutableBuilder[Self <: CreateConfigurationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSet(value: ConfigurationSet): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
  }
}
