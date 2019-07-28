package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonHierarchy")
@js.native
class PolygonHierarchy () extends Property {
  def this(positions: js.Array[Cartesian3]) = this()
  def this(positions: js.Array[Cartesian3], holes: js.Array[PolygonHierarchy]) = this()
  var holes: js.Array[PolygonHierarchy] = js.native
  var positions: js.Array[Cartesian3] = js.native
}

