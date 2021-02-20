package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
}
object StartAppReplicationRequest {
  
  @scala.inline
  def apply(): StartAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAppReplicationRequest]
  }
  
  @scala.inline
  implicit class StartAppReplicationRequestMutableBuilder[Self <: StartAppReplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
