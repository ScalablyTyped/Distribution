package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDefaultMessageTypeRequest extends StObject {
  
  /**
    * The name of the configuration set or the configuration set Amazon Resource Name (ARN) to delete the default message type from. The ConfigurationSetName and ConfigurationSetArn can be found using the DescribeConfigurationSets action.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
}
object DeleteDefaultMessageTypeRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn): DeleteDefaultMessageTypeRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDefaultMessageTypeRequest]
  }
  
  extension [Self <: DeleteDefaultMessageTypeRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
