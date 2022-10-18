package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedWorkspaceChangeRequest extends StObject {
  
  /**
    * The error code that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.undefined
  
  /**
    * The text of the error message that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}
object FailedWorkspaceChangeRequest {
  
  inline def apply(): FailedWorkspaceChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedWorkspaceChangeRequest]
  }
  
  extension [Self <: FailedWorkspaceChangeRequest](x: Self) {
    
    inline def setErrorCode(value: ErrorType): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
