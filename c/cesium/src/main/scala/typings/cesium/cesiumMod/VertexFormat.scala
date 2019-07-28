package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VertexFormat")
@js.native
class VertexFormat () extends Packable {
  def this(options: js.Any) = this()
  var binormal: Boolean = js.native
  var color: Boolean = js.native
  var normal: Boolean = js.native
  var position: Boolean = js.native
  var st: Boolean = js.native
  var tangent: Boolean = js.native
}

/* static members */
@JSImport("cesium", "VertexFormat")
@js.native
object VertexFormat extends js.Object {
  var ALL: VertexFormat = js.native
  var DEFAULT: VertexFormat = js.native
  var POSITION_AND_COLOR: VertexFormat = js.native
  var POSITION_AND_NORMAL: VertexFormat = js.native
  var POSITION_AND_ST: VertexFormat = js.native
  var POSITION_NORMAL_AND_ST: VertexFormat = js.native
  var POSITION_ONLY: VertexFormat = js.native
  def clone(cartesian: VertexFormat): VertexFormat = js.native
  def clone(cartesian: VertexFormat, result: VertexFormat): VertexFormat = js.native
  def unpack(array: js.Array[Double]): VertexFormat = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): VertexFormat = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: VertexFormat): VertexFormat = js.native
}

