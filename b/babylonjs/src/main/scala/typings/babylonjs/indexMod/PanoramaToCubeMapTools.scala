package typings.babylonjs.indexMod

import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PanoramaToCubeMapTools")
@js.native
open class PanoramaToCubeMapTools ()
  extends typings.babylonjs.miscIndexMod.PanoramaToCubeMapTools
/* static members */
object PanoramaToCubeMapTools {
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.CalcProjectionSpherical")
  @js.native
  def CalcProjectionSpherical: Any = js.native
  inline def CalcProjectionSpherical_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a panorama stored in RGB right to left up to down format into a cubemap (6 faces).
    *
    * @param float32Array The source data.
    * @param inputWidth The width of the input panorama.
    * @param inputHeight The height of the input panorama.
    * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
    * @returns The cubemap data
    */
  inline def ConvertPanoramaToCubemap(float32Array: js.typedarray.Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertPanoramaToCubemap")(float32Array.asInstanceOf[js.Any], inputWidth.asInstanceOf[js.Any], inputHeight.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.CreateCubemapTexture")
  @js.native
  def CreateCubemapTexture: Any = js.native
  inline def CreateCubemapTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_BACK")
  @js.native
  def FACE_BACK: Any = js.native
  inline def FACE_BACK_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_DOWN")
  @js.native
  def FACE_DOWN: Any = js.native
  inline def FACE_DOWN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_FRONT")
  @js.native
  def FACE_FRONT: Any = js.native
  inline def FACE_FRONT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_LEFT")
  @js.native
  def FACE_LEFT: Any = js.native
  inline def FACE_LEFT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_RIGHT")
  @js.native
  def FACE_RIGHT: Any = js.native
  inline def FACE_RIGHT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PanoramaToCubeMapTools.FACE_UP")
  @js.native
  def FACE_UP: Any = js.native
  inline def FACE_UP_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
}
