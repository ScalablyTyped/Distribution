package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTimeFilter extends StObject {
  
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: Timestamp
}
object ExecutionTimeFilter {
  
  @scala.inline
  def apply(oldestDate: Timestamp): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
  
  @scala.inline
  implicit class ExecutionTimeFilterMutableBuilder[Self <: ExecutionTimeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestDate(value: Timestamp): Self = StObject.set(x, "latestDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDateUndefined: Self = StObject.set(x, "latestDate", js.undefined)
    
    @scala.inline
    def setOldestDate(value: Timestamp): Self = StObject.set(x, "oldestDate", value.asInstanceOf[js.Any])
  }
}
