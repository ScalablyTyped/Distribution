package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "BloomEffect")
@js.native
open class BloomEffect protected ()
  extends typings.babylonjs.postProcessesBloomEffectMod.BloomEffect {
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
}
