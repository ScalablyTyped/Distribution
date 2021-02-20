package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventAggregate extends StObject {
  
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsSdk.healthMod.aggregateValue] = js.native
  
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsSdk.healthMod.count] = js.native
}
object EventAggregate {
  
  @scala.inline
  def apply(): EventAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAggregate]
  }
  
  @scala.inline
  implicit class EventAggregateMutableBuilder[Self <: EventAggregate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateValue(value: aggregateValue): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
    
    @scala.inline
    def setCount(value: count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
