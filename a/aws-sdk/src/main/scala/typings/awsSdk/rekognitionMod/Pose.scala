package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose extends js.Object {
  /**
    * Value representing the face rotation on the pitch axis.
    */
  var Pitch: js.UndefOr[Degree] = js.native
  /**
    * Value representing the face rotation on the roll axis.
    */
  var Roll: js.UndefOr[Degree] = js.native
  /**
    * Value representing the face rotation on the yaw axis.
    */
  var Yaw: js.UndefOr[Degree] = js.native
}

object Pose {
  @scala.inline
  def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  @scala.inline
  implicit class PoseOps[Self <: Pose] (val x: Self) extends AnyVal {
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
    def setPitch(value: Degree): Self = this.set("Pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("Pitch", js.undefined)
    @scala.inline
    def setRoll(value: Degree): Self = this.set("Roll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoll: Self = this.set("Roll", js.undefined)
    @scala.inline
    def setYaw(value: Degree): Self = this.set("Yaw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYaw: Self = this.set("Yaw", js.undefined)
  }
  
}

