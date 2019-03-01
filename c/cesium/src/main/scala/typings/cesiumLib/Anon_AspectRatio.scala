package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  var aspectRatio: scala.Double
  var far: scala.Double
  var near: scala.Double
  var width: scala.Double
}

object Anon_AspectRatio {
  @scala.inline
  def apply(aspectRatio: scala.Double, far: scala.Double, near: scala.Double, width: scala.Double): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspectRatio")(aspectRatio)
    __obj.updateDynamic("far")(far)
    __obj.updateDynamic("near")(near)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

