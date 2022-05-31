package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BloomEffect")
@js.native
class BloomEffect protected ()
  extends typings.babylonjs.postProcessesIndexMod.BloomEffect {
  /**
    * Creates a new instance of @see BloomEffect
    * @param scene The scene the effect belongs to.
    * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
    * @param bloomKernel The size of the kernel to be used when applying the blur.
    * @param bloomWeight The the strength of bloom.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bloomScale: Double,
    bloomWeight: Double,
    bloomKernel: Double,
    pipelineTextureType: Unit,
    blockCompilation: Boolean
  ) = this()
}
