package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends IOfflineProvider {
  var _callbackManifestChecked: js.Any = js.native
  var _checkManifestFile: js.Any = js.native
  var _checkVersionFromDB: js.Any = js.native
  var _currentSceneUrl: js.Any = js.native
  var _db: js.Any = js.native
  var _enableSceneOffline: js.Any = js.native
  var _enableTexturesOffline: js.Any = js.native
  var _hasReachedQuota: js.Any = js.native
  var _idbFactory: js.Any = js.native
  var _isSupported: js.Any = js.native
  var _loadFileAsync: js.Any = js.native
  var _loadImageFromDBAsync: js.Any = js.native
  var _loadVersionFromDBAsync: js.Any = js.native
  var _manifestVersionFound: js.Any = js.native
  var _mustUpdateRessources: js.Any = js.native
  var _saveFileAsync: js.Any = js.native
  var _saveImageIntoDBAsync: js.Any = js.native
  var _saveVersionIntoDBAsync: js.Any = js.native
  /**
    * Gets a boolean indicating if scene must be saved in the database
    */
  @JSName("enableSceneOffline")
  def enableSceneOffline_MDatabase: Boolean = js.native
  /**
    * Gets a boolean indicating if textures must be saved in the database
    */
  @JSName("enableTexturesOffline")
  def enableTexturesOffline_MDatabase: Boolean = js.native
}

