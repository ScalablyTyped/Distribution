package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugLayer extends js.Object {
  
  var BJSINSPECTOR: js.Any = js.native
  
  /** Creates the inspector window. */
  var _createInspector: js.Any = js.native
  
  /** Get the inspector from bundle or global */
  var _getGlobalInspector: js.Any = js.native
  
  var _onPropertyChangedObservable: js.Any = js.native
  
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
    * @param lineContainerTitles defines the specific blocks to highlight (could be a string or an array of strings)
    */
  def select(entity: js.Any): Unit = js.native
  def select(entity: js.Any, lineContainerTitles: String): Unit = js.native
  def select(entity: js.Any, lineContainerTitles: js.Array[String]): Unit = js.native
  
  /**
    * Update the scene in the inspector
    */
  def setAsActiveScene(): Unit = js.native
  
  /**
    * Launch the debugLayer.
    * @param config Define the configuration of the inspector
    * @return a promise fulfilled when the debug layer is visible
    */
  def show(): js.Promise[DebugLayer] = js.native
  def show(config: IInspectorOptions): js.Promise[DebugLayer] = js.native
}
