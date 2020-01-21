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
  def apply(application: Arn, currentRevisionId: RevisionId = null): CreateRobotApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
  }
}

