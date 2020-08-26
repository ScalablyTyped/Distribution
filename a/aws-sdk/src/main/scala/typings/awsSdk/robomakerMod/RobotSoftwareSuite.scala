package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotSoftwareSuite extends js.Object {
  /**
    * The name of the robot software suite (ROS distribution).
    */
  var name: js.UndefOr[RobotSoftwareSuiteType] = js.native
  /**
    * The version of the robot software suite (ROS distribution).
    */
  var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.native
}

object RobotSoftwareSuite {
  @scala.inline
  def apply(): RobotSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotSoftwareSuite]
  }
  @scala.inline
  implicit class RobotSoftwareSuiteOps[Self <: RobotSoftwareSuite] (val x: Self) extends AnyVal {
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
    def setName(value: RobotSoftwareSuiteType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: RobotSoftwareSuiteVersionType): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

