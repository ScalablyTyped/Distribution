package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotApplicationVersionRequest extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn = js.native
  /**
    * The current revision id for the robot application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
}

object CreateRobotApplicationVersionRequest {
  @scala.inline
  def apply(application: Arn): CreateRobotApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
  }
  @scala.inline
  implicit class CreateRobotApplicationVersionRequestOps[Self <: CreateRobotApplicationVersionRequest] (val x: Self) extends AnyVal {
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
    def setCurrentRevisionId(value: RevisionId): Self = this.set("currentRevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRevisionId: Self = this.set("currentRevisionId", js.undefined)
  }
  
}

