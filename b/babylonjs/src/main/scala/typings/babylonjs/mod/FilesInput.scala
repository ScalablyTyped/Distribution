package typings.babylonjs.mod

import typings.babylonjs.loadingSceneLoaderMod.ISceneLoaderProgressEvent
import typings.babylonjs.typesMod.Nullable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FilesInput")
@js.native
open class FilesInput protected ()
  extends typings.babylonjs.legacyLegacyMod.FilesInput {
  /**
    * Creates a new FilesInput
    * @param engine defines the rendering engine
    * @param scene defines the hosting scene
    * @param sceneLoadedCallback callback called when scene (files provided) is loaded
    * @param progressCallback callback called to track progress
    * @param additionalRenderLoopLogicCallback callback called to add user logic to the rendering loop
    * @param textureLoadingCallback callback called when a texture is loading
    * @param startingProcessingFilesCallback callback called when the system is about to process all files
    * @param onReloadCallback callback called when a reload is requested
    * @param errorCallback callback call if an error occurs
    * @param useAppend defines if the file loaded must be appended (true) or have the scene replaced (false, default behavior)
    */
  def this(
    engine: typings.babylonjs.enginesEngineMod.Engine,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    sceneLoadedCallback: Nullable[
        js.Function2[/* sceneFile */ File, /* scene */ typings.babylonjs.sceneMod.Scene, Unit]
      ],
    progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
    additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
    textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
    startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
    onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
    errorCallback: Nullable[
        js.Function3[
          /* sceneFile */ File, 
          /* scene */ Nullable[typings.babylonjs.sceneMod.Scene], 
          /* message */ String, 
          Unit
        ]
      ]
  ) = this()
  def this(
    engine: typings.babylonjs.enginesEngineMod.Engine,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    sceneLoadedCallback: Nullable[
        js.Function2[/* sceneFile */ File, /* scene */ typings.babylonjs.sceneMod.Scene, Unit]
      ],
    progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
    additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
    textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
    startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
    onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
    errorCallback: Nullable[
        js.Function3[
          /* sceneFile */ File, 
          /* scene */ Nullable[typings.babylonjs.sceneMod.Scene], 
          /* message */ String, 
          Unit
        ]
      ],
    useAppend: Boolean
  ) = this()
}
