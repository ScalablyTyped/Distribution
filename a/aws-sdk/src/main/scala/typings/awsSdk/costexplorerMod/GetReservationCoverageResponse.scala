package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationCoverageResponse extends js.Object {
  /**
    * The amount of time that your reservations covered.
    */
  var CoveragesByTime: typings.awsSdk.costexplorerMod.CoveragesByTime = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The total amount of instance usage that a reservation covered.
    */
  var Total: js.UndefOr[Coverage] = js.native
}

object GetReservationCoverageResponse {
  @scala.inline
  def apply(CoveragesByTime: CoveragesByTime): GetReservationCoverageResponse = {
    val __obj = js.Dynamic.literal(CoveragesByTime = CoveragesByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationCoverageResponse]
  }
  @scala.inline
  implicit class GetReservationCoverageResponseOps[Self <: GetReservationCoverageResponse] (val x: Self) extends AnyVal {
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
    def setCoveragesByTimeVarargs(value: CoverageByTime*): Self = this.set("CoveragesByTime", js.Array(value :_*))
    @scala.inline
    def setCoveragesByTime(value: CoveragesByTime): Self = this.set("CoveragesByTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setTotal(value: Coverage): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

