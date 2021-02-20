package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
}
object StopAppReplicationRequest {
  
  @scala.inline
  def apply(): StopAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopAppReplicationRequest]
  }
  
  @scala.inline
  implicit class StopAppReplicationRequestMutableBuilder[Self <: StopAppReplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
