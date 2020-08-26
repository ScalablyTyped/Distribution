package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridProjectRequest extends js.Object {
  /**
    * The ARN of the Selenium testing project, from either CreateTestGridProject or ListTestGridProjects.
    */
  var projectArn: DeviceFarmArn = js.native
}

object GetTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): GetTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestGridProjectRequest]
  }
  @scala.inline
  implicit class GetTestGridProjectRequestOps[Self <: GetTestGridProjectRequest] (val x: Self) extends AnyVal {
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
  }
  
}

