package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CullingVolume extends js.Object {
  var planes: js.Array[Cartesian4]
  def computeVisibility(boundingVolume: js.Any): Intersect
}

