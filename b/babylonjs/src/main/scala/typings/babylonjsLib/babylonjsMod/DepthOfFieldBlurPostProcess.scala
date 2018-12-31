package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DepthOfFieldBlurPostProcess applied a blur in a give direction.
  * This blur differs from the standard BlurPostProcess as it attempts to avoid blurring pixels
  * based on samples that have a large difference in distance than the center pixel.
  * See section 2.6.2 http://fileadmin.cs.lth.se/cs/education/edan35/lectures/12dof.pdf
  */
@JSImport("babylonjs", "DepthOfFieldBlurPostProcess")
@js.native
class DepthOfFieldBlurPostProcess protected ()
  extends babylonjsLib.BABYLONNs.DepthOfFieldBlurPostProcess {
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, direction: babylonjsLib.BABYLONNs.Vector2, kernel: scala.Double, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, imageToBlur: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PostProcess]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], blockCompilation: js.UndefOr[scala.Boolean]) = this()
  /**
    * Creates a new instance CircleOfConfusionPostProcess
    * @param name The name of the effect.
    * @param scene The scene the effect belongs to.
    * @param direction The direction the blur should be applied.
    * @param kernel The size of the kernel used to blur.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param circleOfConfusion The circle of confusion + depth map to be used to avoid blurring accross edges
    * @param imageToBlur The image to apply the blur to (default: Current rendered frame)
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, direction: babylonjsLib.BABYLONNs.Vector2, kernel: scala.Double, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess, imageToBlur: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PostProcess]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], blockCompilation: js.UndefOr[scala.Boolean]) = this()
}

