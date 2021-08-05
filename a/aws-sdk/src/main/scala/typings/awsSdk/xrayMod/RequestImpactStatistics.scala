package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestImpactStatistics extends StObject {
  
  /**
    * The number of requests that have resulted in a fault,
    */
  var FaultCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The number of successful requests.
    */
  var OkCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The total number of requests to the service.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
}
object RequestImpactStatistics {
  
  inline def apply(): RequestImpactStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestImpactStatistics]
  }
  
  extension [Self <: RequestImpactStatistics](x: Self) {
    
    inline def setFaultCount(value: NullableLong): Self = StObject.set(x, "FaultCount", value.asInstanceOf[js.Any])
    
    inline def setFaultCountUndefined: Self = StObject.set(x, "FaultCount", js.undefined)
    
    inline def setOkCount(value: NullableLong): Self = StObject.set(x, "OkCount", value.asInstanceOf[js.Any])
    
    inline def setOkCountUndefined: Self = StObject.set(x, "OkCount", js.undefined)
    
    inline def setTotalCount(value: NullableLong): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
