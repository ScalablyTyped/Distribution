package typings.babylonjs.global.BABYLON

import typings.babylonjs.babylonjsBooleans.`true`
import typings.std.File
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FilesInput")
@js.native
class FilesInput protected ()
  extends typings.babylonjs.BABYLON.FilesInput {
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
  def this(
    engine: typings.babylonjs.BABYLON.Engine,
    scene: typings.babylonjs.BABYLON.Scene,
    sceneLoadedCallback: js.Function2[/* sceneFile */ File, /* scene */ typings.babylonjs.BABYLON.Scene, Unit],
    progressCallback: js.Function1[/* progress */ typings.babylonjs.BABYLON.SceneLoaderProgressEvent, Unit],
    additionalRenderLoopLogicCallback: js.Function0[Unit],
    textureLoadingCallback: js.Function1[/* remaining */ Double, Unit],
    startingProcessingFilesCallback: js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit],
    onReloadCallback: js.Function1[/* sceneFile */ File, Unit],
    errorCallback: js.Function3[
        /* sceneFile */ File, 
        /* scene */ typings.babylonjs.BABYLON.Scene, 
        /* message */ String, 
        Unit
      ]
  ) = this()
  /* CompleteClass */
  override var _additionalRenderLoopLogicCallback: js.Any = js.native
  /* CompleteClass */
  override var _currentScene: js.Any = js.native
  /* CompleteClass */
  override var _dragEnterHandler: js.Any = js.native
  /* CompleteClass */
  override var _dragOverHandler: js.Any = js.native
  /* CompleteClass */
  override var _dropHandler: js.Any = js.native
  /* CompleteClass */
  override var _elementToMonitor: js.Any = js.native
  /* CompleteClass */
  override var _engine: js.Any = js.native
  /* CompleteClass */
  override var _errorCallback: js.Any = js.native
  /* CompleteClass */
  override var _filesToLoad: js.Any = js.native
  /* CompleteClass */
  override var _onReloadCallback: js.Any = js.native
  /* CompleteClass */
  override var _processFiles: js.Any = js.native
  /* CompleteClass */
  override var _processReload: js.Any = js.native
  /* CompleteClass */
  override var _progressCallback: js.Any = js.native
  /* CompleteClass */
  override var _sceneFileToLoad: js.Any = js.native
  /* CompleteClass */
  override var _sceneLoadedCallback: js.Any = js.native
  /* CompleteClass */
  override var _startingProcessingFilesCallback: js.Any = js.native
  /* CompleteClass */
  override var _textureLoadingCallback: js.Any = js.native
  /* CompleteClass */
  override var _traverseFolder: js.Any = js.native
  /* CompleteClass */
  override var drag: js.Any = js.native
  /* CompleteClass */
  override var drop: js.Any = js.native
  /* CompleteClass */
  override var renderFunction: js.Any = js.native
  /**
    * Release all associated resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Load files from a drop event
    * @param event defines the drop event to use as source
    */
  /* CompleteClass */
  override def loadFiles(event: js.Any): Unit = js.native
  /**
    * Calls this function to listen to drag'n'drop events on a specific DOM element
    * @param elementToMonitor defines the DOM element to track
    */
  /* CompleteClass */
  override def monitorElementForDragNDrop(elementToMonitor: HTMLElement): Unit = js.native
  /**
    * Callback called when a file is processed
    */
  /* CompleteClass */
  override def onProcessFileCallback(file: File, name: String, extension: String): `true` = js.native
  /**
    * Reload the current scene from the loaded files
    */
  /* CompleteClass */
  override def reload(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.FilesInput")
@js.native
object FilesInput extends js.Object {
  /**
    * List of files ready to be loaded
    */
  def FilesToLoad: org.scalablytyped.runtime.StringDictionary[File] = js.native
}

