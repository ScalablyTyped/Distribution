package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The semantic version of the application to get.
    */
  var SemanticVersion: js.UndefOr[string] = js.native
}

object GetApplicationRequest {
  @scala.inline
  def apply(ApplicationId: string): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRequest]
  }
  @scala.inline
  implicit class GetApplicationRequestOps[Self <: GetApplicationRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemanticVersion: Self = this.set("SemanticVersion", js.undefined)
  }
  
}

