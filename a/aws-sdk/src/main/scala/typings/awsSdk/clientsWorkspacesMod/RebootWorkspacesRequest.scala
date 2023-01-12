package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
    */
  var RebootWorkspaceRequests: typings.awsSdk.clientsWorkspacesMod.RebootWorkspaceRequests
}
object RebootWorkspacesRequest {
  
  inline def apply(RebootWorkspaceRequests: RebootWorkspaceRequests): RebootWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebootWorkspaceRequests = RebootWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootWorkspacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RebootWorkspacesRequest] (val x: Self) extends AnyVal {
    
    inline def setRebootWorkspaceRequests(value: RebootWorkspaceRequests): Self = StObject.set(x, "RebootWorkspaceRequests", value.asInstanceOf[js.Any])
    
    inline def setRebootWorkspaceRequestsVarargs(value: RebootRequest*): Self = StObject.set(x, "RebootWorkspaceRequests", js.Array(value*))
  }
}
