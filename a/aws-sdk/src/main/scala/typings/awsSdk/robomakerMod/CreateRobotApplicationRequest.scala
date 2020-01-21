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
    * The robot software suite used by the robot application.
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
  def apply(name: Name, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs, tags: TagMap = null): CreateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationRequest]
  }
}

