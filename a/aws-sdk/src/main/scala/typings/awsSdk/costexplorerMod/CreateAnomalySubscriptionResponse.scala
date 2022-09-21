package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalySubscriptionResponse extends StObject {
  
  /**
    * The unique identifier of your newly created cost anomaly subscription. 
    */
  var SubscriptionArn: GenericString
}
object CreateAnomalySubscriptionResponse {
  
  inline def apply(SubscriptionArn: GenericString): CreateAnomalySubscriptionResponse = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalySubscriptionResponse]
  }
  
  extension [Self <: CreateAnomalySubscriptionResponse](x: Self) {
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
