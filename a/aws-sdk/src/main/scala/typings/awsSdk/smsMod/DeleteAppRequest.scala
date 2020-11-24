package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppRequest extends js.Object {
  
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
  implicit class DeleteAppRequestOps[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setForceStopAppReplication(value: ForceStopAppReplication): Self = this.set("forceStopAppReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceStopAppReplication: Self = this.set("forceStopAppReplication", js.undefined)
    
    @scala.inline
    def setForceTerminateApp(value: ForceTerminateApp): Self = this.set("forceTerminateApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceTerminateApp: Self = this.set("forceTerminateApp", js.undefined)
  }
}
