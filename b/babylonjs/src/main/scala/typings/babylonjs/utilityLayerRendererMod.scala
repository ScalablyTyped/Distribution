package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.hemisphericLightMod.HemisphericLight
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/utilityLayerRenderer", JSImport.Namespace)
@js.native
object utilityLayerRendererMod extends js.Object {
  
  @js.native
  class UtilityLayerRenderer protected () extends IDisposable {
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
    
    var _afterRenderObserver: js.Any = js.native
    
    /**
      * @hidden
      * Light which used by gizmos to get light shading
      */
    def _getSharedGizmoLight(): HemisphericLight = js.native
    
    var _lastPointerEvents: js.Any = js.native
    
    var _notifyObservers: js.Any = js.native
    
    var _originalPointerObserver: js.Any = js.native
    
    var _pointerCaptures: js.Any = js.native
    
    var _renderCamera: js.Any = js.native
    
    var _sceneDisposeObserver: js.Any = js.native
    
    var _sharedGizmoLight: js.Any = js.native
    
    var _updateCamera: js.Any = js.native
    
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
      * Observable raised when the pointer move from the utility layer scene to the main scene
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
  @js.native
  object UtilityLayerRenderer extends js.Object {
    
    /**
      * A shared utility layer that can be used to embed objects into a scene (Depth map of the previous scene is not cleared before drawing on top of it)
      */
    def DefaultKeepDepthUtilityLayer: UtilityLayerRenderer = js.native
    
    /**
      * A shared utility layer that can be used to overlay objects into a scene (Depth map of the previous scene is cleared before drawing on top of it)
      */
    def DefaultUtilityLayer: UtilityLayerRenderer = js.native
    
    var _DefaultKeepDepthUtilityLayer: js.Any = js.native
    
    var _DefaultUtilityLayer: js.Any = js.native
  }
}
