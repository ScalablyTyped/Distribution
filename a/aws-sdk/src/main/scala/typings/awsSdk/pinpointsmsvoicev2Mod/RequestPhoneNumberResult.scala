package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPhoneNumberResult extends StObject {
  
  /**
    * The time when the phone number was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * By default this is set to false. When set to true the phone number can't be deleted. 
    */
  var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.IsoCountryCode] = js.undefined
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MessageType] = js.undefined
  
  /**
    * The monthly price, in US dollars, to lease the phone number.
    */
  var MonthlyLeasingPrice: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the phone number will be used for text messages, voice messages or both. 
    */
  var NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined
  
  /**
    * The type of number that was released.
    */
  var NumberType: js.UndefOr[RequestableNumberType] = js.undefined
  
  /**
    * The name of the OptOutList that is associated with the requested phone number.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * The new phone number that was requested.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.PhoneNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the requested phone number.
    */
  var PhoneNumberArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the new phone number.
    */
  var PhoneNumberId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the pool associated with the phone number 
    */
  var PoolId: js.UndefOr[String] = js.undefined
  
  /**
    * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out requests.
    */
  var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The current status of the request.
    */
  var Status: js.UndefOr[NumberStatus] = js.undefined
  
  /**
    * An array of key and value pair tags that are associated with the phone number.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN used to identify the two way channel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * By default this is set to false. When set to true you can receive incoming text messages from your end recipients.
    */
  var TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
}
object RequestPhoneNumberResult {
  
  inline def apply(): RequestPhoneNumberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPhoneNumberResult]
  }
  
  extension [Self <: RequestPhoneNumberResult](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setMonthlyLeasingPrice(value: String): Self = StObject.set(x, "MonthlyLeasingPrice", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLeasingPriceUndefined: Self = StObject.set(x, "MonthlyLeasingPrice", js.undefined)
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesUndefined: Self = StObject.set(x, "NumberCapabilities", js.undefined)
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setNumberType(value: RequestableNumberType): Self = StObject.set(x, "NumberType", value.asInstanceOf[js.Any])
    
    inline def setNumberTypeUndefined: Self = StObject.set(x, "NumberType", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArn(value: String): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setSelfManagedOptOutsEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabledUndefined: Self = StObject.set(x, "SelfManagedOptOutsEnabled", js.undefined)
    
    inline def setStatus(value: NumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
    
    inline def setTwoWayEnabledUndefined: Self = StObject.set(x, "TwoWayEnabled", js.undefined)
  }
}
