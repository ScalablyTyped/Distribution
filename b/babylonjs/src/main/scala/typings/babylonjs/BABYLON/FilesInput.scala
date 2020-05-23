package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsBooleans.`true`
import typings.std.File
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesInput extends js.Object {
  var _additionalRenderLoopLogicCallback: js.Any
  var _currentScene: js.Any
  var _dragEnterHandler: js.Any
  var _dragOverHandler: js.Any
  var _dropHandler: js.Any
  var _elementToMonitor: js.Any
  var _engine: js.Any
  var _errorCallback: js.Any
  var _filesToLoad: js.Any
  var _onReloadCallback: js.Any
  var _processFiles: js.Any
  var _processReload: js.Any
  var _progressCallback: js.Any
  var _sceneFileToLoad: js.Any
  var _sceneLoadedCallback: js.Any
  var _startingProcessingFilesCallback: js.Any
  var _textureLoadingCallback: js.Any
  var _traverseFolder: js.Any
  var drag: js.Any
  var drop: js.Any
  var renderFunction: js.Any
  /**
    * Release all associated resources
    */
  def dispose(): Unit
  /**
    * Load files from a drop event
    * @param event defines the drop event to use as source
    */
  def loadFiles(event: js.Any): Unit
  /**
    * Calls this function to listen to drag'n'drop events on a specific DOM element
    * @param elementToMonitor defines the DOM element to track
    */
  def monitorElementForDragNDrop(elementToMonitor: HTMLElement): Unit
  /**
    * Callback called when a file is processed
    */
  def onProcessFileCallback(file: File, name: String, extension: String): `true`
  /**
    * Reload the current scene from the loaded files
    */
  def reload(): Unit
}

object FilesInput {
  @scala.inline
  def apply(
    _additionalRenderLoopLogicCallback: js.Any,
    _currentScene: js.Any,
    _dragEnterHandler: js.Any,
    _dragOverHandler: js.Any,
    _dropHandler: js.Any,
    _elementToMonitor: js.Any,
    _engine: js.Any,
    _errorCallback: js.Any,
    _filesToLoad: js.Any,
    _onReloadCallback: js.Any,
    _processFiles: js.Any,
    _processReload: js.Any,
    _progressCallback: js.Any,
    _sceneFileToLoad: js.Any,
    _sceneLoadedCallback: js.Any,
    _startingProcessingFilesCallback: js.Any,
    _textureLoadingCallback: js.Any,
    _traverseFolder: js.Any,
    dispose: () => Unit,
    drag: js.Any,
    drop: js.Any,
    loadFiles: js.Any => Unit,
    monitorElementForDragNDrop: HTMLElement => Unit,
    onProcessFileCallback: (File, String, String) => `true`,
    reload: () => Unit,
    renderFunction: js.Any
  ): FilesInput = {
    val __obj = js.Dynamic.literal(_additionalRenderLoopLogicCallback = _additionalRenderLoopLogicCallback.asInstanceOf[js.Any], _currentScene = _currentScene.asInstanceOf[js.Any], _dragEnterHandler = _dragEnterHandler.asInstanceOf[js.Any], _dragOverHandler = _dragOverHandler.asInstanceOf[js.Any], _dropHandler = _dropHandler.asInstanceOf[js.Any], _elementToMonitor = _elementToMonitor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _errorCallback = _errorCallback.asInstanceOf[js.Any], _filesToLoad = _filesToLoad.asInstanceOf[js.Any], _onReloadCallback = _onReloadCallback.asInstanceOf[js.Any], _processFiles = _processFiles.asInstanceOf[js.Any], _processReload = _processReload.asInstanceOf[js.Any], _progressCallback = _progressCallback.asInstanceOf[js.Any], _sceneFileToLoad = _sceneFileToLoad.asInstanceOf[js.Any], _sceneLoadedCallback = _sceneLoadedCallback.asInstanceOf[js.Any], _startingProcessingFilesCallback = _startingProcessingFilesCallback.asInstanceOf[js.Any], _textureLoadingCallback = _textureLoadingCallback.asInstanceOf[js.Any], _traverseFolder = _traverseFolder.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], loadFiles = js.Any.fromFunction1(loadFiles), monitorElementForDragNDrop = js.Any.fromFunction1(monitorElementForDragNDrop), onProcessFileCallback = js.Any.fromFunction3(onProcessFileCallback), reload = js.Any.fromFunction0(reload), renderFunction = renderFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesInput]
  }
}

