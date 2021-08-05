package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /**
    * The dimensions for the event filter to use for the campaign or the journey activity.
    */
  var Dimensions: EventDimensions
  
  /**
    * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are: SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign or performs the activity when an endpoint event (Events resource) occurs.
    */
  var FilterType: typings.awsSdk.pinpointMod.FilterType
}
object EventFilter {
  
  inline def apply(Dimensions: EventDimensions, FilterType: FilterType): EventFilter = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFilter]
  }
  
  extension [Self <: EventFilter](x: Self) {
    
    inline def setDimensions(value: EventDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
  }
}
