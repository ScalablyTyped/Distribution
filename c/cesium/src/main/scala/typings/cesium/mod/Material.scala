package typings.cesium.mod

import typings.cesium.anon.Fabric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Material")
@js.native
class Material () extends StObject {
  def this(options: Fabric) = this()
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def isTranslucent(): Boolean = js.native
  
  var materials: js.Any = js.native
  
  var shaderSource: String = js.native
  
  var translucent: Boolean | (js.Function1[/* material */ this.type, Boolean]) = js.native
  
  var `type`: String = js.native
  
  var uniforms: js.Any = js.native
}
object Material {
  
  @JSImport("cesium", "Material")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Material.AlphaMapType")
  @js.native
  def AlphaMapType: String = js.native
  @scala.inline
  def AlphaMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlphaMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.BumpMapType")
  @js.native
  def BumpMapType: String = js.native
  @scala.inline
  def BumpMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BumpMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.CheckerboardType")
  @js.native
  def CheckerboardType: String = js.native
  @scala.inline
  def CheckerboardType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckerboardType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.ColorType")
  @js.native
  def ColorType: String = js.native
  @scala.inline
  def ColorType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.DefaultCubeMapId")
  @js.native
  def DefaultCubeMapId: String = js.native
  @scala.inline
  def DefaultCubeMapId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCubeMapId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.DefaultImageId")
  @js.native
  def DefaultImageId: String = js.native
  @scala.inline
  def DefaultImageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultImageId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.DiffuseMapType")
  @js.native
  def DiffuseMapType: String = js.native
  @scala.inline
  def DiffuseMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DiffuseMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.DotType")
  @js.native
  def DotType: String = js.native
  @scala.inline
  def DotType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.EmissionMapType")
  @js.native
  def EmissionMapType: String = js.native
  @scala.inline
  def EmissionMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmissionMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.FadeType")
  @js.native
  def FadeType: String = js.native
  @scala.inline
  def FadeType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FadeType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.GridType")
  @js.native
  def GridType: String = js.native
  @scala.inline
  def GridType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GridType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.ImageType")
  @js.native
  def ImageType: String = js.native
  @scala.inline
  def ImageType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImageType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.NormalMapType")
  @js.native
  def NormalMapType: String = js.native
  @scala.inline
  def NormalMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NormalMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.PolylineArrowType")
  @js.native
  def PolylineArrowType: String = js.native
  @scala.inline
  def PolylineArrowType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolylineArrowType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.PolylineGlowType")
  @js.native
  def PolylineGlowType: String = js.native
  @scala.inline
  def PolylineGlowType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolylineGlowType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.PolylineOutlineType")
  @js.native
  def PolylineOutlineType: String = js.native
  @scala.inline
  def PolylineOutlineType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolylineOutlineType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.RimLightingType")
  @js.native
  def RimLightingType: String = js.native
  @scala.inline
  def RimLightingType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RimLightingType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.SpecularMapType")
  @js.native
  def SpecularMapType: String = js.native
  @scala.inline
  def SpecularMapType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpecularMapType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.StripeType")
  @js.native
  def StripeType: String = js.native
  @scala.inline
  def StripeType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StripeType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Material.WaterType")
  @js.native
  def WaterType: String = js.native
  @scala.inline
  def WaterType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WaterType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def fromType(`type`: String): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Material]
  @scala.inline
  def fromType(`type`: String, uniforms: js.Any): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Material]
}
