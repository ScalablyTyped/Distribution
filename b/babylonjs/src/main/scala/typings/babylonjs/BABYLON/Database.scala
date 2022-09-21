package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database
  extends StObject
     with IOfflineProvider {
  
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
