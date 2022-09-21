package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultSenderIdRequest extends StObject {
  
  /**
    * The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
  
  /**
    * The current sender ID for the configuration set. When sending a text message to a destination country which supports SenderIds, the default sender ID on the configuration set specified on SendTextMessage will be used if no dedicated origination phone numbers or registered SenderIds are available in your account, instead of a generic sender ID, such as 'NOTICE'.
    */
  var SenderId: typings.awsSdk.pinpointsmsvoicev2Mod.SenderId
}
object SetDefaultSenderIdRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn, SenderId: SenderId): SetDefaultSenderIdRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultSenderIdRequest]
  }
  
  extension [Self <: SetDefaultSenderIdRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setSenderId(value: SenderId): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
  }
}
