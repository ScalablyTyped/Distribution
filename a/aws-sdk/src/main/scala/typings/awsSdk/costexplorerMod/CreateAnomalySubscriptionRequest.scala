package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalySubscriptionRequest extends StObject {
  
  /**
    * The cost anomaly subscription object that you want to create. 
    */
  var AnomalySubscription: typings.awsSdk.costexplorerMod.AnomalySubscription
  
  /**
    * An optional list of tags to associate with the specified  AnomalySubscription . You can use resource tags to control access to your subscription using IAM policies. Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions apply to resource tags:   Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource. The remaining are reserved for Amazon Web Services use   The maximum length of a key is 128 characters   The maximum length of a value is 256 characters   Keys and values can only contain alphanumeric characters, spaces, and any of the following: _.:/=+@-    Keys and values are case sensitive   Keys and values are trimmed for any leading or trailing whitespaces   Don’t use aws: as a prefix for your keys. This prefix is reserved for Amazon Web Services use  
    */
  var ResourceTags: js.UndefOr[ResourceTagList] = js.undefined
}
object CreateAnomalySubscriptionRequest {
  
  inline def apply(AnomalySubscription: AnomalySubscription): CreateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(AnomalySubscription = AnomalySubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalySubscriptionRequest]
  }
  
  extension [Self <: CreateAnomalySubscriptionRequest](x: Self) {
    
    inline def setAnomalySubscription(value: AnomalySubscription): Self = StObject.set(x, "AnomalySubscription", value.asInstanceOf[js.Any])
    
    inline def setResourceTags(value: ResourceTagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
  }
}
