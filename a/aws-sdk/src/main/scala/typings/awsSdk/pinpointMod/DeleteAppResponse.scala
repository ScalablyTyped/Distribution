package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppResponse extends js.Object {
  
  var ApplicationResponse: typings.awsSdk.pinpointMod.ApplicationResponse = js.native
}
object DeleteAppResponse {
  
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): DeleteAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppResponse]
  }
  
  @scala.inline
  implicit class DeleteAppResponseOps[Self <: DeleteAppResponse] (val x: Self) extends AnyVal {
    
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
