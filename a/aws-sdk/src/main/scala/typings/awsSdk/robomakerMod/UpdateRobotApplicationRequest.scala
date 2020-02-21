package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRobotApplicationRequest extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn = js.native
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs = js.native
}

object UpdateRobotApplicationRequest {
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    sources: SourceConfigs,
    currentRevisionId: RevisionId = null
  ): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
}

