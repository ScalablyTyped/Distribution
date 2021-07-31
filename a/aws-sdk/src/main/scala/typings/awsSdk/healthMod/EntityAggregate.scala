package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityAggregate extends StObject {
  
  /**
    * The number of entities that match the criteria for the specified events.
    */
  var count: js.UndefOr[typings.awsSdk.healthMod.count] = js.undefined
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.healthMod.eventArn] = js.undefined
}
object EntityAggregate {
  
  @scala.inline
  def apply(): EntityAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAggregate]
  }
  
  @scala.inline
  implicit class EntityAggregateMutableBuilder[Self <: EntityAggregate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventArnUndefined: Self = StObject.set(x, "eventArn", js.undefined)
  }
}
