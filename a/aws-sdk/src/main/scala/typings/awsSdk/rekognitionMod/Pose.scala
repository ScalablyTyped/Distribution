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
  def apply(
    Pitch: js.UndefOr[Degree] = js.undefined,
    Roll: js.UndefOr[Degree] = js.undefined,
    Yaw: js.UndefOr[Degree] = js.undefined
  ): Pose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pitch)) __obj.updateDynamic("Pitch")(Pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Roll)) __obj.updateDynamic("Roll")(Roll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Yaw)) __obj.updateDynamic("Yaw")(Yaw.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pose]
  }
}

