package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceStatistics extends StObject {
  
  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  var ErrorStatistics: js.UndefOr[typings.awsSdk.clientsXrayMod.ErrorStatistics] = js.undefined
  
  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  var FaultStatistics: js.UndefOr[typings.awsSdk.clientsXrayMod.FaultStatistics] = js.undefined
  
  /**
    * The number of requests that completed with a 2xx Success status code.
    */
  var OkCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The total number of completed requests.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The aggregate response time of completed requests.
    */
  var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
}
object ServiceStatistics {
  
  inline def apply(): ServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceStatistics] (val x: Self) extends AnyVal {
    
    inline def setErrorStatistics(value: ErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
    
    inline def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
    
    inline def setFaultStatistics(value: FaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
    
    inline def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
    
    inline def setOkCount(value: NullableLong): Self = StObject.set(x, "OkCount", value.asInstanceOf[js.Any])
    
    inline def setOkCountUndefined: Self = StObject.set(x, "OkCount", js.undefined)
    
    inline def setTotalCount(value: NullableLong): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    
    inline def setTotalResponseTime(value: NullableDouble): Self = StObject.set(x, "TotalResponseTime", value.asInstanceOf[js.Any])
    
    inline def setTotalResponseTimeUndefined: Self = StObject.set(x, "TotalResponseTime", js.undefined)
  }
}
