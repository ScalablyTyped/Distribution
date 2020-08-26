package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRobotApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the robot application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DeleteRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn): DeleteRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRobotApplicationRequest]
  }
  @scala.inline
  implicit class DeleteRobotApplicationRequestOps[Self <: DeleteRobotApplicationRequest] (val x: Self) extends AnyVal {
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
    def setApplication(value: Arn): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationVersion(value: Version): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
  }
  
}

