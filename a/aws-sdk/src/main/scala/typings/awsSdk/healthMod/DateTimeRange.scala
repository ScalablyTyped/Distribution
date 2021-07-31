package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeRange extends StObject {
  
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[timestamp] = js.undefined
}
object DateTimeRange {
  
  @scala.inline
  def apply(): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeRange]
  }
  
  @scala.inline
  implicit class DateTimeRangeMutableBuilder[Self <: DateTimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: timestamp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: timestamp): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
