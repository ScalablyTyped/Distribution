package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database
  extends StObject
     with IOfflineProvider {
  
  /* private */ var _callbackManifestChecked: js.Any = js.native
  
  /* private */ var _checkManifestFile: js.Any = js.native
  
  /* private */ var _checkVersionFromDB: js.Any = js.native
  
  /* private */ var _currentSceneUrl: js.Any = js.native
  
  /* private */ var _db: js.Any = js.native
  
  /* private */ var _enableSceneOffline: js.Any = js.native
  
  /* private */ var _enableTexturesOffline: js.Any = js.native
  
  /* private */ var _hasReachedQuota: js.Any = js.native
  
  /* private */ var _idbFactory: js.Any = js.native
  
  /* private */ var _isSupported: js.Any = js.native
  
  /* private */ var _loadFileAsync: js.Any = js.native
  
  /* private */ var _loadImageFromDBAsync: js.Any = js.native
  
  /* private */ var _loadVersionFromDBAsync: js.Any = js.native
  
  /* private */ var _manifestVersionFound: js.Any = js.native
  
  /* private */ var _mustUpdateRessources: js.Any = js.native
  
  /* private */ var _saveFileAsync: js.Any = js.native
  
  /* private */ var _saveImageIntoDBAsync: js.Any = js.native
  
  /* private */ var _saveVersionIntoDBAsync: js.Any = js.native
  
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
