package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCreateStandbyWorkspacesRequest extends StObject {
  
  /**
    * The error code that is returned if the standby WorkSpace could not be created.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
  
  /**
    * The text of the error message that is returned if the standby WorkSpace could not be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * Information about the standby WorkSpace that could not be created.
    */
  var StandbyWorkspaceRequest: js.UndefOr[StandbyWorkspace] = js.undefined
}
object FailedCreateStandbyWorkspacesRequest {
  
  inline def apply(): FailedCreateStandbyWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateStandbyWorkspacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedCreateStandbyWorkspacesRequest] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: WorkspaceErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setStandbyWorkspaceRequest(value: StandbyWorkspace): Self = StObject.set(x, "StandbyWorkspaceRequest", value.asInstanceOf[js.Any])
    
    inline def setStandbyWorkspaceRequestUndefined: Self = StObject.set(x, "StandbyWorkspaceRequest", js.undefined)
  }
}
