package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
class MaterialAppearance () extends Appearance {
  def this(options: cesiumLib.Anon_ClosedFaceForward) = this()
  val faceForward: scala.Boolean = js.native
  val flat: scala.Boolean = js.native
  val materialSupport: cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport = js.native
  val vertexFormat: VertexFormat = js.native
}

