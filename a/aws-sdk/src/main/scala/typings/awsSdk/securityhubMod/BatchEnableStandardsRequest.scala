package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEnableStandardsRequest extends StObject {
  
  /**
    * The list of standards checks to enable.
    */
  var StandardsSubscriptionRequests: typings.awsSdk.securityhubMod.StandardsSubscriptionRequests
}
object BatchEnableStandardsRequest {
  
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
  
  @scala.inline
  implicit class BatchEnableStandardsRequestMutableBuilder[Self <: BatchEnableStandardsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandardsSubscriptionRequests(value: StandardsSubscriptionRequests): Self = StObject.set(x, "StandardsSubscriptionRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionRequestsVarargs(value: StandardsSubscriptionRequest*): Self = StObject.set(x, "StandardsSubscriptionRequests", js.Array(value :_*))
  }
}
