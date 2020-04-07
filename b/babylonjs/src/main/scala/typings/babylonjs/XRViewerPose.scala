package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRViewerPose extends XRPose {
  var views: js.Array[XRView]
}

object XRViewerPose {
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XRViewerPose]
  }
}

