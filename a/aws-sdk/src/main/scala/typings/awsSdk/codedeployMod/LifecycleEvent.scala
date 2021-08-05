package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleEvent extends StObject {
  
  /**
    * Diagnostic information about the deployment lifecycle event.
    */
  var diagnostics: js.UndefOr[Diagnostics] = js.undefined
  
  /**
    * A timestamp that indicates when the deployment lifecycle event ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
    */
  var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined
  
  /**
    * A timestamp that indicates when the deployment lifecycle event started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.undefined
}
object LifecycleEvent {
  
  inline def apply(): LifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEvent]
  }
  
  extension [Self <: LifecycleEvent](x: Self) {
    
    inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLifecycleEventName(value: LifecycleEventName): Self = StObject.set(x, "lifecycleEventName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventNameUndefined: Self = StObject.set(x, "lifecycleEventName", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: LifecycleEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
