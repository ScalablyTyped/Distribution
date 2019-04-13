package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VertexFormat")
@js.native
class VertexFormat () extends Packable {
  def this(options: js.Any) = this()
  var binormal: scala.Boolean = js.native
  var color: scala.Boolean = js.native
  var normal: scala.Boolean = js.native
  var position: scala.Boolean = js.native
  var st: scala.Boolean = js.native
  var tangent: scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "VertexFormat")
@js.native
object VertexFormat extends js.Object {
  var ALL: cesiumLib.cesiumMod.VertexFormat = js.native
  var DEFAULT: cesiumLib.cesiumMod.VertexFormat = js.native
  var POSITION_AND_COLOR: cesiumLib.cesiumMod.VertexFormat = js.native
  var POSITION_AND_NORMAL: cesiumLib.cesiumMod.VertexFormat = js.native
  var POSITION_AND_ST: cesiumLib.cesiumMod.VertexFormat = js.native
  var POSITION_NORMAL_AND_ST: cesiumLib.cesiumMod.VertexFormat = js.native
  var POSITION_ONLY: cesiumLib.cesiumMod.VertexFormat = js.native
  def clone(cartesian: cesiumLib.cesiumMod.VertexFormat): cesiumLib.cesiumMod.VertexFormat = js.native
  def clone(cartesian: cesiumLib.cesiumMod.VertexFormat, result: cesiumLib.cesiumMod.VertexFormat): cesiumLib.cesiumMod.VertexFormat = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.VertexFormat = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.VertexFormat = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.VertexFormat
  ): cesiumLib.cesiumMod.VertexFormat = js.native
}

