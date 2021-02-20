package typings.babylonjs.BABYLON

import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesInput extends StObject {
  
  var _additionalRenderLoopLogicCallback: js.Any = js.native
  
  var _currentScene: js.Any = js.native
  
  var _dragEnterHandler: js.Any = js.native
  
  var _dragOverHandler: js.Any = js.native
  
  var _dropHandler: js.Any = js.native
  
  var _elementToMonitor: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _errorCallback: js.Any = js.native
  
  var _filesToLoad: js.Any = js.native
  
  var _onReloadCallback: js.Any = js.native
  
  var _processFiles: js.Any = js.native
  
  var _processReload: js.Any = js.native
  
  var _progressCallback: js.Any = js.native
  
  var _sceneFileToLoad: js.Any = js.native
  
  var _sceneLoadedCallback: js.Any = js.native
  
  var _startingProcessingFilesCallback: js.Any = js.native
  
  var _textureLoadingCallback: js.Any = js.native
  
  var _traverseFolder: js.Any = js.native
  
  /**
    * Release all associated resources
    */
  def dispose(): Unit = js.native
  
  var drag: js.Any = js.native
  
  var drop: js.Any = js.native
  
  /** Gets the current list of files to load */
  def filesToLoad: js.Array[File] = js.native
  
  /**
    * Load files from a drop event
    * @param event defines the drop event to use as source
    */
  def loadFiles(event: js.Any): Unit = js.native
  
  /**
    * Calls this function to listen to drag'n'drop events on a specific DOM element
    * @param elementToMonitor defines the DOM element to track
    */
  def monitorElementForDragNDrop(elementToMonitor: HTMLElement): Unit = js.native
  
  /**
    * Callback called when a file is processed
    */
  def onProcessFileCallback(file: File, name: String, extension: String): Boolean = js.native
  
  /**
    * Reload the current scene from the loaded files
    */
  def reload(): Unit = js.native
  
  var renderFunction: js.Any = js.native
}
