package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTimeRange extends StObject {
  
  /**
    *  The earliest end time in the time range. 
    */
  var FromTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The latest end time in the time range. 
    */
  var ToTime: js.UndefOr[js.Date] = js.undefined
}
object EndTimeRange {
  
  inline def apply(): EndTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndTimeRange]
  }
  
  extension [Self <: EndTimeRange](x: Self) {
    
    inline def setFromTime(value: js.Date): Self = StObject.set(x, "FromTime", value.asInstanceOf[js.Any])
    
    inline def setFromTimeUndefined: Self = StObject.set(x, "FromTime", js.undefined)
    
    inline def setToTime(value: js.Date): Self = StObject.set(x, "ToTime", value.asInstanceOf[js.Any])
    
    inline def setToTimeUndefined: Self = StObject.set(x, "ToTime", js.undefined)
  }
}
