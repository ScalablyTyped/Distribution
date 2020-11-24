package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SceneLoaderFlags")
@js.native
class SceneLoaderFlags ()
  extends typings.babylonjs.loadingIndexMod.SceneLoaderFlags
/* static members */
@JSImport("babylonjs/index", "SceneLoaderFlags")
@js.native
object SceneLoaderFlags extends js.Object {
  
  /**
    * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
    */
  def CleanBoneMatrixWeights: Boolean = js.native
  def CleanBoneMatrixWeights_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
    */
  def ForceFullSceneLoadingForIncremental: Boolean = js.native
  def ForceFullSceneLoadingForIncremental_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
    */
  def ShowLoadingScreen: Boolean = js.native
  def ShowLoadingScreen_=(value: Boolean): Unit = js.native
  
  var _CleanBoneMatrixWeights: js.Any = js.native
  
  var _ForceFullSceneLoadingForIncremental: js.Any = js.native
  
  var _ShowLoadingScreen: js.Any = js.native
  
  var _loggingLevel: js.Any = js.native
  
  /**
    * Defines the current logging level (while loading the scene)
    * @ignorenaming
    */
  def loggingLevel: Double = js.native
  def loggingLevel_=(value: Double): Unit = js.native
}
