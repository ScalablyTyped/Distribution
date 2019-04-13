package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Material")
@js.native
class Material () extends js.Object {
  def this(options: cesiumLib.Anon_Fabric) = this()
  var materials: js.Any = js.native
  var shaderSource: java.lang.String = js.native
  var translucent: scala.Boolean = js.native
  var `type`: java.lang.String = js.native
  var uniforms: js.Any = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isTranslucent(): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Material")
@js.native
object Material extends js.Object {
  var AlphaMapType: java.lang.String = js.native
  var BumpMapType: java.lang.String = js.native
  var CheckerboardType: java.lang.String = js.native
  var ColorType: java.lang.String = js.native
  var DefaultCubeMapId: java.lang.String = js.native
  var DefaultImageId: java.lang.String = js.native
  var DiffuseMapType: java.lang.String = js.native
  var DotType: java.lang.String = js.native
  var EmissionMapType: java.lang.String = js.native
  var FadeType: java.lang.String = js.native
  var GridType: java.lang.String = js.native
  var ImageType: java.lang.String = js.native
  var NormalMapType: java.lang.String = js.native
  var PolylineArrowType: java.lang.String = js.native
  var PolylineGlowType: java.lang.String = js.native
  var PolylineOutlineType: java.lang.String = js.native
  var RimLightingType: java.lang.String = js.native
  var SpecularMapType: java.lang.String = js.native
  var StripeType: java.lang.String = js.native
  var WaterType: java.lang.String = js.native
  def fromType(`type`: java.lang.String): cesiumLib.cesiumMod.Material = js.native
  def fromType(`type`: java.lang.String, uniforms: js.Any): cesiumLib.cesiumMod.Material = js.native
}

