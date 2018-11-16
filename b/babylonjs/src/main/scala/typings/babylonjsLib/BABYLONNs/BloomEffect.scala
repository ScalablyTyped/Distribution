package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The bloom effect spreads bright areas of an image to simulate artifacts seen in cameras
     */
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
  def this(scene: Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double) = this()
  /**
           * Creates a new instance of @see BloomEffect
           * @param scene The scene the effect belongs to.
           * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
           * @param bloomKernel The size of the kernel to be used when applying the blur.
           * @param bloomWeight The the strength of bloom.
           * @param pipelineTextureType The type of texture to be used when performing the post processing.
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(scene: Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double, pipelineTextureType: scala.Double) = this()
  /**
           * Creates a new instance of @see BloomEffect
           * @param scene The scene the effect belongs to.
           * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
           * @param bloomKernel The size of the kernel to be used when applying the blur.
           * @param bloomWeight The the strength of bloom.
           * @param pipelineTextureType The type of texture to be used when performing the post processing.
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(scene: Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double, pipelineTextureType: scala.Double, blockCompilation: scala.Boolean) = this()
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
           * Specifies the size of the bloom blur kernel, relative to the final output size
           */
  var kernel: scala.Double = js.native
  /**
           * The luminance threshold to find bright areas of the image to bloom.
           */
  var threshold: scala.Double = js.native
  /**
           * The strength of the bloom.
           */
  var weight: scala.Double = js.native
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

