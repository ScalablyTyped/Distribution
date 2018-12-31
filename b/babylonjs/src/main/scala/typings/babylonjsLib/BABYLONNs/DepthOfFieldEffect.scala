package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The depth of field effect applies a blur to objects that are closer or further from where the camera is focusing.
  */
@JSGlobal("BABYLON.DepthOfFieldEffect")
@js.native
class DepthOfFieldEffect protected () extends PostProcessRenderEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture]) = this()
  def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture], blurLevel: DepthOfFieldEffectBlurLevel) = this()
  def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture], blurLevel: DepthOfFieldEffectBlurLevel, pipelineTextureType: scala.Double) = this()
  def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture], blurLevel: DepthOfFieldEffectBlurLevel, pipelineTextureType: scala.Double, blockCompilation: scala.Boolean) = this()
  var _circleOfConfusion: js.Any = js.native
  /**
    * @hidden Internal, blurs from high to low
    */
  var _depthOfFieldBlurX: js.Array[DepthOfFieldBlurPostProcess] = js.native
  var _depthOfFieldBlurY: js.Any = js.native
  var _dofMerge: js.Any = js.native
  /**
    * @hidden Internal post processes in depth of field effect
    */
  var _effects: js.Array[PostProcess] = js.native
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  var depthTexture: RenderTargetTexture = js.native
  /**
    * F-Stop of the effect's camera. The diamater of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  var fStop: scala.Double = js.native
  /**
    * The focal the length of the camera used in the effect in scene units/1000 (eg. millimeter)
    */
  var focalLength: scala.Double = js.native
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  var focusDistance: scala.Double = js.native
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diamater of the resulting aperture can be computed by lensSize/fStop.
    */
  var lensSize: scala.Double = js.native
  /**
    * Internal
    * @returns if all the contained post processes are ready.
    * @hidden
    */
  def _isReady(): scala.Boolean = js.native
  /**
    * @hidden Internal
    */
  def _updateEffects(): scala.Unit = js.native
  /**
    * Disposes each of the internal effects for a given camera.
    * @param camera The camera to dispose the effect on.
    */
  def disposeEffects(camera: Camera): scala.Unit = js.native
}

