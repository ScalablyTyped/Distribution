package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class usefull to convert panorama picture to their cubemap representation in 6 faces.
  */
@JSImport("babylonjs", "PanoramaToCubeMapTools")
@js.native
class PanoramaToCubeMapTools ()
  extends babylonjsLib.BABYLONNs.PanoramaToCubeMapTools

/**
  * Helper class usefull to convert panorama picture to their cubemap representation in 6 faces.
  */
@JSImport("babylonjs", "PanoramaToCubeMapTools")
@js.native
object PanoramaToCubeMapTools extends js.Object {
  var CalcProjectionSpherical: js.Any = js.native
  var CreateCubemapTexture: js.Any = js.native
  var FACE_BACK: js.Any = js.native
  var FACE_DOWN: js.Any = js.native
  var FACE_FRONT: js.Any = js.native
  var FACE_LEFT: js.Any = js.native
  var FACE_RIGHT: js.Any = js.native
  var FACE_UP: js.Any = js.native
  /**
    * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
    *
    * @param float32Array The source data.
    * @param inputWidth The width of the input panorama.
    * @param inputHeight The height of the input panorama.
    * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
    * @return The cubemap data
    */
  def ConvertPanoramaToCubemap(
    float32Array: stdLib.Float32Array,
    inputWidth: scala.Double,
    inputHeight: scala.Double,
    size: scala.Double
  ): babylonjsLib.BABYLONNs.CubeMapInfo = js.native
}

