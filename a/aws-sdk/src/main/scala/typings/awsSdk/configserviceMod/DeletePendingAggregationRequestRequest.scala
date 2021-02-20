package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePendingAggregationRequestRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: AccountId = js.native
  
  /**
    * The region requesting to aggregate data.
    */
  var RequesterAwsRegion: AwsRegion = js.native
}
object DeletePendingAggregationRequestRequest {
  
  @scala.inline
  def apply(RequesterAccountId: AccountId, RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
    val __obj = js.Dynamic.literal(RequesterAccountId = RequesterAccountId.asInstanceOf[js.Any], RequesterAwsRegion = RequesterAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
  }
  
  @scala.inline
  implicit class DeletePendingAggregationRequestRequestMutableBuilder[Self <: DeletePendingAggregationRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequesterAccountId(value: AccountId): Self = StObject.set(x, "RequesterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterAwsRegion(value: AwsRegion): Self = StObject.set(x, "RequesterAwsRegion", value.asInstanceOf[js.Any])
  }
}
