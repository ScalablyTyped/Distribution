package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.CubeMapInfo
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PanoramaToCubeMapTools")
@js.native
class PanoramaToCubeMapTools ()
  extends typings.babylonjs.BABYLON.PanoramaToCubeMapTools
/* static members */
@JSGlobal("BABYLON.PanoramaToCubeMapTools")
@js.native
object PanoramaToCubeMapTools extends js.Object {
  
  var CalcProjectionSpherical: js.Any = js.native
  
  /**
    * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
    *
    * @param float32Array The source data.
    * @param inputWidth The width of the input panorama.
    * @param inputHeight The height of the input panorama.
    * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
    * @return The cubemap data
    */
  def ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
  
  var CreateCubemapTexture: js.Any = js.native
  
  var FACE_BACK: js.Any = js.native
  
  var FACE_DOWN: js.Any = js.native
  
  var FACE_FRONT: js.Any = js.native
  
  var FACE_LEFT: js.Any = js.native
  
  var FACE_RIGHT: js.Any = js.native
  
  var FACE_UP: js.Any = js.native
}
