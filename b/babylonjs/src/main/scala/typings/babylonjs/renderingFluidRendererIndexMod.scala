package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingFluidRendererIndexMod {
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderer")
  @js.native
  open class FluidRenderer protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer {
    /**
      * Initializes the class
      * @param scene Scene in which the objects are part of
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object FluidRenderer {
    
    @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRendererSceneComponent")
  @js.native
  open class FluidRendererSceneComponent protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRendererSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderingDebug")
  @js.native
  object FluidRenderingDebug extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug & Double
      ] = js.native
    
    /* 1 */ val DepthBlurredTexture: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.DepthBlurredTexture & Double = js.native
    
    /* 0 */ val DepthTexture: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.DepthTexture & Double = js.native
    
    /* 6 */ val DiffuseRendering: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.DiffuseRendering & Double = js.native
    
    /* 4 */ val DiffuseTexture: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.DiffuseTexture & Double = js.native
    
    /* 5 */ val Normals: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.Normals & Double = js.native
    
    /* 3 */ val ThicknessBlurredTexture: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.ThicknessBlurredTexture & Double = js.native
    
    /* 2 */ val ThicknessTexture: typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingDebug.ThicknessTexture & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderingObject")
  @js.native
  open class FluidRenderingObject protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRenderingObjectMod.FluidRenderingObject {
    /**
      * Instantiates a fluid rendering object
      * @param scene The scene the object is part of
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderingObjectCustomParticles")
  @js.native
  open class FluidRenderingObjectCustomParticles protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRenderingObjectCustomParticlesMod.FluidRenderingObjectCustomParticles {
    /**
      * Creates a new instance of the class
      * @param scene The scene the particles should be rendered into
      * @param buffers The list of buffers (must contain at least one "position" buffer!). Note that you don't have to pass all (or any!) buffers at once in the constructor, you can use the addBuffers method to add more later.
      * @param numParticles Number of vertices to take into account from the buffers
      */
    def this(scene: Scene, buffers: StringDictionary[FloatArray], numParticles: Double) = this()
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderingObjectParticleSystem")
  @js.native
  open class FluidRenderingObjectParticleSystem protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRenderingObjectParticleSystemMod.FluidRenderingObjectParticleSystem {
    /**
      * Creates a new instance of the class
      * @param scene The scene the particle system is part of
      * @param ps The particle system
      */
    def this(scene: Scene, ps: IParticleSystem) = this()
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/index", "FluidRenderingTargetRenderer")
  @js.native
  open class FluidRenderingTargetRenderer protected ()
    extends typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingTargetRenderer {
    /**
      * Creates an instance of the class
      * @param scene Scene used to render the fluid object into
      * @param camera Camera used to render the fluid object. If not provided, use the active camera of the scene instead
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, camera: Camera) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /** @internal (Backing field) */
      var _fluidRenderer: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
      
      /**
        * Disables the fluid renderer associated with the scene
        */
      def disableFluidRenderer(): Unit
      
      /**
        * Enables the fluid renderer and associates it with the scene
        * @returns the FluidRenderer
        */
      def enableFluidRenderer(): Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
      
      /**
        * Gets or Sets the fluid renderer associated to the scene.
        */
      var fluidRenderer: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
    }
    object AbstractScene {
      
      inline def apply(
        disableFluidRenderer: () => Unit,
        enableFluidRenderer: () => Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(disableFluidRenderer = js.Any.fromFunction0(disableFluidRenderer), enableFluidRenderer = js.Any.fromFunction0(enableFluidRenderer), _fluidRenderer = null, fluidRenderer = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setDisableFluidRenderer(value: () => Unit): Self = StObject.set(x, "disableFluidRenderer", js.Any.fromFunction0(value))
        
        inline def setEnableFluidRenderer(value: () => Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "enableFluidRenderer", js.Any.fromFunction0(value))
        
        inline def setFluidRenderer(value: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "fluidRenderer", value.asInstanceOf[js.Any])
        
        inline def setFluidRendererNull: Self = StObject.set(x, "fluidRenderer", null)
        
        inline def set_fluidRenderer(value: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "_fluidRenderer", value.asInstanceOf[js.Any])
        
        inline def set_fluidRendererNull: Self = StObject.set(x, "_fluidRenderer", null)
      }
    }
  }
}
