package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationState extends StObject {
  
  /**
    * The configurationId from the Application Discovery Service that uniquely identifies an application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationId] = js.native
  
  /**
    * The current status of an application.
    */
  var ApplicationStatus: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStatus] = js.native
  
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.native
}
object ApplicationState {
  
  @scala.inline
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  
  @scala.inline
  implicit class ApplicationStateMutableBuilder[Self <: ApplicationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatusUndefined: Self = StObject.set(x, "ApplicationStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: UpdateDateTime): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
  }
}
