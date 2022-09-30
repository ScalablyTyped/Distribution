package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.depthOfFieldBlurPostProcessMod.DepthOfFieldBlurPostProcess
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessRenderEffectMod.PostProcessRenderEffect
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthOfFieldEffectMod {
  
  @JSImport("babylonjs/PostProcesses/depthOfFieldEffect", "DepthOfFieldEffect")
  @js.native
  open class DepthOfFieldEffect protected () extends PostProcessRenderEffect {
    /**
      * Creates a new instance DepthOfFieldEffect
      * @param scene The scene the effect belongs to.
      * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
      * @param blurLevel
      * @param pipelineTextureType The type of texture to be used when performing the post processing.
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture]) = this()
    def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture], blurLevel: DepthOfFieldEffectBlurLevel) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: Unit,
      pipelineTextureType: Double
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: Double
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: Unit,
      pipelineTextureType: Double,
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: Unit,
      pipelineTextureType: Unit,
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: Double,
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: Unit,
      blockCompilation: Boolean
    ) = this()
    
    /* private */ var _circleOfConfusion: Any = js.native
    
    /**
      * @internal Internal, blurs from high to low
      */
    var _depthOfFieldBlurX: js.Array[DepthOfFieldBlurPostProcess] = js.native
    
    /* private */ var _depthOfFieldBlurY: Any = js.native
    
    /* private */ var _dofMerge: Any = js.native
    
    /**
      * @internal Internal post processes in depth of field effect
      */
    var _effects: js.Array[PostProcess] = js.native
    
    /**
      * Internal
      * @returns if all the contained post processes are ready.
      * @internal
      */
    def _isReady(): Boolean = js.native
    
    /**
      * @internal Internal
      */
    def _updateEffects(): Unit = js.native
    
    /**
      * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
      */
    def depthTexture_=(value: RenderTargetTexture): Unit = js.native
    
    /**
      * Disposes each of the internal effects for a given camera.
      * @param camera The camera to dispose the effect on.
      */
    def disposeEffects(camera: Camera): Unit = js.native
    
    def fStop: Double = js.native
    /**
      * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
      */
    def fStop_=(value: Double): Unit = js.native
    
    def focalLength: Double = js.native
    /**
      * The focal the length of the camera used in the effect in scene units/1000 (eg. millimeter)
      */
    def focalLength_=(value: Double): Unit = js.native
    
    def focusDistance: Double = js.native
    /**
      * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
      */
    def focusDistance_=(value: Double): Unit = js.native
    
    /**
      * Get the current class name of the current effect
      * @returns "DepthOfFieldEffect"
      */
    def getClassName(): String = js.native
    
    def lensSize: Double = js.native
    /**
      * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diameter of the resulting aperture can be computed by lensSize/fStop.
      */
    def lensSize_=(value: Double): Unit = js.native
  }
  
  @js.native
  sealed trait DepthOfFieldEffectBlurLevel extends StObject
  @JSImport("babylonjs/PostProcesses/depthOfFieldEffect", "DepthOfFieldEffectBlurLevel")
  @js.native
  object DepthOfFieldEffectBlurLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DepthOfFieldEffectBlurLevel & Double] = js.native
    
    /**
      * Large blur
      */
    @js.native
    sealed trait High
      extends StObject
         with DepthOfFieldEffectBlurLevel
    /* 2 */ val High: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel.High & Double = js.native
    
    /**
      * Subtle blur
      */
    @js.native
    sealed trait Low
      extends StObject
         with DepthOfFieldEffectBlurLevel
    /* 0 */ val Low: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel.Low & Double = js.native
    
    /**
      * Medium blur
      */
    @js.native
    sealed trait Medium
      extends StObject
         with DepthOfFieldEffectBlurLevel
    /* 1 */ val Medium: typings.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel.Medium & Double = js.native
  }
}
