package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Material")
@js.native
class Material ()
  extends cesiumLib.cesiumMod.CesiumNs.Material {
  def this(options: cesiumLib.Anon_Translucent) = this()
  /* CompleteClass */
  override var materials: js.Any = js.native
  /* CompleteClass */
  override var shaderSource: java.lang.String = js.native
  /* CompleteClass */
  override var translucent: scala.Boolean = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var uniforms: js.Any = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTranslucent(): scala.Boolean = js.native
}

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
  def fromType(`type`: java.lang.String): cesiumLib.cesiumMod.CesiumNs.Material = js.native
  def fromType(`type`: java.lang.String, uniforms: js.Any): cesiumLib.cesiumMod.CesiumNs.Material = js.native
}

