package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelledSpotInstanceRequest extends StObject {
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.undefined
}
object CancelledSpotInstanceRequest {
  
  @scala.inline
  def apply(): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
  
  @scala.inline
  implicit class CancelledSpotInstanceRequestMutableBuilder[Self <: CancelledSpotInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
    
    @scala.inline
    def setState(value: CancelSpotInstanceRequestState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
