package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotApplicationRequest extends js.Object {
  /**
    * The name of the robot application.
    */
  var name: Name = js.native
  /**
    * The robot software suite (ROS distribuition) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the robot application.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateRobotApplicationRequest {
  @scala.inline
  def apply(name: Name, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): CreateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationRequest]
  }
  @scala.inline
  implicit class CreateRobotApplicationRequestOps[Self <: CreateRobotApplicationRequest] (val x: Self) extends AnyVal {
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = this.set("robotSoftwareSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: SourceConfigs): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

