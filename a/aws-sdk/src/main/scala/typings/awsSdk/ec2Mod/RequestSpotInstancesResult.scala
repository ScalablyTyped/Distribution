package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSpotInstancesResult extends StObject {
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
}
object RequestSpotInstancesResult {
  
  inline def apply(): RequestSpotInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotInstancesResult]
  }
  
  extension [Self <: RequestSpotInstancesResult](x: Self) {
    
    inline def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = StObject.set(x, "SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestsUndefined: Self = StObject.set(x, "SpotInstanceRequests", js.undefined)
    
    inline def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = StObject.set(x, "SpotInstanceRequests", js.Array(value :_*))
  }
}
