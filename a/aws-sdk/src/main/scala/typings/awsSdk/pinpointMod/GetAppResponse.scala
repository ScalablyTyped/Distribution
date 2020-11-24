package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppResponse extends js.Object {
  
  var ApplicationResponse: typings.awsSdk.pinpointMod.ApplicationResponse = js.native
}
object GetAppResponse {
  
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): GetAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResponse]
  }
  
  @scala.inline
  implicit class GetAppResponseOps[Self <: GetAppResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationResponse(value: ApplicationResponse): Self = this.set("ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
