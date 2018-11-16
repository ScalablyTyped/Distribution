package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CullingVolume")
@js.native
class CullingVolume protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CullingVolume {
  def this(planes: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian4]) = this()
  /* CompleteClass */
  override var planes: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian4] = js.native
  /* CompleteClass */
  override def computeVisibility(boundingVolume: js.Any): cesiumLib.cesiumMod.CesiumNs.Intersect = js.native
}

