package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchAppRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}
object LaunchAppRequest {
  
  @scala.inline
  def apply(): LaunchAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchAppRequest]
  }
  
  @scala.inline
  implicit class LaunchAppRequestMutableBuilder[Self <: LaunchAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
