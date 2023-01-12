package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourcesParameters extends StObject {
  
  var dropboxAppKey: js.UndefOr[String] = js.undefined
  
  var facebookAppId: js.UndefOr[String] = js.undefined
  
  var googleApiKey: js.UndefOr[String] = js.undefined
  
  var googleDriveClientId: js.UndefOr[String] = js.undefined
  
  var instagramClientId: js.UndefOr[String] = js.undefined
  
  var searchByRights: js.UndefOr[Boolean] = js.undefined
  
  var searchBySites: js.UndefOr[js.Array[String]] = js.undefined
}
object SourcesParameters {
  
  inline def apply(): SourcesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourcesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourcesParameters] (val x: Self) extends AnyVal {
    
    inline def setDropboxAppKey(value: String): Self = StObject.set(x, "dropboxAppKey", value.asInstanceOf[js.Any])
    
    inline def setDropboxAppKeyUndefined: Self = StObject.set(x, "dropboxAppKey", js.undefined)
    
    inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
    
    inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
    
    inline def setGoogleApiKey(value: String): Self = StObject.set(x, "googleApiKey", value.asInstanceOf[js.Any])
    
    inline def setGoogleApiKeyUndefined: Self = StObject.set(x, "googleApiKey", js.undefined)
    
    inline def setGoogleDriveClientId(value: String): Self = StObject.set(x, "googleDriveClientId", value.asInstanceOf[js.Any])
    
    inline def setGoogleDriveClientIdUndefined: Self = StObject.set(x, "googleDriveClientId", js.undefined)
    
    inline def setInstagramClientId(value: String): Self = StObject.set(x, "instagramClientId", value.asInstanceOf[js.Any])
    
    inline def setInstagramClientIdUndefined: Self = StObject.set(x, "instagramClientId", js.undefined)
    
    inline def setSearchByRights(value: Boolean): Self = StObject.set(x, "searchByRights", value.asInstanceOf[js.Any])
    
    inline def setSearchByRightsUndefined: Self = StObject.set(x, "searchByRights", js.undefined)
    
    inline def setSearchBySites(value: js.Array[String]): Self = StObject.set(x, "searchBySites", value.asInstanceOf[js.Any])
    
    inline def setSearchBySitesUndefined: Self = StObject.set(x, "searchBySites", js.undefined)
    
    inline def setSearchBySitesVarargs(value: String*): Self = StObject.set(x, "searchBySites", js.Array(value*))
  }
}
