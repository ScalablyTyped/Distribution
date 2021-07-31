package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalySubscriptionRequest extends StObject {
  
  /**
    *  The cost anomaly subscription object that you want to create. 
    */
  var AnomalySubscription: typings.awsSdk.costexplorerMod.AnomalySubscription
}
object CreateAnomalySubscriptionRequest {
  
  @scala.inline
  def apply(AnomalySubscription: AnomalySubscription): CreateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(AnomalySubscription = AnomalySubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit class CreateAnomalySubscriptionRequestMutableBuilder[Self <: CreateAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalySubscription(value: AnomalySubscription): Self = StObject.set(x, "AnomalySubscription", value.asInstanceOf[js.Any])
  }
}
