package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotFleetResponse extends js.Object {
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object RequestSpotFleetResponse {
  @scala.inline
  def apply(): RequestSpotFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotFleetResponse]
  }
  @scala.inline
  implicit class RequestSpotFleetResponseOps[Self <: RequestSpotFleetResponse] (val x: Self) extends AnyVal {
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
    def setSpotFleetRequestId(value: String): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestId: Self = this.set("SpotFleetRequestId", js.undefined)
  }
  
}

