package typings.babylonjs.anon

import typings.babylonjs.XRPlaneSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedPlanes extends js.Object {
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
}

object DetectedPlanes {
  @scala.inline
  def apply(detectedPlanes: XRPlaneSet = null): DetectedPlanes = {
    val __obj = js.Dynamic.literal()
    if (detectedPlanes != null) __obj.updateDynamic("detectedPlanes")(detectedPlanes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedPlanes]
  }
}

