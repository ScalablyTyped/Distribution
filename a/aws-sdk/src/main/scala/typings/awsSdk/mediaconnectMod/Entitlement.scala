package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entitlement extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  
  /**
    * A description of the entitlement.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.native
  
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string = js.native
  
  /**
    * An indication of whether the entitlement is enabled.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.mediaconnectMod.EntitlementStatus] = js.native
  
  /**
    * The name of the entitlement.
    */
  var Name: string = js.native
  
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: listOfString = js.native
}
object Entitlement {
  
  @scala.inline
  def apply(EntitlementArn: string, Name: string, Subscribers: listOfString): Entitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
  
  @scala.inline
  implicit class EntitlementMutableBuilder[Self <: Entitlement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementStatus(value: EntitlementStatus): Self = StObject.set(x, "EntitlementStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementStatusUndefined: Self = StObject.set(x, "EntitlementStatus", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribers(value: listOfString): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: string*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
  }
}
