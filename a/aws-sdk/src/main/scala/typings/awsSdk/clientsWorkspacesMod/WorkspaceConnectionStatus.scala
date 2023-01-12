package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceConnectionStatus extends StObject {
  
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ConnectionState] = js.undefined
  
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}
object WorkspaceConnectionStatus {
  
  inline def apply(): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceConnectionStatus] (val x: Self) extends AnyVal {
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateCheckTimestamp(value: js.Date): Self = StObject.set(x, "ConnectionStateCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateCheckTimestampUndefined: Self = StObject.set(x, "ConnectionStateCheckTimestamp", js.undefined)
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setLastKnownUserConnectionTimestamp(value: js.Date): Self = StObject.set(x, "LastKnownUserConnectionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastKnownUserConnectionTimestampUndefined: Self = StObject.set(x, "LastKnownUserConnectionTimestamp", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
