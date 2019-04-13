package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CullingVolume")
@js.native
class CullingVolume protected () extends js.Object {
  def this(planes: js.Array[Cartesian4]) = this()
  var planes: js.Array[Cartesian4] = js.native
  def computeVisibility(boundingVolume: js.Any): Intersect = js.native
}

