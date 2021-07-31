package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are getting metrics information for.
    */
  var DistributionId: String
}
object GetMonitoringSubscriptionRequest {
  
  @scala.inline
  def apply(DistributionId: String): GetMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit class GetMonitoringSubscriptionRequestMutableBuilder[Self <: GetMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
  }
}
