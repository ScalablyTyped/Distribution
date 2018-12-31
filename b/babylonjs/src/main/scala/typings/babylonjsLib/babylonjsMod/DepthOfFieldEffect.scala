package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The depth of field effect applies a blur to objects that are closer or further from where the camera is focusing.
  */
@JSImport("babylonjs", "DepthOfFieldEffect")
@js.native
class DepthOfFieldEffect protected ()
  extends babylonjsLib.BABYLONNs.DepthOfFieldEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture]) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], blurLevel: babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], blurLevel: babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel, pipelineTextureType: scala.Double) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, depthTexture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RenderTargetTexture], blurLevel: babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel, pipelineTextureType: scala.Double, blockCompilation: scala.Boolean) = this()
}

