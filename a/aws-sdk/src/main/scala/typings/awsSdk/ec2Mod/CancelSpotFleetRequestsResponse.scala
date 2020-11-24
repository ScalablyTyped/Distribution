package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotFleetRequestsResponse extends js.Object {
  
  /**
    * Information about the Spot Fleet requests that are successfully canceled.
    */
  var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.native
  
  /**
    * Information about the Spot Fleet requests that are not successfully canceled.
    */
  var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.native
}
object CancelSpotFleetRequestsResponse {
  
  @scala.inline
  def apply(): CancelSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsResponse]
  }
  
  @scala.inline
  implicit class CancelSpotFleetRequestsResponseOps[Self <: CancelSpotFleetRequestsResponse] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulFleetRequestsVarargs(value: CancelSpotFleetRequestsSuccessItem*): Self = this.set("SuccessfulFleetRequests", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulFleetRequests(value: CancelSpotFleetRequestsSuccessSet): Self = this.set("SuccessfulFleetRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulFleetRequests: Self = this.set("SuccessfulFleetRequests", js.undefined)
    
    @scala.inline
    def setUnsuccessfulFleetRequestsVarargs(value: CancelSpotFleetRequestsErrorItem*): Self = this.set("UnsuccessfulFleetRequests", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfulFleetRequests(value: CancelSpotFleetRequestsErrorSet): Self = this.set("UnsuccessfulFleetRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessfulFleetRequests: Self = this.set("UnsuccessfulFleetRequests", js.undefined)
  }
}
