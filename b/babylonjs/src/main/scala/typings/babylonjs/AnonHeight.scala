package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var layers: js.UndefOr[Double] = js.undefined
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, width: Double, layers: Int | Double = null): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

