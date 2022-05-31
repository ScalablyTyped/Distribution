package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISceneLoaderProgressEvent
import typings.babylonjs.BABYLON.Nullable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FilesInput")
@js.native
class FilesInput protected ()
  extends StObject
     with typings.babylonjs.BABYLON.FilesInput {
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
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    sceneLoadedCallback: Nullable[
        js.Function2[/* sceneFile */ File, /* scene */ typings.babylonjs.BABYLON.Scene, Unit]
      ],
    progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
    additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
    textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
    startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
    onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
    errorCallback: Nullable[
        js.Function3[
          /* sceneFile */ File, 
          /* scene */ Nullable[typings.babylonjs.BABYLON.Scene], 
          /* message */ String, 
          Unit
        ]
      ]
  ) = this()
}
