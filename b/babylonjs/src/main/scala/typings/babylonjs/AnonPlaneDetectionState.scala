package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaneDetectionState extends js.Object {
  var planeDetectionState: js.UndefOr[AnonEnabled] = js.undefined
}

object AnonPlaneDetectionState {
  @scala.inline
  def apply(planeDetectionState: AnonEnabled = null): AnonPlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    if (planeDetectionState != null) __obj.updateDynamic("planeDetectionState")(planeDetectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaneDetectionState]
  }
}

