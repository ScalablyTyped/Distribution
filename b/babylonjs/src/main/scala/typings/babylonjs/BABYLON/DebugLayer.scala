package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugLayer extends StObject {
  
  /* private */ var BJSINSPECTOR: Any = js.native
  
  /**
    * Creates the inspector window.
    * @param config
    */
  /* private */ var _createInspector: Any = js.native
  
  /** Get the inspector from bundle or global */
  /* private */ var _getGlobalInspector: Any = js.native
  
  /* private */ var _onPropertyChangedObservable: Any = js.native
  
  /* private */ var _onSelectionChangedObservable: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
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
  def onPropertyChangedObservable: Any = js.native
  
  /**
    * Observable triggered when the selection is changed through the inspector.
    */
  def onSelectionChangedObservable: Any = js.native
  
  /**
    * Select a specific entity in the scene explorer and highlight a specific block in that entity property grid
    * @param entity defines the entity to select
    * @param lineContainerTitles defines the specific blocks to highlight (could be a string or an array of strings)
    */
  def select(entity: Any): Unit = js.native
  def select(entity: Any, lineContainerTitles: String): Unit = js.native
  def select(entity: Any, lineContainerTitles: js.Array[String]): Unit = js.native
  
  /**
    * Update the scene in the inspector
    */
  def setAsActiveScene(): Unit = js.native
  
  /**
    * Launch the debugLayer.
    * @param config Define the configuration of the inspector
    * @returns a promise fulfilled when the debug layer is visible
    */
  def show(): js.Promise[DebugLayer] = js.native
  def show(config: IInspectorOptions): js.Promise[DebugLayer] = js.native
}
