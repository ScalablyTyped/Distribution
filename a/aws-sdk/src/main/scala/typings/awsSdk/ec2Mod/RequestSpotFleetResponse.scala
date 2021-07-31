package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSpotFleetResponse extends StObject {
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}
object RequestSpotFleetResponse {
  
  @scala.inline
  def apply(): RequestSpotFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotFleetResponse]
  }
  
  @scala.inline
  implicit class RequestSpotFleetResponseMutableBuilder[Self <: RequestSpotFleetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
