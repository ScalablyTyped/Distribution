package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to delete.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName
}
object DeleteConfigurationSetRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigurationSetRequestMutableBuilder[Self <: DeleteConfigurationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
