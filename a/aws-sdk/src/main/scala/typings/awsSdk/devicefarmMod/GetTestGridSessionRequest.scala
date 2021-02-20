package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestGridSessionRequest extends StObject {
  
  /**
    * The ARN for the project that this session belongs to. See CreateTestGridProject and ListTestGridProjects.
    */
  var projectArn: js.UndefOr[DeviceFarmArn] = js.native
  
  /**
    * An ARN that uniquely identifies a TestGridSession.
    */
  var sessionArn: js.UndefOr[DeviceFarmArn] = js.native
  
  /**
    * An ID associated with this session.
    */
  var sessionId: js.UndefOr[ResourceId] = js.native
}
object GetTestGridSessionRequest {
  
  @scala.inline
  def apply(): GetTestGridSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionRequest]
  }
  
  @scala.inline
  implicit class GetTestGridSessionRequestMutableBuilder[Self <: GetTestGridSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArnUndefined: Self = StObject.set(x, "projectArn", js.undefined)
    
    @scala.inline
    def setSessionArn(value: DeviceFarmArn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionArnUndefined: Self = StObject.set(x, "sessionArn", js.undefined)
    
    @scala.inline
    def setSessionId(value: ResourceId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
