package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyApplicationStateRequest extends StObject {
  
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.migrationhubMod.ApplicationId = js.native
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var Status: ApplicationStatus = js.native
  
  /**
    * The timestamp when the application state changed.
    */
  var UpdateDateTime: js.UndefOr[typings.awsSdk.migrationhubMod.UpdateDateTime] = js.native
}
object NotifyApplicationStateRequest {
  
  @scala.inline
  def apply(ApplicationId: ApplicationId, Status: ApplicationStatus): NotifyApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyApplicationStateRequest]
  }
  
  @scala.inline
  implicit class NotifyApplicationStateRequestMutableBuilder[Self <: NotifyApplicationStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setStatus(value: ApplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
