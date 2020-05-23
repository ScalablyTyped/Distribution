package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspectRatio extends js.Object {
  var aspectRatio: Double
  var far: Double
  var near: Double
  var width: Double
}

object AspectRatio {
  @scala.inline
  def apply(aspectRatio: Double, far: Double, near: Double, width: Double): AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatio]
  }
}

