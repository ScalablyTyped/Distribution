package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CircleOfConfusionPostProcess computes the circle of confusion value for each pixel given required lens parameters. See https://en.wikipedia.org/wiki/Circle_of_confusion
  */
@JSImport("babylonjs", "CircleOfConfusionPostProcess")
@js.native
class CircleOfConfusionPostProcess protected ()
  extends babylonjsLib.BABYLONNs.CircleOfConfusionPostProcess {
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
    * Creates a new instance CircleOfConfusionPostProcess
    * @param name The name of the effect.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion. This must be set in order for this to function but may be set after initialization if needed.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  def this(name: java.lang.String, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
}

