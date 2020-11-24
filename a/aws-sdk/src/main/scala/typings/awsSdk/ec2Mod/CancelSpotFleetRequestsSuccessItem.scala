package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotFleetRequestsSuccessItem extends js.Object {
  
  /**
    * The current state of the Spot Fleet request.
    */
  var CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.native
  
  /**
    * The previous state of the Spot Fleet request.
    */
  var PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.native
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}
object CancelSpotFleetRequestsSuccessItem {
  
  @scala.inline
  def apply(): CancelSpotFleetRequestsSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsSuccessItem]
  }
  
  @scala.inline
  implicit class CancelSpotFleetRequestsSuccessItemOps[Self <: CancelSpotFleetRequestsSuccessItem] (val x: Self) extends AnyVal {
    
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
    def setCurrentSpotFleetRequestState(value: BatchState): Self = this.set("CurrentSpotFleetRequestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSpotFleetRequestState: Self = this.set("CurrentSpotFleetRequestState", js.undefined)
    
    @scala.inline
    def setPreviousSpotFleetRequestState(value: BatchState): Self = this.set("PreviousSpotFleetRequestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSpotFleetRequestState: Self = this.set("PreviousSpotFleetRequestState", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotFleetRequestId: Self = this.set("SpotFleetRequestId", js.undefined)
  }
}
