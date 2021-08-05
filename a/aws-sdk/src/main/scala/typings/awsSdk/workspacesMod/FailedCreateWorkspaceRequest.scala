package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCreateWorkspaceRequest extends StObject {
  
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.undefined
  
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceRequest] = js.undefined
}
object FailedCreateWorkspaceRequest {
  
  inline def apply(): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
  
  extension [Self <: FailedCreateWorkspaceRequest](x: Self) {
    
    inline def setErrorCode(value: ErrorType): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setWorkspaceRequest(value: WorkspaceRequest): Self = StObject.set(x, "WorkspaceRequest", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceRequestUndefined: Self = StObject.set(x, "WorkspaceRequest", js.undefined)
  }
}
