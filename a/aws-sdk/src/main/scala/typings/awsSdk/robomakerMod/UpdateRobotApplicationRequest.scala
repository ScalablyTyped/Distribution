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
  def apply(application: Arn, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
  @scala.inline
  implicit class UpdateRobotApplicationRequestOps[Self <: UpdateRobotApplicationRequest] (val x: Self) extends AnyVal {
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
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = this.set("robotSoftwareSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: SourceConfigs): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentRevisionId(value: RevisionId): Self = this.set("currentRevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRevisionId: Self = this.set("currentRevisionId", js.undefined)
  }
  
}

