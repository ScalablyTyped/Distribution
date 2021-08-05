package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveViolation extends StObject {
  
  /**
    * The behavior which is being violated.
    */
  var behavior: js.UndefOr[Behavior] = js.undefined
  
  /**
    * The time the most recent violation occurred.
    */
  var lastViolationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The value of the metric (the measurement) which caused the most recent violation.
    */
  var lastViolationValue: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The security profile whose behavior is in violation.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The name of the thing responsible for the active violation.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  
  /**
    * The ID of the active violation.
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
  
  /**
    * The time the violation started.
    */
  var violationStartTime: js.UndefOr[Timestamp] = js.undefined
}
object ActiveViolation {
  
  inline def apply(): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViolation]
  }
  
  extension [Self <: ActiveViolation](x: Self) {
    
    inline def setBehavior(value: Behavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setLastViolationTime(value: Timestamp): Self = StObject.set(x, "lastViolationTime", value.asInstanceOf[js.Any])
    
    inline def setLastViolationTimeUndefined: Self = StObject.set(x, "lastViolationTime", js.undefined)
    
    inline def setLastViolationValue(value: MetricValue): Self = StObject.set(x, "lastViolationValue", value.asInstanceOf[js.Any])
    
    inline def setLastViolationValueUndefined: Self = StObject.set(x, "lastViolationValue", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
    
    inline def setViolationIdUndefined: Self = StObject.set(x, "violationId", js.undefined)
    
    inline def setViolationStartTime(value: Timestamp): Self = StObject.set(x, "violationStartTime", value.asInstanceOf[js.Any])
    
    inline def setViolationStartTimeUndefined: Self = StObject.set(x, "violationStartTime", js.undefined)
  }
}
