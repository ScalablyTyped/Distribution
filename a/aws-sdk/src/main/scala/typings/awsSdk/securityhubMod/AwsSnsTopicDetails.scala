package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSnsTopicDetails extends StObject {
  
  /**
    * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
    */
  var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.undefined
  
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSnsTopicDetails {
  
  inline def apply(): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
  
  extension [Self <: AwsSnsTopicDetails](x: Self) {
    
    inline def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setSubscription(value: AwsSnsTopicSubscriptionList): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
    
    inline def setSubscriptionVarargs(value: AwsSnsTopicSubscription*): Self = StObject.set(x, "Subscription", js.Array(value :_*))
    
    inline def setTopicName(value: NonEmptyString): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
