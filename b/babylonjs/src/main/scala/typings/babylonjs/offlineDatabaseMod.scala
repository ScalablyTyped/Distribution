package typings.babylonjs

import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offlineDatabaseMod {
  
  @JSImport("babylonjs/Offline/database", "Database")
  @js.native
  open class Database protected ()
    extends StObject
       with IOfflineProvider {
    /**
      * Creates a new Database
      * @param urlToScene defines the url to load the scene
      * @param callbackManifestChecked defines the callback to use when manifest is checked
      * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
      */
    def this(urlToScene: String, callbackManifestChecked: js.Function1[/* checked */ Boolean, Any]) = this()
    def this(
      urlToScene: String,
      callbackManifestChecked: js.Function1[/* checked */ Boolean, Any],
      disableManifestCheck: Boolean
    ) = this()
    
    /* private */ var _checkManifestFile: Any = js.native
    
    /* private */ var _checkVersionFromDB: Any = js.native
    
    /* private */ var _currentSceneUrl: Any = js.native
    
    /* private */ var _db: Any = js.native
    
    /* private */ var _enableSceneOffline: Any = js.native
    
    /* private */ var _enableTexturesOffline: Any = js.native
    
    /* private */ var _hasReachedQuota: Any = js.native
    
    /* private */ var _idbFactory: Any = js.native
    
    /* private */ var _isSupported: Any = js.native
    
    /* private */ var _loadFileAsync: Any = js.native
    
    /* private */ var _loadImageFromDBAsync: Any = js.native
    
    /* private */ var _loadVersionFromDBAsync: Any = js.native
    
    /* private */ var _manifestVersionFound: Any = js.native
    
    /* private */ var _mustUpdateRessources: Any = js.native
    
    /* private */ var _saveFileAsync: Any = js.native
    
    /* private */ var _saveImageIntoDBAsync: Any = js.native
    
    /* private */ var _saveVersionIntoDBAsync: Any = js.native
    
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
  /* static members */
  object Database {
    
    @JSImport("babylonjs/Offline/database", "Database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a boolean indicating if Database storage is enabled (off by default)
      */
    @JSImport("babylonjs/Offline/database", "Database.IDBStorageEnabled")
    @js.native
    def IDBStorageEnabled: Boolean = js.native
    inline def IDBStorageEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDBStorageEnabled")(x.asInstanceOf[js.Any])
    
    /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
    @JSImport("babylonjs/Offline/database", "Database._IsUASupportingBlobStorage")
    @js.native
    def _IsUASupportingBlobStorage: Any = js.native
    inline def _IsUASupportingBlobStorage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsUASupportingBlobStorage")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Offline/database", "Database._ParseURL")
    @js.native
    def _ParseURL: Any = js.native
    inline def _ParseURL_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ParseURL")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Offline/database", "Database._ReturnFullUrlLocation")
    @js.native
    def _ReturnFullUrlLocation: Any = js.native
    inline def _ReturnFullUrlLocation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ReturnFullUrlLocation")(x.asInstanceOf[js.Any])
    
    /**
      * Validates if xhr data is correct
      * @param xhr defines the request to validate
      * @param dataType defines the expected data type
      * @returns true if data is correct
      */
    @JSImport("babylonjs/Offline/database", "Database._ValidateXHRData")
    @js.native
    def _ValidateXHRData: Any = js.native
    inline def _ValidateXHRData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ValidateXHRData")(x.asInstanceOf[js.Any])
  }
}
