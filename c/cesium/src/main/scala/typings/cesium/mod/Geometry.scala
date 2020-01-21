package typings.cesium.mod

import typings.cesium.AnonAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geometry")
@js.native
class Geometry protected () extends js.Object {
  def this(options: AnonAttributes) = this()
  var attributes: GeometryAttributes = js.native
  var boundingSphere: BoundingSphere = js.native
  var indices: js.Array[_] = js.native
  var primitiveType: PrimitiveType = js.native
}

/* static members */
@JSImport("cesium", "Geometry")
@js.native
object Geometry extends js.Object {
  def computeNumberOfVertices(geometry: Cartesian3): Double = js.native
}

