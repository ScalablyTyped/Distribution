package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopContinuousExportResponse extends StObject {
  
  /**
    * Timestamp that represents when this continuous export started collecting data.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
}
object StopContinuousExportResponse {
  
  inline def apply(): StopContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopContinuousExportResponse]
  }
  
  extension [Self <: StopContinuousExportResponse](x: Self) {
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
