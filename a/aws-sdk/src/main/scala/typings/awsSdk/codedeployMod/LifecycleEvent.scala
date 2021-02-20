package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleEvent extends StObject {
  
  /**
    * Diagnostic information about the deployment lifecycle event.
    */
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  
  /**
    * A timestamp that indicates when the deployment lifecycle event ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
    */
  var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.native
  
  /**
    * A timestamp that indicates when the deployment lifecycle event started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}
object LifecycleEvent {
  
  @scala.inline
  def apply(): LifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEvent]
  }
  
  @scala.inline
  implicit class LifecycleEventMutableBuilder[Self <: LifecycleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setLifecycleEventName(value: LifecycleEventName): Self = StObject.set(x, "lifecycleEventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventNameUndefined: Self = StObject.set(x, "lifecycleEventName", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: LifecycleEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
