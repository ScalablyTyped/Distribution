package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "DepthOfFieldEffect")
@js.native
class DepthOfFieldEffect protected ()
  extends typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture]) = this()
  def this(
    scene: Scene,
    depthTexture: Nullable[RenderTargetTexture],
    blurLevel: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel
  ) = this()
  def this(
    scene: Scene,
    depthTexture: Nullable[RenderTargetTexture],
    blurLevel: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: Scene,
    depthTexture: Nullable[RenderTargetTexture],
    blurLevel: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
}

