package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
    */
  var ContactId: SsmContactsArn
  
  /**
    * If you want to activate the channel at a later time, you can choose to defer activation. Incident Manager can't engage your contact channel until it has been activated.
    */
  var DeferActivation: js.UndefOr[typings.awsSdk.ssmcontactsMod.DeferActivation] = js.undefined
  
  /**
    * The details that Incident Manager uses when trying to engage the contact channel. The format is dependent on the type of the contact channel. The following are the expected formats:   SMS - '+' followed by the country code and phone number   VOICE - '+' followed by the country code and phone number   EMAIL - any standard email format  
    */
  var DeliveryAddress: ContactChannelAddress
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.ssmcontactsMod.IdempotencyToken] = js.undefined
  
  /**
    * The name of the contact channel.
    */
  var Name: ChannelName
  
  /**
    * Incident Manager supports three types of contact channels:    SMS     VOICE     EMAIL   
    */
  var Type: ChannelType
}
object CreateContactChannelRequest {
  
  inline def apply(
    ContactId: SsmContactsArn,
    DeliveryAddress: ContactChannelAddress,
    Name: ChannelName,
    Type: ChannelType
  ): CreateContactChannelRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], DeliveryAddress = DeliveryAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactChannelRequest]
  }
  
  extension [Self <: CreateContactChannelRequest](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setDeferActivation(value: DeferActivation): Self = StObject.set(x, "DeferActivation", value.asInstanceOf[js.Any])
    
    inline def setDeferActivationUndefined: Self = StObject.set(x, "DeferActivation", js.undefined)
    
    inline def setDeliveryAddress(value: ContactChannelAddress): Self = StObject.set(x, "DeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
