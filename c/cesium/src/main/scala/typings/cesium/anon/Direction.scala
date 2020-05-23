package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: Cartesian3
  var up: Cartesian3
}

object Direction {
  @scala.inline
  def apply(direction: Cartesian3, up: Cartesian3): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

