package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsResponse extends StObject {
  
  /**
    * Information about the Spot Fleet requests that are successfully canceled.
    */
  var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.undefined
  
  /**
    * Information about the Spot Fleet requests that are not successfully canceled.
    */
  var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.undefined
}
object CancelSpotFleetRequestsResponse {
  
  inline def apply(): CancelSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsResponse]
  }
  
  extension [Self <: CancelSpotFleetRequestsResponse](x: Self) {
    
    inline def setSuccessfulFleetRequests(value: CancelSpotFleetRequestsSuccessSet): Self = StObject.set(x, "SuccessfulFleetRequests", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulFleetRequestsUndefined: Self = StObject.set(x, "SuccessfulFleetRequests", js.undefined)
    
    inline def setSuccessfulFleetRequestsVarargs(value: CancelSpotFleetRequestsSuccessItem*): Self = StObject.set(x, "SuccessfulFleetRequests", js.Array(value*))
    
    inline def setUnsuccessfulFleetRequests(value: CancelSpotFleetRequestsErrorSet): Self = StObject.set(x, "UnsuccessfulFleetRequests", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulFleetRequestsUndefined: Self = StObject.set(x, "UnsuccessfulFleetRequests", js.undefined)
    
    inline def setUnsuccessfulFleetRequestsVarargs(value: CancelSpotFleetRequestsErrorItem*): Self = StObject.set(x, "UnsuccessfulFleetRequests", js.Array(value*))
  }
}
