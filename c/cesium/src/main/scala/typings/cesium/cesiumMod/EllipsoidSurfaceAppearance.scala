package typings.cesium.cesiumMod

import typings.cesium.Anon_AboveGround
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
class EllipsoidSurfaceAppearance () extends Appearance {
  def this(options: Anon_AboveGround) = this()
  val aboveGround: Boolean = js.native
  val faceForward: Boolean = js.native
  val flat: Boolean = js.native
  val vertexFormat: VertexFormat = js.native
}

/* static members */
@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
object EllipsoidSurfaceAppearance extends js.Object {
  var VERTEX_FORMAT: VertexFormat = js.native
}

