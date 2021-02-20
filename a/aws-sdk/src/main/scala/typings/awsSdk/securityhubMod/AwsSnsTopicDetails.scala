package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSnsTopicDetails extends StObject {
  
  /**
    * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
    */
  var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.native
  
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[NonEmptyString] = js.native
}
object AwsSnsTopicDetails {
  
  @scala.inline
  def apply(): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
  
  @scala.inline
  implicit class AwsSnsTopicDetailsMutableBuilder[Self <: AwsSnsTopicDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setOwner(value: NonEmptyString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setSubscription(value: AwsSnsTopicSubscriptionList): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
    
    @scala.inline
    def setSubscriptionVarargs(value: AwsSnsTopicSubscription*): Self = StObject.set(x, "Subscription", js.Array(value :_*))
    
    @scala.inline
    def setTopicName(value: NonEmptyString): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
