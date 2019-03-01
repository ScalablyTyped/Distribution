package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatioFar extends js.Object {
  var aspectRatio: scala.Double
  var far: scala.Double
  var fov: scala.Double
  var near: scala.Double
  var xOffset: scala.Double
  var yOffset: scala.Double
}

object Anon_AspectRatioFar {
  @scala.inline
  def apply(
    aspectRatio: scala.Double,
    far: scala.Double,
    fov: scala.Double,
    near: scala.Double,
    xOffset: scala.Double,
    yOffset: scala.Double
  ): Anon_AspectRatioFar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspectRatio")(aspectRatio)
    __obj.updateDynamic("far")(far)
    __obj.updateDynamic("fov")(fov)
    __obj.updateDynamic("near")(near)
    __obj.updateDynamic("xOffset")(xOffset)
    __obj.updateDynamic("yOffset")(yOffset)
    __obj.asInstanceOf[Anon_AspectRatioFar]
  }
}

