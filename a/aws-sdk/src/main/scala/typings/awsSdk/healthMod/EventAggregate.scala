package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAggregate extends StObject {
  
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsSdk.healthMod.aggregateValue] = js.undefined
  
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsSdk.healthMod.count] = js.undefined
}
object EventAggregate {
  
  inline def apply(): EventAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAggregate]
  }
  
  extension [Self <: EventAggregate](x: Self) {
    
    inline def setAggregateValue(value: aggregateValue): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
    
    inline def setCount(value: count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
