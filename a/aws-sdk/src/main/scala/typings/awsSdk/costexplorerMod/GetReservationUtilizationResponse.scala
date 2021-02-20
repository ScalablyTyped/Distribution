package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReservationUtilizationResponse extends StObject {
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * The total amount of time that you used your RIs.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
  
  /**
    * The amount of time that you used your RIs.
    */
  var UtilizationsByTime: typings.awsSdk.costexplorerMod.UtilizationsByTime = js.native
}
object GetReservationUtilizationResponse {
  
  @scala.inline
  def apply(UtilizationsByTime: UtilizationsByTime): GetReservationUtilizationResponse = {
    val __obj = js.Dynamic.literal(UtilizationsByTime = UtilizationsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationUtilizationResponse]
  }
  
  @scala.inline
  implicit class GetReservationUtilizationResponseMutableBuilder[Self <: GetReservationUtilizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setTotal(value: ReservationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    @scala.inline
    def setUtilizationsByTime(value: UtilizationsByTime): Self = StObject.set(x, "UtilizationsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationsByTimeVarargs(value: UtilizationByTime*): Self = StObject.set(x, "UtilizationsByTime", js.Array(value :_*))
  }
}
