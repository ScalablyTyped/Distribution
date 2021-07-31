package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsSuccessItem extends StObject {
  
  /**
    * The current state of the Spot Fleet request.
    */
  var CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined
  
  /**
    * The previous state of the Spot Fleet request.
    */
  var PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}
object CancelSpotFleetRequestsSuccessItem {
  
  @scala.inline
  def apply(): CancelSpotFleetRequestsSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsSuccessItem]
  }
  
  @scala.inline
  implicit class CancelSpotFleetRequestsSuccessItemMutableBuilder[Self <: CancelSpotFleetRequestsSuccessItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSpotFleetRequestState(value: BatchState): Self = StObject.set(x, "CurrentSpotFleetRequestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpotFleetRequestStateUndefined: Self = StObject.set(x, "CurrentSpotFleetRequestState", js.undefined)
    
    @scala.inline
    def setPreviousSpotFleetRequestState(value: BatchState): Self = StObject.set(x, "PreviousSpotFleetRequestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSpotFleetRequestStateUndefined: Self = StObject.set(x, "PreviousSpotFleetRequestState", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
