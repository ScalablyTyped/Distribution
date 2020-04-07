package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(
    scene: Scene,
    depthTexture: Nullable[RenderTargetTexture],
    blurLevel: DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: Scene,
    depthTexture: Nullable[RenderTargetTexture],
    blurLevel: DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
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
    * Internal
    * @returns if all the contained post processes are ready.
    * @hidden
    */
  def _isReady(): Boolean = js.native
  /**
    * @hidden Internal
    */
  def _updateEffects(): Unit = js.native
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  def depthTexture(value: RenderTargetTexture): js.Any = js.native
  /**
    * Disposes each of the internal effects for a given camera.
    * @param camera The camera to dispose the effect on.
    */
  def disposeEffects(camera: Camera): Unit = js.native
  def fStop(): Double = js.native
  /**
    * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  def fStop(value: Double): js.Any = js.native
  def focalLength(): Double = js.native
  /**
    * The focal the length of the camera used in the effect in scene units/1000 (eg. millimeter)
    */
  def focalLength(value: Double): js.Any = js.native
  def focusDistance(): Double = js.native
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  def focusDistance(value: Double): js.Any = js.native
  /**
    * Get the current class name of the current effet
    * @returns "DepthOfFieldEffect"
    */
  def getClassName(): String = js.native
  def lensSize(): Double = js.native
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diamater of the resulting aperture can be computed by lensSize/fStop.
    */
  def lensSize(value: Double): js.Any = js.native
}

