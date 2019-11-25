package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: Cartesian3
  var up: Cartesian3
}

object Anon_Direction {
  @scala.inline
  def apply(direction: Cartesian3, up: Cartesian3): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

