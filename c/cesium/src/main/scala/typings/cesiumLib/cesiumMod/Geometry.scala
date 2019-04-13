package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geometry")
@js.native
class Geometry protected () extends js.Object {
  def this(options: cesiumLib.Anon_Attributes) = this()
  var attributes: GeometryAttributes = js.native
  var boundingSphere: BoundingSphere = js.native
  var indices: js.Array[_] = js.native
  var primitiveType: PrimitiveType = js.native
}

/* static members */
@JSImport("cesium", "Geometry")
@js.native
object Geometry extends js.Object {
  def computeNumberOfVertices(geometry: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
}

