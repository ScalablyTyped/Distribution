package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTimeFilter extends StObject {
  
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: js.Date
}
object ExecutionTimeFilter {
  
  inline def apply(oldestDate: js.Date): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionTimeFilter] (val x: Self) extends AnyVal {
    
    inline def setLatestDate(value: js.Date): Self = StObject.set(x, "latestDate", value.asInstanceOf[js.Any])
    
    inline def setLatestDateUndefined: Self = StObject.set(x, "latestDate", js.undefined)
    
    inline def setOldestDate(value: js.Date): Self = StObject.set(x, "oldestDate", value.asInstanceOf[js.Any])
  }
}
