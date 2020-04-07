package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectedPlanes extends js.Object {
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
}

object AnonDetectedPlanes {
  @scala.inline
  def apply(detectedPlanes: XRPlaneSet = null): AnonDetectedPlanes = {
    val __obj = js.Dynamic.literal()
    if (detectedPlanes != null) __obj.updateDynamic("detectedPlanes")(detectedPlanes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectedPlanes]
  }
}

