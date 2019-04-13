package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerInstanceColorAppearance")
@js.native
class PerInstanceColorAppearance () extends Appearance {
  def this(options: cesiumLib.Anon_ClosedFaceForwardFlat) = this()
  val faceForward: scala.Boolean = js.native
  val flat: scala.Boolean = js.native
  val vertexFormat: VertexFormat = js.native
}

/* static members */
@JSImport("cesium", "PerInstanceColorAppearance")
@js.native
object PerInstanceColorAppearance extends js.Object {
  var FLAT_VERTEX_FORMAT: cesiumLib.cesiumMod.VertexFormat = js.native
  var VERTEX_FORMAT: cesiumLib.cesiumMod.VertexFormat = js.native
}

