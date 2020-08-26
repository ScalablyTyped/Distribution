package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[CancelSpotFleetRequestsError] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object CancelSpotFleetRequestsErrorItem {
  @scala.inline
  def apply(): CancelSpotFleetRequestsErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsErrorItem]
  }
  @scala.inline
  implicit class CancelSpotFleetRequestsErrorItemOps[Self <: CancelSpotFleetRequestsErrorItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: CancelSpotFleetRequestsError): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestId: Self = this.set("SpotFleetRequestId", js.undefined)
  }
  
}

