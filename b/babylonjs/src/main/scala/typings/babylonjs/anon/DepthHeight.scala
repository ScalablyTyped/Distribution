package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthHeight extends js.Object {
  var depth: Double
  var height: Double
  var width: Double
}

object DepthHeight {
  @scala.inline
  def apply(depth: Double, height: Double, width: Double): DepthHeight = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthHeight]
  }
}

