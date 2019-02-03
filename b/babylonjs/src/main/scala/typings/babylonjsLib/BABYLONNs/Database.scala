package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to enable access to IndexedDB
  * @see @https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API
  */
@JSGlobal("BABYLON.Database")
@js.native
class Database protected () extends js.Object {
  /**
    * Creates a new Database
    * @param urlToScene defines the url to load the scene
    * @param callbackManifestChecked defines the callback to use when manifest is checked
    * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
    */
  def this(urlToScene: java.lang.String, callbackManifestChecked: js.Function1[/* checked */ scala.Boolean, _]) = this()
  def this(urlToScene: java.lang.String, callbackManifestChecked: js.Function1[/* checked */ scala.Boolean, _], disableManifestCheck: scala.Boolean) = this()
  var _checkManifestFile: js.Any = js.native
  var _checkVersionFromDB: js.Any = js.native
  var _enableSceneOffline: js.Any = js.native
  var _enableTexturesOffline: js.Any = js.native
  var _loadFileFromDBAsync: js.Any = js.native
  var _loadImageFromDBAsync: js.Any = js.native
  var _loadVersionFromDBAsync: js.Any = js.native
  var _saveFileIntoDBAsync: js.Any = js.native
  var _saveImageIntoDBAsync: js.Any = js.native
  var _saveVersionIntoDBAsync: js.Any = js.native
  var callbackManifestChecked: js.Any = js.native
  var currentSceneUrl: js.Any = js.native
  var db: js.Any = js.native
  /**
    * Gets a boolean indicating if scene must be saved in the database
    */
  val enableSceneOffline: scala.Boolean = js.native
  /**
    * Gets a boolean indicating if textures must be saved in the database
    */
  val enableTexturesOffline: scala.Boolean = js.native
  var hasReachedQuota: js.Any = js.native
  var idbFactory: js.Any = js.native
  var isSupported: js.Any = js.native
  var manifestVersionFound: js.Any = js.native
  var mustUpdateRessources: js.Any = js.native
  /**
    * Loads a file from database
    * @param url defines the URL to load from
    * @param sceneLoaded defines a callback to call on success
    * @param progressCallBack defines a callback to call when progress changed
    * @param errorCallback defines a callback to call on error
    * @param useArrayBuffer defines a boolean to use array buffer instead of text string
    */
  def loadFileFromDB(url: java.lang.String, sceneLoaded: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def loadFileFromDB(
    url: java.lang.String,
    sceneLoaded: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallBack: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def loadFileFromDB(
    url: java.lang.String,
    sceneLoaded: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallBack: js.Function1[/* data */ js.Any, scala.Unit],
    errorCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def loadFileFromDB(
    url: java.lang.String,
    sceneLoaded: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallBack: js.Function1[/* data */ js.Any, scala.Unit],
    errorCallback: js.Function0[scala.Unit],
    useArrayBuffer: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Loads an image from the database
    * @param url defines the url to load from
    * @param image defines the target DOM image
    */
  def loadImageFromDB(url: java.lang.String, image: stdLib.HTMLImageElement): scala.Unit = js.native
  /**
    * Open the database and make it available
    * @param successCallback defines the callback to call on success
    * @param errorCallback defines the callback to call on error
    */
  def openAsync(successCallback: js.Function0[scala.Unit], errorCallback: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.Database")
@js.native
object Database extends js.Object {
  /** Gets a boolean indicating if Database storate is enabled */
  var IDBStorageEnabled: scala.Boolean = js.native
  /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
  var IsUASupportingBlobStorage: scala.Boolean = js.native
  var _ParseURL: js.Any = js.native
  var _ReturnFullUrlLocation: js.Any = js.native
}

