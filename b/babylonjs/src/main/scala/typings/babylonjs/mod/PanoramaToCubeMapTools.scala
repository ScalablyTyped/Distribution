package typings.babylonjs.mod

import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PanoramaToCubeMapTools")
@js.native
class PanoramaToCubeMapTools ()
  extends typings.babylonjs.legacyMod.PanoramaToCubeMapTools
/* static members */
object PanoramaToCubeMapTools {
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.CalcProjectionSpherical")
  @js.native
  def CalcProjectionSpherical: js.Any = js.native
  @scala.inline
  def CalcProjectionSpherical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
    *
    * @param float32Array The source data.
    * @param inputWidth The width of the input panorama.
    * @param inputHeight The height of the input panorama.
    * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
    * @return The cubemap data
    */
  @JSImport("babylonjs", "PanoramaToCubeMapTools.ConvertPanoramaToCubemap")
  @js.native
  def ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.CreateCubemapTexture")
  @js.native
  def CreateCubemapTexture: js.Any = js.native
  @scala.inline
  def CreateCubemapTexture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_BACK")
  @js.native
  def FACE_BACK: js.Any = js.native
  @scala.inline
  def FACE_BACK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_DOWN")
  @js.native
  def FACE_DOWN: js.Any = js.native
  @scala.inline
  def FACE_DOWN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_FRONT")
  @js.native
  def FACE_FRONT: js.Any = js.native
  @scala.inline
  def FACE_FRONT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_LEFT")
  @js.native
  def FACE_LEFT: js.Any = js.native
  @scala.inline
  def FACE_LEFT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_RIGHT")
  @js.native
  def FACE_RIGHT: js.Any = js.native
  @scala.inline
  def FACE_RIGHT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PanoramaToCubeMapTools.FACE_UP")
  @js.native
  def FACE_UP: js.Any = js.native
  @scala.inline
  def FACE_UP_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
}
