package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthOfFieldEffect")
@js.native
class DepthOfFieldEffect protected ()
  extends typings.babylonjs.BABYLON.DepthOfFieldEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture]
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: typings.babylonjs.BABYLON.DepthOfFieldEffectBlurLevel
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: typings.babylonjs.BABYLON.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: js.UndefOr[scala.Nothing],
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: typings.babylonjs.BABYLON.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: js.UndefOr[scala.Nothing],
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    depthTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    blurLevel: typings.babylonjs.BABYLON.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
}
