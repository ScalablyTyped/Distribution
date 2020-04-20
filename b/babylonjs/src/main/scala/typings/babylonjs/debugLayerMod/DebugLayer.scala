package typings.babylonjs.debugLayerMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Debug/debugLayer", "DebugLayer")
@js.native
class DebugLayer protected () extends js.Object {
  /**
    * Instantiates a new debug layer.
    * The debug layer (aka Inspector) is the go to tool in order to better understand
    * what is happening in your scene
    * @see http://doc.babylonjs.com/features/playground_debuglayer
    * @param scene Defines the scene to inspect
    */
  def this(scene: Scene) = this()
  var BJSINSPECTOR: js.Any = js.native
  /** Creates the inspector window. */
  var _createInspector: js.Any = js.native
  /** Get the inspector from bundle or global */
  var _getGlobalInspector: js.Any = js.native
  var _onPropertyChangedObservable: js.UndefOr[js.Any] = js.native
  var _scene: js.Any = js.native
  /**
    * Hide the inspector and close its window.
    */
  def hide(): Unit = js.native
  /**
    * Get if the inspector is visible or not.
    * @returns true if visible otherwise, false
    */
  def isVisible(): Boolean = js.native
  /**
    * Observable triggered when a property is changed through the inspector.
    */
  def onPropertyChangedObservable: js.Any = js.native
  /**
    * Select a specific entity in the scene explorer and highlight a specific block in that entity property grid
    * @param entity defines the entity to select
    * @param lineContainerTitle defines the specific block to highlight
    */
  def select(entity: js.Any): Unit = js.native
  def select(entity: js.Any, lineContainerTitle: String): Unit = js.native
  /**
    * Launch the debugLayer.
    * @param config Define the configuration of the inspector
    * @return a promise fulfilled when the debug layer is visible
    */
  def show(): js.Promise[DebugLayer] = js.native
  def show(config: IInspectorOptions): js.Promise[DebugLayer] = js.native
}

/* static members */
@JSImport("babylonjs/Debug/debugLayer", "DebugLayer")
@js.native
object DebugLayer extends js.Object {
  /**
    * Define the url to get the inspector script from.
    * By default it uses the babylonjs CDN.
    * @ignoreNaming
    */
  var InspectorURL: String = js.native
}

