package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to help managing file picking and drag'n'drop
  */
@JSImport("babylonjs", "FilesInput")
@js.native
class FilesInput protected ()
  extends babylonjsLib.BABYLONNs.FilesInput {
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
  def this(engine: babylonjsLib.BABYLONNs.Engine, scene: babylonjsLib.BABYLONNs.Scene, sceneLoadedCallback: js.Function2[/* sceneFile */ stdLib.File, /* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit], progressCallback: js.Function1[/* progress */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit], additionalRenderLoopLogicCallback: js.Function0[scala.Unit], textureLoadingCallback: js.Function1[/* remaining */ scala.Double, scala.Unit], startingProcessingFilesCallback: js.Function1[/* files */ js.UndefOr[js.Array[stdLib.File]], scala.Unit], onReloadCallback: js.Function1[/* sceneFile */ stdLib.File, scala.Unit], errorCallback: js.Function3[
      /* sceneFile */ stdLib.File, 
      /* scene */ babylonjsLib.BABYLONNs.Scene, 
      /* message */ java.lang.String, 
      scala.Unit
    ]) = this()
}

/* static members */
@JSImport("babylonjs", "FilesInput")
@js.native
object FilesInput extends js.Object {
  /**
    * List of files ready to be loaded
    */
  var FilesToLoad: org.scalablytyped.runtime.StringDictionary[stdLib.File] = js.native
}

