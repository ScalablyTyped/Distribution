package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampRange extends StObject {
  
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[Timestamp] = js.undefined
}
object TimestampRange {
  
  inline def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  
  extension [Self <: TimestampRange](x: Self) {
    
    inline def setBeginDate(value: Timestamp): Self = StObject.set(x, "beginDate", value.asInstanceOf[js.Any])
    
    inline def setBeginDateUndefined: Self = StObject.set(x, "beginDate", js.undefined)
    
    inline def setEndDate(value: Timestamp): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
  }
}
