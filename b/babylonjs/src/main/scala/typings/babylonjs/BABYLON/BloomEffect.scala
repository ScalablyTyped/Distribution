package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BloomEffect")
@js.native
class BloomEffect protected () extends PostProcessRenderEffect {
  /**
    * Creates a new instance of @see BloomEffect
    * @param scene The scene the effect belongs to.
    * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
    * @param bloomKernel The size of the kernel to be used when applying the blur.
    * @param bloomWeight The the strength of bloom.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(scene: Scene, bloomScale: Double, bloomWeight: Double, bloomKernel: Double) = this()
  def this(
    scene: Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  var _blurX: js.Any = js.native
  var _blurY: js.Any = js.native
  /**
    * @hidden Internal
    */
  var _downscale: ExtractHighlightsPostProcess = js.native
  /**
    * @hidden Internal
    */
  var _effects: js.Array[PostProcess] = js.native
  var _merge: js.Any = js.native
  var bloomScale: js.Any = js.native
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
    * Disposes each of the internal effects for a given camera.
    * @param camera The camera to dispose the effect on.
    */
  def disposeEffects(camera: Camera): Unit = js.native
  /**
    * Specifies the size of the bloom blur kernel, relative to the final output size
    */
  def kernel(): Double = js.native
  def kernel(value: Double): js.Any = js.native
  /**
    * The luminance threshold to find bright areas of the image to bloom.
    */
  def threshold(): Double = js.native
  def threshold(value: Double): js.Any = js.native
  /**
    * The strength of the bloom.
    */
  def weight(): Double = js.native
  def weight(value: Double): js.Any = js.native
}

