package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.lightsHemisphericLightMod.HemisphericLight
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingUtilityLayerRendererMod {
  
  @JSImport("babylonjs/Rendering/utilityLayerRenderer", "UtilityLayerRenderer")
  @js.native
  open class UtilityLayerRenderer protected ()
    extends StObject
       with IDisposable {
    /**
      * Instantiates a UtilityLayerRenderer
      * @param originalScene the original scene that will be rendered on top of
      * @param handleEvents boolean indicating if the utility layer should handle events
      */
    def this(/** the original scene that will be rendered on top of */
    originalScene: Scene) = this()
    def this(
      /** the original scene that will be rendered on top of */
    originalScene: Scene,
      handleEvents: Boolean
    ) = this()
    
    /* private */ var _afterRenderObserver: Any = js.native
    
    /**
      * @internal
      * Light which used by gizmos to get light shading
      */
    def _getSharedGizmoLight(): HemisphericLight = js.native
    
    /* private */ var _lastPointerEvents: Any = js.native
    
    /* private */ var _notifyObservers: Any = js.native
    
    /* private */ var _originalPointerObserver: Any = js.native
    
    /* private */ var _pointerCaptures: Any = js.native
    
    /* private */ var _renderCamera: Any = js.native
    
    /* private */ var _sceneDisposeObserver: Any = js.native
    
    /* private */ var _sharedGizmoLight: Any = js.native
    
    /* private */ var _updateCamera: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the camera that is used to render the utility layer (when not set, this will be the last active camera)
      * @param getRigParentIfPossible if the current active camera is a rig camera, should its parent camera be returned
      * @returns the camera that is used when rendering the utility layer
      */
    def getRenderCamera(): Camera = js.native
    def getRenderCamera(getRigParentIfPossible: Boolean): Camera = js.native
    
    /** Gets or sets a predicate that will be used to indicate utility meshes present in the main scene */
    def mainSceneTrackerPredicate(mesh: Nullable[AbstractMesh]): Boolean = js.native
    
    /**
      * Observable raised when the pointer moves from the utility layer scene to the main scene
      */
    var onPointerOutObservable: Observable[Double] = js.native
    
    /**
      * If set to true, only pointer down onPointerObservable events will be blocked when picking is occluded by original scene
      */
    var onlyCheckPointerDownEvents: Boolean = js.native
    
    /** the original scene that will be rendered on top of */
    var originalScene: Scene = js.native
    
    /**
      * If the picking should be done on the utility layer prior to the actual scene (Default: true)
      */
    var pickUtilitySceneFirst: Boolean = js.native
    
    /**
      * Set to false to disable picking
      */
    var pickingEnabled: Boolean = js.native
    
    /**
      * If set to false, only pointerUp, pointerDown and pointerMove will be sent to the utilityLayerScene (false by default)
      */
    var processAllEvents: Boolean = js.native
    
    /**
      * Renders the utility layers scene on top of the original scene
      */
    def render(): Unit = js.native
    
    /**
      * Sets the camera that should be used when rendering the utility layer (If set to null the last active camera will be used)
      * @param cam the camera that should be used when rendering the utility layer
      */
    def setRenderCamera(cam: Nullable[Camera]): Unit = js.native
    
    /**
      *  If the utility layer should automatically be rendered on top of existing scene
      */
    var shouldRender: Boolean = js.native
    
    /**
      * The scene that is rendered on top of the original scene
      */
    var utilityLayerScene: Scene = js.native
  }
  /* static members */
  object UtilityLayerRenderer {
    
    @JSImport("babylonjs/Rendering/utilityLayerRenderer", "UtilityLayerRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an utility layer, and set it as a default utility layer
      * @param scene associated scene
      * @internal
      */
    inline def _CreateDefaultUtilityLayerFromScene(scene: Scene): UtilityLayerRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("_CreateDefaultUtilityLayerFromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[UtilityLayerRenderer]
    
    /** @internal */
    @JSImport("babylonjs/Rendering/utilityLayerRenderer", "UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
    @js.native
    def _DefaultKeepDepthUtilityLayer: Nullable[UtilityLayerRenderer] = js.native
    inline def _DefaultKeepDepthUtilityLayer_=(x: Nullable[UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("babylonjs/Rendering/utilityLayerRenderer", "UtilityLayerRenderer._DefaultUtilityLayer")
    @js.native
    def _DefaultUtilityLayer: Nullable[UtilityLayerRenderer] = js.native
    inline def _DefaultUtilityLayer_=(x: Nullable[UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
  }
}
