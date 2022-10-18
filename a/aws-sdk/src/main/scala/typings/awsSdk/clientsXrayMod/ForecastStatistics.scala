package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastStatistics extends StObject {
  
  /**
    * The upper limit of fault counts for a service.
    */
  var FaultCountHigh: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The lower limit of fault counts for a service.
    */
  var FaultCountLow: js.UndefOr[NullableLong] = js.undefined
}
object ForecastStatistics {
  
  inline def apply(): ForecastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastStatistics]
  }
  
  extension [Self <: ForecastStatistics](x: Self) {
    
    inline def setFaultCountHigh(value: NullableLong): Self = StObject.set(x, "FaultCountHigh", value.asInstanceOf[js.Any])
    
    inline def setFaultCountHighUndefined: Self = StObject.set(x, "FaultCountHigh", js.undefined)
    
    inline def setFaultCountLow(value: NullableLong): Self = StObject.set(x, "FaultCountLow", value.asInstanceOf[js.Any])
    
    inline def setFaultCountLowUndefined: Self = StObject.set(x, "FaultCountLow", js.undefined)
  }
}
