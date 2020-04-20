package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRPose extends js.Object {
  var emulatedPosition: Boolean
  var transform: XRRigidTransform
}

object XRPose {
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPose]
  }
}

