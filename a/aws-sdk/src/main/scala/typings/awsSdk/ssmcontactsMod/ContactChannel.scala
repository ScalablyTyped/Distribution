package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactChannel extends StObject {
  
  /**
    * A Boolean value describing if the contact channel has been activated or not. If the contact channel isn't activated, Incident Manager can't engage the contact through it. 
    */
  var ActivationStatus: typings.awsSdk.ssmcontactsMod.ActivationStatus
  
  /**
    * The ARN of the contact that contains the contact channel.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelArn: SsmContactsArn
  
  /**
    * The details that Incident Manager uses when trying to engage the contact channel.
    */
  var DeliveryAddress: ContactChannelAddress
  
  /**
    * The name of the contact channel.
    */
  var Name: ChannelName
  
  /**
    * The type of the contact channel. Incident Manager supports three contact methods:   SMS   VOICE   EMAIL  
    */
  var Type: js.UndefOr[ChannelType] = js.undefined
}
object ContactChannel {
  
  inline def apply(
    ActivationStatus: ActivationStatus,
    ContactArn: SsmContactsArn,
    ContactChannelArn: SsmContactsArn,
    DeliveryAddress: ContactChannelAddress,
    Name: ChannelName
  ): ContactChannel = {
    val __obj = js.Dynamic.literal(ActivationStatus = ActivationStatus.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any], ContactChannelArn = ContactChannelArn.asInstanceOf[js.Any], DeliveryAddress = DeliveryAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactChannel]
  }
  
  extension [Self <: ContactChannel](x: Self) {
    
    inline def setActivationStatus(value: ActivationStatus): Self = StObject.set(x, "ActivationStatus", value.asInstanceOf[js.Any])
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactChannelArn(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelArn", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddress(value: ContactChannelAddress): Self = StObject.set(x, "DeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
