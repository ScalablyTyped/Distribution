package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaultStatistics extends StObject {
  
  /**
    * The number of requests that failed with untracked 5xx Server Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The total number of requests that failed with a 5xx Server Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
}
object FaultStatistics {
  
  inline def apply(): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultStatistics]
  }
  
  extension [Self <: FaultStatistics](x: Self) {
    
    inline def setOtherCount(value: NullableLong): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
    
    inline def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
    
    inline def setTotalCount(value: NullableLong): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
