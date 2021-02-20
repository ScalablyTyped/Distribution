package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSpotInstancesResult extends StObject {
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.native
}
object RequestSpotInstancesResult {
  
  @scala.inline
  def apply(): RequestSpotInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotInstancesResult]
  }
  
  @scala.inline
  implicit class RequestSpotInstancesResultMutableBuilder[Self <: RequestSpotInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = StObject.set(x, "SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestsUndefined: Self = StObject.set(x, "SpotInstanceRequests", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = StObject.set(x, "SpotInstanceRequests", js.Array(value :_*))
  }
}
