package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
class EllipsoidSurfaceAppearance () extends Appearance {
  def this(options: cesiumLib.Anon_AboveGround) = this()
  val aboveGround: scala.Boolean = js.native
  val faceForward: scala.Boolean = js.native
  val flat: scala.Boolean = js.native
  val vertexFormat: VertexFormat = js.native
}

/* static members */
@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
object EllipsoidSurfaceAppearance extends js.Object {
  var VERTEX_FORMAT: cesiumLib.cesiumMod.VertexFormat = js.native
}

