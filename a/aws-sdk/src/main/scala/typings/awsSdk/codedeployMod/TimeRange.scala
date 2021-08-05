package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  /**
    * The end time of the time range.  Specify null to leave the end time open-ended. 
    */
  var end: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The start time of the time range.  Specify null to leave the start time open-ended. 
    */
  var start: js.UndefOr[Timestamp] = js.undefined
}
object TimeRange {
  
  inline def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  
  extension [Self <: TimeRange](x: Self) {
    
    inline def setEnd(value: Timestamp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Timestamp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
