package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The bloom effect spreads bright areas of an image to simulate artifacts seen in cameras
     */
@JSImport("babylonjs", "BloomEffect")
@js.native
class BloomEffect protected ()
  extends babylonjsLib.BABYLONNs.BloomEffect {
  /**
           * Creates a new instance of @see BloomEffect
           * @param scene The scene the effect belongs to.
           * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
           * @param bloomKernel The size of the kernel to be used when applying the blur.
           * @param bloomWeight The the strength of bloom.
           * @param pipelineTextureType The type of texture to be used when performing the post processing.
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double) = this()
  /**
           * Creates a new instance of @see BloomEffect
           * @param scene The scene the effect belongs to.
           * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
           * @param bloomKernel The size of the kernel to be used when applying the blur.
           * @param bloomWeight The the strength of bloom.
           * @param pipelineTextureType The type of texture to be used when performing the post processing.
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double, pipelineTextureType: scala.Double) = this()
  /**
           * Creates a new instance of @see BloomEffect
           * @param scene The scene the effect belongs to.
           * @param bloomScale The ratio of the blur texture to the input texture that should be used to compute the bloom.
           * @param bloomKernel The size of the kernel to be used when applying the blur.
           * @param bloomWeight The the strength of bloom.
           * @param pipelineTextureType The type of texture to be used when performing the post processing.
           * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, bloomScale: scala.Double, bloomWeight: scala.Double, bloomKernel: scala.Double, pipelineTextureType: scala.Double, blockCompilation: scala.Boolean) = this()
}

