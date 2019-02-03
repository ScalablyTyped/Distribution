package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The debug layer (aka Inspector) is the go to tool in order to better understand
  * what is happening in your scene
  * @see http://doc.babylonjs.com/features/playground_debuglayer
  */
@JSGlobal("BABYLON.DebugLayer")
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
  var _inspector: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * Observable triggered when a property is changed through the inspector.
    */
  var onPropertyChangedObservable: Observable[babylonjsLib.Anon_InitialValue] = js.native
  /**
    * Gets the active tab
    * @return the index of the active tab or -1 if the inspector is hidden
    */
  def getActiveTab(): scala.Double = js.native
  /**
    * Hide the inspector and close its window.
    */
  def hide(): scala.Unit = js.native
  /**
    * Get if the inspector is visible or not.
    * @returns true if visible otherwise, false
    */
  def isVisible(): scala.Boolean = js.native
  /**
    *
    * Launch the debugLayer.
    *
    * initialTab:
    * | Value | Tab Name |
    * | --- | --- |
    * | 0 | Scene |
    * | 1 | Console |
    * | 2 | Stats |
    * | 3 | Textures |
    * | 4 | Mesh |
    * | 5 | Light |
    * | 6 | Material |
    * | 7 | GLTF |
    * | 8 | GUI |
    * | 9 | Physics |
    * | 10 | Camera |
    * | 11 | Audio |
    *
    * @param config Define the configuration of the inspector
    */
  def show(): scala.Unit = js.native
  def show(config: babylonjsLib.Anon_InitialTab): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.DebugLayer")
@js.native
object DebugLayer extends js.Object {
  /**
    * Define the url to get the inspector script from.
    * By default it uses the babylonjs CDN.
    * @ignoreNaming
    */
  var InspectorURL: java.lang.String = js.native
}

