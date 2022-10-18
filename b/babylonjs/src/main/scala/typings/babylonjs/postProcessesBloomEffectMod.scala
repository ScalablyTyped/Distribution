package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.postProcessesExtractHighlightsPostProcessMod.ExtractHighlightsPostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderEffectMod.PostProcessRenderEffect
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesBloomEffectMod {
  
  @JSImport("babylonjs/PostProcesses/bloomEffect", "BloomEffect")
  @js.native
  open class BloomEffect protected () extends PostProcessRenderEffect {
    /**
      * Creates a new instance of @see BloomEffect
      * @param scene The scene the effect belongs to.
      * @param _bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
      * @param bloomWeight The the strength of bloom.
      * @param bloomKernel The size of the kernel to be used when applying the blur.
      * @param pipelineTextureType The type of texture to be used when performing the post processing.
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(scene: Scene, _bloomScale: Double, bloomWeight: Double, bloomKernel: Double) = this()
    def this(
      scene: Scene,
      _bloomScale: Double,
      bloomWeight: Double,
      bloomKernel: Double,
      pipelineTextureType: Double
    ) = this()
    def this(
      scene: Scene,
      _bloomScale: Double,
      bloomWeight: Double,
      bloomKernel: Double,
      pipelineTextureType: Double,
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      _bloomScale: Double,
      bloomWeight: Double,
      bloomKernel: Double,
      pipelineTextureType: Unit,
      blockCompilation: Boolean
    ) = this()
    
    /* private */ var _bloomScale: Any = js.native
    
    /* private */ var _blurX: Any = js.native
    
    /* private */ var _blurY: Any = js.native
    
    /**
      * @internal Internal
      */
    var _downscale: ExtractHighlightsPostProcess = js.native
    
    /**
      * @internal Internal
      */
    var _effects: js.Array[PostProcess] = js.native
    
    /**
      * Internal
      * @returns if all the contained post processes are ready.
      * @internal
      */
    def _isReady(): Boolean = js.native
    
    /* private */ var _merge: Any = js.native
    
    /**
      * @internal Internal
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
    def kernel: Double = js.native
    def kernel_=(value: Double): Unit = js.native
    
    /**
      * The luminance threshold to find bright areas of the image to bloom.
      */
    def threshold: Double = js.native
    def threshold_=(value: Double): Unit = js.native
    
    /**
      * The strength of the bloom.
      */
    def weight: Double = js.native
    def weight_=(value: Double): Unit = js.native
  }
}
