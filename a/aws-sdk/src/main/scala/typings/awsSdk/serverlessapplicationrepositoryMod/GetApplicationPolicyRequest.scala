package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
}

object GetApplicationPolicyRequest {
  @scala.inline
  def apply(ApplicationId: string): GetApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationPolicyRequest]
  }
  @scala.inline
  implicit class GetApplicationPolicyRequestOps[Self <: GetApplicationPolicyRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
  }
  
}

