package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Offline/index", JSImport.Namespace)
@js.native
object offlineIndexMod extends js.Object {
  
  @js.native
  class Database protected ()
    extends typings.babylonjs.databaseMod.Database {
    /**
      * Creates a new Database
      * @param urlToScene defines the url to load the scene
      * @param callbackManifestChecked defines the callback to use when manifest is checked
      * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
      */
    def this(urlToScene: String, callbackManifestChecked: js.Function1[/* checked */ Boolean, _]) = this()
    def this(
      urlToScene: String,
      callbackManifestChecked: js.Function1[/* checked */ Boolean, _],
      disableManifestCheck: Boolean
    ) = this()
  }
  /* static members */
  @js.native
  object Database extends js.Object {
    
    /**
      * Gets a boolean indicating if Database storate is enabled (off by default)
      */
    var IDBStorageEnabled: Boolean = js.native
    
    /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
    var IsUASupportingBlobStorage: js.Any = js.native
    
    var _ParseURL: js.Any = js.native
    
    var _ReturnFullUrlLocation: js.Any = js.native
    
    /**
      * Validates if xhr data is correct
      * @param xhr defines the request to validate
      * @param dataType defines the expected data type
      * @returns true if data is correct
      */
    var _ValidateXHRData: js.Any = js.native
  }
}
