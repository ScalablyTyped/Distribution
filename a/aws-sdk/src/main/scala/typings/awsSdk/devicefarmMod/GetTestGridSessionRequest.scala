package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestGridSessionRequest extends js.Object {
  
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
  implicit class GetTestGridSessionRequestOps[Self <: GetTestGridSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProjectArn(value: DeviceFarmArn): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectArn: Self = this.set("projectArn", js.undefined)
    
    @scala.inline
    def setSessionArn(value: DeviceFarmArn): Self = this.set("sessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionArn: Self = this.set("sessionArn", js.undefined)
    
    @scala.inline
    def setSessionId(value: ResourceId): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
  }
}
