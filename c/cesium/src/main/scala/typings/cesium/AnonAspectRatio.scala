package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAspectRatio extends js.Object {
  var aspectRatio: Double
  var far: Double
  var near: Double
  var width: Double
}

object AnonAspectRatio {
  @scala.inline
  def apply(aspectRatio: Double, far: Double, near: Double, width: Double): AnonAspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAspectRatio]
  }
}

