package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to enable access to IndexedDB
  * @see @https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API
  */
@JSImport("babylonjs", "Database")
@js.native
class Database protected ()
  extends babylonjsLib.BABYLONNs.Database {
  /**
    * Creates a new Database
    * @param urlToScene defines the url to load the scene
    * @param callbackManifestChecked defines the callback to use when manifest is checked
    * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
    */
  def this(urlToScene: java.lang.String, callbackManifestChecked: js.Function1[/* checked */ scala.Boolean, _]) = this()
  def this(urlToScene: java.lang.String, callbackManifestChecked: js.Function1[/* checked */ scala.Boolean, _], disableManifestCheck: scala.Boolean) = this()
}

/* static members */
@JSImport("babylonjs", "Database")
@js.native
object Database extends js.Object {
  /** Gets a boolean indicating if Database storate is enabled */
  var IDBStorageEnabled: scala.Boolean = js.native
  /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
  var IsUASupportingBlobStorage: scala.Boolean = js.native
  var _ParseURL: js.Any = js.native
  var _ReturnFullUrlLocation: js.Any = js.native
}

