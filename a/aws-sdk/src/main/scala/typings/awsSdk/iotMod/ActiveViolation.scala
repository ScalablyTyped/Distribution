package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveViolation extends StObject {
  
  /**
    * The behavior which is being violated.
    */
  var behavior: js.UndefOr[Behavior] = js.native
  
  /**
    * The time the most recent violation occurred.
    */
  var lastViolationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The value of the metric (the measurement) which caused the most recent violation.
    */
  var lastViolationValue: js.UndefOr[MetricValue] = js.native
  
  /**
    * The security profile whose behavior is in violation.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  
  /**
    * The name of the thing responsible for the active violation.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
  
  /**
    * The ID of the active violation.
    */
  var violationId: js.UndefOr[ViolationId] = js.native
  
  /**
    * The time the violation started.
    */
  var violationStartTime: js.UndefOr[Timestamp] = js.native
}
object ActiveViolation {
  
  @scala.inline
  def apply(): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViolation]
  }
  
  @scala.inline
  implicit class ActiveViolationMutableBuilder[Self <: ActiveViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: Behavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    @scala.inline
    def setLastViolationTime(value: Timestamp): Self = StObject.set(x, "lastViolationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastViolationTimeUndefined: Self = StObject.set(x, "lastViolationTime", js.undefined)
    
    @scala.inline
    def setLastViolationValue(value: MetricValue): Self = StObject.set(x, "lastViolationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastViolationValueUndefined: Self = StObject.set(x, "lastViolationValue", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    @scala.inline
    def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationIdUndefined: Self = StObject.set(x, "violationId", js.undefined)
    
    @scala.inline
    def setViolationStartTime(value: Timestamp): Self = StObject.set(x, "violationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationStartTimeUndefined: Self = StObject.set(x, "violationStartTime", js.undefined)
  }
}
