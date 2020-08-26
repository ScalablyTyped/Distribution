package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotRequest extends js.Object {
  /**
    * The target architecture of the robot.
    */
  var architecture: Architecture = js.native
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: Id = js.native
  /**
    * The name for the robot.
    */
  var name: Name = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateRobotRequest {
  @scala.inline
  def apply(architecture: Architecture, greengrassGroupId: Id, name: Name): CreateRobotRequest = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], greengrassGroupId = greengrassGroupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotRequest]
  }
  @scala.inline
  implicit class CreateRobotRequestOps[Self <: CreateRobotRequest] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: Architecture): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreengrassGroupId(value: Id): Self = this.set("greengrassGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

