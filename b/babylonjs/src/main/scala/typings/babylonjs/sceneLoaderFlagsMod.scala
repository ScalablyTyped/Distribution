package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Loading/sceneLoaderFlags", JSImport.Namespace)
@js.native
object sceneLoaderFlagsMod extends js.Object {
  @js.native
  class SceneLoaderFlags () extends js.Object
  
  /* static members */
  @js.native
  object SceneLoaderFlags extends js.Object {
    var _CleanBoneMatrixWeights: js.Any = js.native
    var _ForceFullSceneLoadingForIncremental: js.Any = js.native
    var _ShowLoadingScreen: js.Any = js.native
    var _loggingLevel: js.Any = js.native
    /**
      * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
      */
    def CleanBoneMatrixWeights(): Boolean = js.native
    def CleanBoneMatrixWeights(value: Boolean): js.Any = js.native
    /**
      * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
      */
    def ForceFullSceneLoadingForIncremental(): Boolean = js.native
    def ForceFullSceneLoadingForIncremental(value: Boolean): js.Any = js.native
    /**
      * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
      */
    def ShowLoadingScreen(): Boolean = js.native
    def ShowLoadingScreen(value: Boolean): js.Any = js.native
    /**
      * Defines the current logging level (while loading the scene)
      * @ignorenaming
      */
    def loggingLevel(): Double = js.native
    def loggingLevel(value: Double): js.Any = js.native
  }
  
}

