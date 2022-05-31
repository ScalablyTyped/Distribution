package typings.babylonjs

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.sceneLoaderMod.ISceneLoaderProgressEvent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesInputMod {
  
  @JSImport("babylonjs/Misc/filesInput", "FilesInput")
  @js.native
  class FilesInput protected () extends StObject {
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
      engine: Engine,
      scene: Nullable[Scene],
      sceneLoadedCallback: Nullable[js.Function2[/* sceneFile */ File, /* scene */ Scene, Unit]],
      progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
      additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
      textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
      startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
      onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
      errorCallback: Nullable[
            js.Function3[/* sceneFile */ File, /* scene */ Nullable[Scene], /* message */ String, Unit]
          ]
    ) = this()
    
    /* private */ var _additionalRenderLoopLogicCallback: js.Any = js.native
    
    /* private */ var _currentScene: js.Any = js.native
    
    /* private */ var _dragEnterHandler: js.Any = js.native
    
    /* private */ var _dragOverHandler: js.Any = js.native
    
    /* private */ var _dropHandler: js.Any = js.native
    
    /* private */ var _elementToMonitor: js.Any = js.native
    
    /* private */ var _engine: js.Any = js.native
    
    /* private */ var _errorCallback: js.Any = js.native
    
    /* private */ var _filesToLoad: js.Any = js.native
    
    /* private */ var _onReloadCallback: js.Any = js.native
    
    /* private */ var _processFiles: js.Any = js.native
    
    /* private */ var _processReload: js.Any = js.native
    
    /* private */ var _progressCallback: js.Any = js.native
    
    /* private */ var _sceneFileToLoad: js.Any = js.native
    
    /* private */ var _sceneLoadedCallback: js.Any = js.native
    
    /* private */ var _startingProcessingFilesCallback: js.Any = js.native
    
    /* private */ var _textureLoadingCallback: js.Any = js.native
    
    /* private */ var _traverseFolder: js.Any = js.native
    
    /**
      * Release all associated resources
      */
    def dispose(): Unit = js.native
    
    /* private */ var drag: js.Any = js.native
    
    /* private */ var drop: js.Any = js.native
    
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
    def onProcessFileCallback(file: File, name: String, `extension`: String): Boolean = js.native
    
    /**
      * Reload the current scene from the loaded files
      */
    def reload(): Unit = js.native
    
    /* private */ var renderFunction: js.Any = js.native
  }
}
