package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.renderingFluidRendererFluidRenderingObjectMod.FluidRenderingObject
import typings.babylonjs.renderingFluidRendererFluidRenderingTargetRendererMod.FluidRenderingTargetRenderer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingFluidRendererFluidRendererMod {
  
  @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderer", "FluidRenderer")
  @js.native
  open class FluidRenderer protected () extends StObject {
    /**
      * Initializes the class
      * @param scene Scene in which the objects are part of
      */
    def this(scene: Scene) = this()
    
    /* private */ var _cameras: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _getParticleSystemIndex: Any = js.native
    
    /* private */ var _initialize: Any = js.native
    
    /* private */ var _onEngineResizeObserver: Any = js.native
    
    /** @internal */
    def _prepareRendering(): Unit = js.native
    
    /* private */ var _removeUnusedTargetRenderers: Any = js.native
    
    /** @internal */
    def _render(): Unit = js.native
    def _render(forCamera: Camera): Unit = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setParticleSizeForRenderTargets: Any = js.native
    
    /* private */ var _setUseVelocityForRenderObject: Any = js.native
    
    /* private */ var _sortRenderingObjects: Any = js.native
    
    /**
      * Adds a custom particle set to the fluid renderer.
      * @param buffers The list of buffers (should contain at least a "position" buffer!)
      * @param numParticles Number of particles in each buffer
      * @param generateDiffuseTexture True if you want to generate a diffuse texture from buffers and use it as part of the fluid rendering (default: false). For the texture to be generated correctly, you need a "color" buffer in the set!
      * @param targetRenderer The target renderer used to display the particle system as a fluid. If not provided, the method will create a new one
      * @param camera The camera used by the target renderer (if the target renderer is created by the method)
      * @returns the render object corresponding to the custom particle set
      */
    def addCustomParticles(buffers: StringDictionary[FloatArray], numParticles: Double): IFluidRenderingRenderObject = js.native
    def addCustomParticles(buffers: StringDictionary[FloatArray], numParticles: Double, generateDiffuseTexture: Boolean): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Boolean,
      targetRenderer: Unit,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Boolean,
      targetRenderer: FluidRenderingTargetRenderer
    ): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Boolean,
      targetRenderer: FluidRenderingTargetRenderer,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Unit,
      targetRenderer: Unit,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Unit,
      targetRenderer: FluidRenderingTargetRenderer
    ): IFluidRenderingRenderObject = js.native
    def addCustomParticles(
      buffers: StringDictionary[FloatArray],
      numParticles: Double,
      generateDiffuseTexture: Unit,
      targetRenderer: FluidRenderingTargetRenderer,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    
    /**
      * Adds a particle system to the fluid renderer.
      * Note that you should not normally call this method directly, as you can simply use the renderAsFluid property of the ParticleSystem/GPUParticleSystem class
      * @param ps particle system
      * @param generateDiffuseTexture True if you want to generate a diffuse texture from the particle system and use it as part of the fluid rendering (default: false)
      * @param targetRenderer The target renderer used to display the particle system as a fluid. If not provided, the method will create a new one
      * @param camera The camera used by the target renderer (if the target renderer is created by the method)
      * @returns the render object corresponding to the particle system
      */
    def addParticleSystem(ps: IParticleSystem): IFluidRenderingRenderObject = js.native
    def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean): IFluidRenderingRenderObject = js.native
    def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean, targetRenderer: Unit, camera: Camera): IFluidRenderingRenderObject = js.native
    def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = js.native
    def addParticleSystem(
      ps: IParticleSystem,
      generateDiffuseTexture: Boolean,
      targetRenderer: FluidRenderingTargetRenderer,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Unit, targetRenderer: Unit, camera: Camera): IFluidRenderingRenderObject = js.native
    def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Unit, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = js.native
    def addParticleSystem(
      ps: IParticleSystem,
      generateDiffuseTexture: Unit,
      targetRenderer: FluidRenderingTargetRenderer,
      camera: Camera
    ): IFluidRenderingRenderObject = js.native
    
    /**
      * Disposes of all the ressources used by the class
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the render object corresponding to a particle system (null if the particle system is not rendered as a fluid)
      * @param ps The particle system
      * @returns the render object corresponding to this particle system if any, otherwise null
      */
    def getRenderObjectFromParticleSystem(ps: IParticleSystem): Nullable[IFluidRenderingRenderObject] = js.native
    
    /**
      * Reinitializes the class
      * Can be used if you change the object priority (FluidRenderingObject.priority), to make sure the objects are rendered in the right order
      */
    def recreate(): Unit = js.native
    
    /**
      * Removes a render object from the fluid renderer
      * @param renderObject the render object to remove
      * @param removeUnusedTargetRenderer True to remove/dispose of the target renderer if it's not used anymore (default: true)
      * @returns True if the render object has been found and released, else false
      */
    def removeRenderObject(renderObject: IFluidRenderingRenderObject): Boolean = js.native
    def removeRenderObject(renderObject: IFluidRenderingRenderObject, removeUnusedTargetRenderer: Boolean): Boolean = js.native
    
    /** Retrieves all the render objects managed by the class */
    val renderObjects: js.Array[IFluidRenderingRenderObject] = js.native
    
    /** Retrieves all the render target renderers managed by the class */
    val targetRenderers: js.Array[FluidRenderingTargetRenderer] = js.native
  }
  /* static members */
  object FluidRenderer {
    
    @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderer", "FluidRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderer", "FluidRendererSceneComponent")
  @js.native
  open class FluidRendererSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _afterCameraDraw: Any = js.native
    
    /* private */ var _gatherActiveCameraRenderTargets: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  trait IFluidRenderingRenderObject extends StObject {
    
    /** object rendered as a fluid */
    var `object`: FluidRenderingObject
    
    /** target renderer used to render the fluid object */
    var targetRenderer: FluidRenderingTargetRenderer
  }
  object IFluidRenderingRenderObject {
    
    inline def apply(`object`: FluidRenderingObject, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = {
      val __obj = js.Dynamic.literal(targetRenderer = targetRenderer.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFluidRenderingRenderObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFluidRenderingRenderObject] (val x: Self) extends AnyVal {
      
      inline def setObject(value: FluidRenderingObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setTargetRenderer(value: FluidRenderingTargetRenderer): Self = StObject.set(x, "targetRenderer", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /** @internal (Backing field) */
      var _fluidRenderer: Nullable[FluidRenderer]
      
      /**
        * Disables the fluid renderer associated with the scene
        */
      def disableFluidRenderer(): Unit
      
      /**
        * Enables the fluid renderer and associates it with the scene
        * @returns the FluidRenderer
        */
      def enableFluidRenderer(): Nullable[FluidRenderer]
      
      /**
        * Gets or Sets the fluid renderer associated to the scene.
        */
      var fluidRenderer: Nullable[FluidRenderer]
    }
    object AbstractScene {
      
      inline def apply(disableFluidRenderer: () => Unit, enableFluidRenderer: () => Nullable[FluidRenderer]): AbstractScene = {
        val __obj = js.Dynamic.literal(disableFluidRenderer = js.Any.fromFunction0(disableFluidRenderer), enableFluidRenderer = js.Any.fromFunction0(enableFluidRenderer), _fluidRenderer = null, fluidRenderer = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setDisableFluidRenderer(value: () => Unit): Self = StObject.set(x, "disableFluidRenderer", js.Any.fromFunction0(value))
        
        inline def setEnableFluidRenderer(value: () => Nullable[FluidRenderer]): Self = StObject.set(x, "enableFluidRenderer", js.Any.fromFunction0(value))
        
        inline def setFluidRenderer(value: Nullable[FluidRenderer]): Self = StObject.set(x, "fluidRenderer", value.asInstanceOf[js.Any])
        
        inline def setFluidRendererNull: Self = StObject.set(x, "fluidRenderer", null)
        
        inline def set_fluidRenderer(value: Nullable[FluidRenderer]): Self = StObject.set(x, "_fluidRenderer", value.asInstanceOf[js.Any])
        
        inline def set_fluidRendererNull: Self = StObject.set(x, "_fluidRenderer", null)
      }
    }
  }
}
