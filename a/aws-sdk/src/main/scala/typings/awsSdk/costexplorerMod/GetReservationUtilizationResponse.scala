package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReservationUtilizationResponse extends js.Object {
  
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
  implicit class GetReservationUtilizationResponseOps[Self <: GetReservationUtilizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUtilizationsByTimeVarargs(value: UtilizationByTime*): Self = this.set("UtilizationsByTime", js.Array(value :_*))
    
    @scala.inline
    def setUtilizationsByTime(value: UtilizationsByTime): Self = this.set("UtilizationsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setTotal(value: ReservationAggregates): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
