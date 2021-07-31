package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotInstanceRequestsResult extends StObject {
  
  /**
    * One or more Spot Instance requests.
    */
  var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.undefined
}
object CancelSpotInstanceRequestsResult {
  
  @scala.inline
  def apply(): CancelSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotInstanceRequestsResult]
  }
  
  @scala.inline
  implicit class CancelSpotInstanceRequestsResultMutableBuilder[Self <: CancelSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelledSpotInstanceRequests(value: CancelledSpotInstanceRequestList): Self = StObject.set(x, "CancelledSpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledSpotInstanceRequestsUndefined: Self = StObject.set(x, "CancelledSpotInstanceRequests", js.undefined)
    
    @scala.inline
    def setCancelledSpotInstanceRequestsVarargs(value: CancelledSpotInstanceRequest*): Self = StObject.set(x, "CancelledSpotInstanceRequests", js.Array(value :_*))
  }
}
