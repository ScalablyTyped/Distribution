package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the application.
    */
  var forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.native
  
  /**
    * Indicates whether to terminate the stack corresponding to the application while deleting the application.
    */
  var forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.native
}
object DeleteAppRequest {
  
  @scala.inline
  def apply(): DeleteAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppRequest]
  }
  
  @scala.inline
  implicit class DeleteAppRequestMutableBuilder[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setForceStopAppReplication(value: ForceStopAppReplication): Self = StObject.set(x, "forceStopAppReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceStopAppReplicationUndefined: Self = StObject.set(x, "forceStopAppReplication", js.undefined)
    
    @scala.inline
    def setForceTerminateApp(value: ForceTerminateApp): Self = StObject.set(x, "forceTerminateApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceTerminateAppUndefined: Self = StObject.set(x, "forceTerminateApp", js.undefined)
  }
}
