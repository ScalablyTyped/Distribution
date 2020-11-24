package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppValidationOutputRequest extends js.Object {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation = js.native
}
object GetAppValidationOutputRequest {
  
  @scala.inline
  def apply(appId: AppIdWithValidation): GetAppValidationOutputRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppValidationOutputRequest]
  }
  
  @scala.inline
  implicit class GetAppValidationOutputRequestOps[Self <: GetAppValidationOutputRequest] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: AppIdWithValidation): Self = this.set("appId", value.asInstanceOf[js.Any])
  }
}
