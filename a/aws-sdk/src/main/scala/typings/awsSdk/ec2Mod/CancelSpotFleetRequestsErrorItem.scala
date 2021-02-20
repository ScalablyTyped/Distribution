package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotFleetRequestsErrorItem extends StObject {
  
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
  implicit class CancelSpotFleetRequestsErrorItemMutableBuilder[Self <: CancelSpotFleetRequestsErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: CancelSpotFleetRequestsError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
