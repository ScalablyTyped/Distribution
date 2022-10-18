package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DepthOfFieldEffect")
@js.native
open class DepthOfFieldEffect protected ()
  extends typings.babylonjs.indexMod.DepthOfFieldEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param blurLevel
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture]
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffectBlurLevel
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: Unit,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: Unit,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: Unit,
    pipelineTextureType: Unit,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture],
    blurLevel: typings.babylonjs.postProcessesDepthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Unit,
    blockCompilation: Boolean
  ) = this()
}
