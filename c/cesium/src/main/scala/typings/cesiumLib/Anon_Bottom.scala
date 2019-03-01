package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: scala.Double
  var far: scala.Double
  var left: scala.Double
  var near: scala.Double
  var right: scala.Double
  var top: scala.Double
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: scala.Double,
    far: scala.Double,
    left: scala.Double,
    near: scala.Double,
    right: scala.Double,
    top: scala.Double
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("far")(far)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("near")(near)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

