package typings.babylonjs.legacyMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "FilesInput")
@js.native
class FilesInput protected ()
  extends typings.babylonjs.indexMod.FilesInput {
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
    engine: typings.babylonjs.engineMod.Engine,
    scene: typings.babylonjs.sceneMod.Scene,
    sceneLoadedCallback: js.Function2[/* sceneFile */ File, /* scene */ typings.babylonjs.sceneMod.Scene, Unit],
    progressCallback: js.Function1[/* progress */ typings.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent, Unit],
    additionalRenderLoopLogicCallback: js.Function0[Unit],
    textureLoadingCallback: js.Function1[/* remaining */ Double, Unit],
    startingProcessingFilesCallback: js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit],
    onReloadCallback: js.Function1[/* sceneFile */ File, Unit],
    errorCallback: js.Function3[
        /* sceneFile */ File, 
        /* scene */ typings.babylonjs.sceneMod.Scene, 
        /* message */ String, 
        Unit
      ]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "FilesInput")
@js.native
object FilesInput extends js.Object {
  /**
    * List of files ready to be loaded
    */
  def FilesToLoad(): org.scalablytyped.runtime.StringDictionary[File] = js.native
}

