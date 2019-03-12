package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CullingVolume extends js.Object {
  var planes: js.Array[Cartesian4]
  def computeVisibility(boundingVolume: js.Any): Intersect
}

object CullingVolume {
  @scala.inline
  def apply(computeVisibility: js.Any => Intersect, planes: js.Array[Cartesian4]): CullingVolume = {
    val __obj = js.Dynamic.literal(computeVisibility = js.Any.fromFunction1(computeVisibility), planes = planes)
  
    __obj.asInstanceOf[CullingVolume]
  }
}

