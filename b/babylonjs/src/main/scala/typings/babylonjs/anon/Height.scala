package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var layers: js.UndefOr[Double] = js.undefined
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, width: Double, layers: js.UndefOr[Double] = js.undefined): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(layers)) __obj.updateDynamic("layers")(layers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

