package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolationEvent extends StObject {
  
  /**
    * The behavior which was violated.
    */
  var behavior: js.UndefOr[Behavior] = js.undefined
  
  /**
    * The value of the metric (the measurement).
    */
  var metricValue: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The name of the security profile whose behavior was violated.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The name of the thing responsible for the violation event.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  
  /**
    * The time the violation event occurred.
    */
  var violationEventTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The type of violation event.
    */
  var violationEventType: js.UndefOr[ViolationEventType] = js.undefined
  
  /**
    * The ID of the violation event.
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
}
object ViolationEvent {
  
  inline def apply(): ViolationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolationEvent]
  }
  
  extension [Self <: ViolationEvent](x: Self) {
    
    inline def setBehavior(value: Behavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setMetricValue(value: MetricValue): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    inline def setMetricValueUndefined: Self = StObject.set(x, "metricValue", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setViolationEventTime(value: Timestamp): Self = StObject.set(x, "violationEventTime", value.asInstanceOf[js.Any])
    
    inline def setViolationEventTimeUndefined: Self = StObject.set(x, "violationEventTime", js.undefined)
    
    inline def setViolationEventType(value: ViolationEventType): Self = StObject.set(x, "violationEventType", value.asInstanceOf[js.Any])
    
    inline def setViolationEventTypeUndefined: Self = StObject.set(x, "violationEventType", js.undefined)
    
    inline def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
    
    inline def setViolationIdUndefined: Self = StObject.set(x, "violationId", js.undefined)
  }
}
