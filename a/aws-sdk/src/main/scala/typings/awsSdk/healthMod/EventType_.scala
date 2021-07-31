package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType_ extends StObject {
  
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var category: js.UndefOr[eventTypeCategory] = js.undefined
  
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var code: js.UndefOr[eventTypeCode] = js.undefined
  
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typings.awsSdk.healthMod.service] = js.undefined
}
object EventType_ {
  
  @scala.inline
  def apply(): EventType_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType_]
  }
  
  @scala.inline
  implicit class EventType_MutableBuilder[Self <: EventType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: eventTypeCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: eventTypeCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setService(value: service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
