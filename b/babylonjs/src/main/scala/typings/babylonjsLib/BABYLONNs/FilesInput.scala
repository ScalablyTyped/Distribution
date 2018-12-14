package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to help managing file picking and drag'n'drop
     */
@JSGlobal("BABYLON.FilesInput")
@js.native
class FilesInput protected () extends js.Object {
  /**
           * Creates a new FilesInput
           * @param engine defines the rendering engine
           * @param scene defines the hosting scene
           * @param sceneLoadedCallback callback called when scene is loaded
           * @param progressCallback callback called to track progress
           * @param additionalRenderLoopLogicCallback callback called to add user logic to the rendering loop
           * @param textureLoadingCallback callback called when a texture is loading
           * @param startingProcessingFilesCallback callback called when the system is about to process all files
           * @param onReloadCallback callback called when a reload is requested
           * @param errorCallback callback call if an error occurs
           */
  def this(engine: Engine, scene: Scene, sceneLoadedCallback: js.Function2[/* sceneFile */ stdLib.File, /* scene */ Scene, scala.Unit], progressCallback: js.Function1[/* progress */ SceneLoaderProgressEvent, scala.Unit], additionalRenderLoopLogicCallback: js.Function0[scala.Unit], textureLoadingCallback: js.Function1[/* remaining */ scala.Double, scala.Unit], startingProcessingFilesCallback: js.Function1[/* files */ js.UndefOr[js.Array[stdLib.File]], scala.Unit], onReloadCallback: js.Function1[/* sceneFile */ stdLib.File, scala.Unit], errorCallback: js.Function3[
      /* sceneFile */ stdLib.File, 
      /* scene */ Scene, 
      /* message */ java.lang.String, 
      scala.Unit
    ]) = this()
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
  var drag: js.Any = js.native
  var drop: js.Any = js.native
  var renderFunction: js.Any = js.native
  /**
           * Release all associated resources
           */
  def dispose(): scala.Unit = js.native
  /**
           * Load files from a drop event
           * @param event defines the drop event to use as source
           */
  def loadFiles(event: js.Any): scala.Unit = js.native
  /**
           * Calls this function to listen to drag'n'drop events on a specific DOM element
           * @param elementToMonitor defines the DOM element to track
           */
  def monitorElementForDragNDrop(elementToMonitor: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Callback called when a file is processed
           */
  def onProcessFileCallback(file: stdLib.File, name: java.lang.String, extension: java.lang.String): babylonjsLib.babylonjsLibNumbers.`true` = js.native
  /**
           * Reload the current scene from the loaded files
           */
  def reload(): scala.Unit = js.native
}

/**
     * Class used to help managing file picking and drag'n'drop
     */
@JSGlobal("BABYLON.FilesInput")
@js.native
object FilesInput extends js.Object {
  /**
           * List of files ready to be loaded
           */
  var FilesToLoad: org.scalablytyped.runtime.StringDictionary[stdLib.File] = js.native
}

