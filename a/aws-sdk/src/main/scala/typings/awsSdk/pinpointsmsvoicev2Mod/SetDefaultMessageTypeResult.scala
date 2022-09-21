package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultMessageTypeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set that was updated.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The new default message type of the configuration set.
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MessageType] = js.undefined
}
object SetDefaultMessageTypeResult {
  
  inline def apply(): SetDefaultMessageTypeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDefaultMessageTypeResult]
  }
  
  extension [Self <: SetDefaultMessageTypeResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
  }
}
