package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnomalySubscriptionRequest extends StObject {
  
  /**
    *  The unique identifier of the cost anomaly subscription that you want to delete. 
    */
  var SubscriptionArn: GenericString
}
object DeleteAnomalySubscriptionRequest {
  
  @scala.inline
  def apply(SubscriptionArn: GenericString): DeleteAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit class DeleteAnomalySubscriptionRequestMutableBuilder[Self <: DeleteAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
