package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Blur Post Process which blurs an image based on a kernel and direction.
  * Can be used twice in x and y directions to perform a guassian blur in two passes.
  */
@JSImport("babylonjs", "BlurPostProcess")
@js.native
class BlurPostProcess protected ()
  extends babylonjsLib.BABYLONNs.BlurPostProcess {
  def this(name: java.lang.String, /** The direction in which to blur the image. */
  direction: babylonjsLib.BABYLONNs.Vector2, kernel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], defines: js.UndefOr[java.lang.String], blockCompilation: js.UndefOr[scala.Boolean]) = this()
  /**
    * Creates a new instance BlurPostProcess
    * @param name The name of the effect.
    * @param direction The direction in which to blur the image.
    * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, /** The direction in which to blur the image. */
  direction: babylonjsLib.BABYLONNs.Vector2, kernel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], defines: js.UndefOr[java.lang.String], blockCompilation: js.UndefOr[scala.Boolean]) = this()
}

