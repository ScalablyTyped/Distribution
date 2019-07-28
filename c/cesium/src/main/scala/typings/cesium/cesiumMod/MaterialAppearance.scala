package typings.cesium.cesiumMod

import typings.cesium.Anon_ClosedFaceForward
import typings.cesium.cesiumMod.MaterialAppearanceNs.MaterialSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "MaterialAppearance")
@js.native
class MaterialAppearance () extends Appearance {
  def this(options: Anon_ClosedFaceForward) = this()
  val faceForward: Boolean = js.native
  val flat: Boolean = js.native
  val materialSupport: MaterialSupport = js.native
  val vertexFormat: VertexFormat = js.native
}

