package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaneDetectionState extends js.Object {
  var planeDetectionState: js.UndefOr[Enabled] = js.undefined
}

object PlaneDetectionState {
  @scala.inline
  def apply(planeDetectionState: Enabled = null): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    if (planeDetectionState != null) __obj.updateDynamic("planeDetectionState")(planeDetectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaneDetectionState]
  }
}

