package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilityLayerRenderer extends IDisposable {
  var _afterRenderObserver: js.Any = js.native
  var _lastPointerEvents: js.Any = js.native
  var _notifyObservers: js.Any = js.native
  var _originalPointerObserver: js.Any = js.native
  var _pointerCaptures: js.Any = js.native
  var _renderCamera: js.Any = js.native
  var _sceneDisposeObserver: js.Any = js.native
  var _sharedGizmoLight: js.Any = js.native
  var _updateCamera: js.Any = js.native
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
    *  If the utility layer should automatically be rendered on top of existing scene
    */
  var shouldRender: Boolean = js.native
  /**
    * The scene that is rendered on top of the original scene
    */
  var utilityLayerScene: Scene = js.native
  /**
    * @hidden
    * Light which used by gizmos to get light shading
    */
  def _getSharedGizmoLight(): HemisphericLight = js.native
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
    * Renders the utility layers scene on top of the original scene
    */
  def render(): Unit = js.native
  /**
    * Sets the camera that should be used when rendering the utility layer (If set to null the last active camera will be used)
    * @param cam the camera that should be used when rendering the utility layer
    */
  def setRenderCamera(cam: Nullable[Camera]): Unit = js.native
}

