package typings.cesium.cesiumMod

import typings.cesium.Anon_ClosedFaceForwardFlat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerInstanceColorAppearance")
@js.native
class PerInstanceColorAppearance () extends Appearance {
  def this(options: Anon_ClosedFaceForwardFlat) = this()
  val faceForward: Boolean = js.native
  val flat: Boolean = js.native
  val vertexFormat: VertexFormat = js.native
}

/* static members */
@JSImport("cesium", "PerInstanceColorAppearance")
@js.native
object PerInstanceColorAppearance extends js.Object {
  var FLAT_VERTEX_FORMAT: VertexFormat = js.native
  var VERTEX_FORMAT: VertexFormat = js.native
}

