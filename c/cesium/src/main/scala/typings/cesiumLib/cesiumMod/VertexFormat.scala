package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VertexFormat")
@js.native
class VertexFormat ()
  extends cesiumLib.cesiumMod.CesiumNs.VertexFormat {
  def this(options: js.Any) = this()
  /* CompleteClass */
  override var binormal: scala.Boolean = js.native
  /* CompleteClass */
  override var color: scala.Boolean = js.native
  /* CompleteClass */
  override var normal: scala.Boolean = js.native
  /* CompleteClass */
  override var position: scala.Boolean = js.native
  /* CompleteClass */
  override var st: scala.Boolean = js.native
  /* CompleteClass */
  override var tangent: scala.Boolean = js.native
}

@JSImport("cesium", "VertexFormat")
@js.native
object VertexFormat extends js.Object {
  var ALL: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var DEFAULT: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var POSITION_AND_COLOR: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var POSITION_AND_NORMAL: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var POSITION_AND_ST: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var POSITION_NORMAL_AND_ST: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  var POSITION_ONLY: cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  def clone(cartesian: cesiumLib.cesiumMod.CesiumNs.VertexFormat): cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  def clone(
    cartesian: cesiumLib.cesiumMod.CesiumNs.VertexFormat,
    result: cesiumLib.cesiumMod.CesiumNs.VertexFormat
  ): cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.VertexFormat
  ): cesiumLib.cesiumMod.CesiumNs.VertexFormat = js.native
}

