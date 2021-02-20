package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnomalySubscriptionResponse extends StObject {
  
  /**
    *  A cost anomaly subscription ARN. 
    */
  var SubscriptionArn: GenericString = js.native
}
object UpdateAnomalySubscriptionResponse {
  
  @scala.inline
  def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionResponse = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionResponse]
  }
  
  @scala.inline
  implicit class UpdateAnomalySubscriptionResponseMutableBuilder[Self <: UpdateAnomalySubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
