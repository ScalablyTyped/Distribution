package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.miscHighDynamicRangePanoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools")
@js.native
open class CubeMapToSphericalPolynomialTools ()
  extends typings.babylonjs.indexMod.CubeMapToSphericalPolynomialTools
/* static members */
object CubeMapToSphericalPolynomialTools {
  
  @JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @returns The Spherical Polynomial data.
    */
  inline def ConvertCubeMapTextureToSphericalPolynomial(texture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture): Nullable[js.Promise[typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapTextureToSphericalPolynomial")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[js.Promise[typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial]]]
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @returns The Spherical Polynomial data.
    */
  inline def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapToSphericalPolynomial")(cubeInfo.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial]
  
  /** @internal */
  @JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools.MAX_HDRI_VALUE")
  @js.native
  def MAX_HDRI_VALUE: Double = js.native
  inline def MAX_HDRI_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_HDRI_VALUE")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools.PRESERVE_CLAMPED_COLORS")
  @js.native
  def PRESERVE_CLAMPED_COLORS: Boolean = js.native
  inline def PRESERVE_CLAMPED_COLORS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESERVE_CLAMPED_COLORS")(x.asInstanceOf[js.Any])
  
  /**
    * Compute the area on the unit sphere of the rectangle defined by (x,y) and the origin
    * See https://www.rorydriscoll.com/2012/01/15/cubemap-texel-solid-angle/
    * @param x
    * @param y
    */
  @JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools._AreaElement")
  @js.native
  def _AreaElement: Any = js.native
  inline def _AreaElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AreaElement")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "CubeMapToSphericalPolynomialTools._FileFaces")
  @js.native
  def _FileFaces: Any = js.native
  inline def _FileFaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FileFaces")(x.asInstanceOf[js.Any])
}
