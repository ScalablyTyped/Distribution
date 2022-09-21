package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberRequest extends StObject {
  
  /**
    * By default this is set to false. When set to true the phone number can't be deleted. 
    */
  var DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The OptOutList to add the phone number to. Valid values for this field can be either the OutOutListName or OutOutListArn.
    */
  var OptOutListName: js.UndefOr[OptOutListNameOrArn] = js.undefined
  
  /**
    * The unique identifier of the phone number. Valid values for this field can be either the PhoneNumberId or PhoneNumberArn.
    */
  var PhoneNumberId: PhoneNumberIdOrArn
  
  /**
    * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out requests.
    */
  var SelfManagedOptOutsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the two way channel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * By default this is set to false. When set to true you can receive incoming text messages from your end recipients.
    */
  var TwoWayEnabled: js.UndefOr[Boolean] = js.undefined
}
object UpdatePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: PhoneNumberIdOrArn): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
  
  extension [Self <: UpdatePhoneNumberRequest](x: Self) {
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberIdOrArn): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabled(value: Boolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabledUndefined: Self = StObject.set(x, "SelfManagedOptOutsEnabled", js.undefined)
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: Boolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
    
    inline def setTwoWayEnabledUndefined: Self = StObject.set(x, "TwoWayEnabled", js.undefined)
  }
}
