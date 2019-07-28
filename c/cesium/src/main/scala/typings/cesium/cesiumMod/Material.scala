package typings.cesium.cesiumMod

import typings.cesium.Anon_Fabric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Material")
@js.native
class Material () extends js.Object {
  def this(options: Anon_Fabric) = this()
  var materials: js.Any = js.native
  var shaderSource: String = js.native
  var translucent: Boolean = js.native
  var `type`: String = js.native
  var uniforms: js.Any = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def isTranslucent(): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Material")
@js.native
object Material extends js.Object {
  var AlphaMapType: String = js.native
  var BumpMapType: String = js.native
  var CheckerboardType: String = js.native
  var ColorType: String = js.native
  var DefaultCubeMapId: String = js.native
  var DefaultImageId: String = js.native
  var DiffuseMapType: String = js.native
  var DotType: String = js.native
  var EmissionMapType: String = js.native
  var FadeType: String = js.native
  var GridType: String = js.native
  var ImageType: String = js.native
  var NormalMapType: String = js.native
  var PolylineArrowType: String = js.native
  var PolylineGlowType: String = js.native
  var PolylineOutlineType: String = js.native
  var RimLightingType: String = js.native
  var SpecularMapType: String = js.native
  var StripeType: String = js.native
  var WaterType: String = js.native
  def fromType(`type`: String): Material = js.native
  def fromType(`type`: String, uniforms: js.Any): Material = js.native
}

