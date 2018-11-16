package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Renders a layer on top of an existing scene
     */
@JSGlobal("BABYLON.UtilityLayerRenderer")
@js.native
class UtilityLayerRenderer protected () extends IDisposable {
  /**
           * Instantiates a UtilityLayerRenderer
           * @param originalScene the original scene that will be rendered on top of
           */
  def this(/** the original scene that will be rendered on top of */
  originalScene: Scene) = this()
  var _afterRenderObserver: js.Any = js.native
  var _lastPointerEvents: js.Any = js.native
  var _notifyObservers: js.Any = js.native
  var _originalPointerObserver: js.Any = js.native
  var _pointerCaptures: js.Any = js.native
  var _sceneDisposeObserver: js.Any = js.native
  var _updateCamera: js.Any = js.native
  /**
           * Observable raised when the pointer move from the utility layer scene to the main scene
           */
  var onPointerOutObservable: Observable[scala.Double] = js.native
  /**
           * If set to true, only pointer down onPointerObservable events will be blocked when picking is occluded by original scene
           */
  var onlyCheckPointerDownEvents: scala.Boolean = js.native
  /** the original scene that will be rendered on top of */
  var originalScene: Scene = js.native
  /**
           * If set to false, only pointerUp, pointerDown and pointerMove will be sent to the utilityLayerScene (false by default)
           */
  var processAllEvents: scala.Boolean = js.native
  /**
           *  If the utility layer should automatically be rendered on top of existing scene
          */
  var shouldRender: scala.Boolean = js.native
  /**
           * The scene that is rendered on top of the original scene
           */
  var utilityLayerScene: Scene = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /** Gets or sets a predicate that will be used to indicate utility meshes present in the main scene */
  def mainSceneTrackerPredicate(mesh: Nullable[AbstractMesh]): scala.Boolean = js.native
  /**
           * Renders the utility layers scene on top of the original scene
           */
  def render(): scala.Unit = js.native
}

/**
     * Renders a layer on top of an existing scene
     */
@JSGlobal("BABYLON.UtilityLayerRenderer")
@js.native
object UtilityLayerRenderer extends js.Object {
  /**
           * A shared utility layer that can be used to embed objects into a scene (Depth map of the previous scene is not cleared before drawing on top of it)
           */
  val DefaultKeepDepthUtilityLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer = js.native
  /**
           * A shared utility layer that can be used to overlay objects into a scene (Depth map of the previous scene is cleared before drawing on top of it)
           */
  val DefaultUtilityLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer = js.native
  var _DefaultKeepDepthUtilityLayer: js.Any = js.native
  var _DefaultUtilityLayer: js.Any = js.native
}

