package typings.azureKustoData

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCloudSettingsMod extends Shortcut {
  
  @JSImport("azure-kusto-data/types/src/cloudSettings", JSImport.Default)
  @js.native
  val default: typings.azureKustoData.typesSrcCloudSettingsMod.CloudSettings = js.native
  
  /**
    * This class holds data for all cloud instances, and returns the specific data instance by parsing the dns suffix from a URL
    */
  @js.native
  trait CloudSettings extends StObject {
    
    var METADATA_ENDPOINT: String = js.native
    
    var cloudCache: StringDictionary[CloudInfo] = js.native
    
    var defaultCloudInfo: CloudInfo = js.native
    
    def deleteFromCache(kustoUri: String): Boolean = js.native
    
    def getCloudInfoForCluster(kustoUri: String): js.Promise[CloudInfo] = js.native
    
    def getFromCache(kustoUri: String): CloudInfo = js.native
    
    /* private */ var normalizeUrl: Any = js.native
    
    def writeToCache(url: String): Unit = js.native
    def writeToCache(url: String, info: CloudInfo): Unit = js.native
  }
  @JSImport("azure-kusto-data/types/src/cloudSettings", "CloudSettings")
  @js.native
  val CloudSettings: typings.azureKustoData.typesSrcCloudSettingsMod.CloudSettings = js.native
  
  trait CloudInfo extends StObject {
    
    var FirstPartyAuthorityUrl: String
    
    var KustoClientAppId: String
    
    var KustoClientRedirectUri: String
    
    var KustoServiceResourceId: String
    
    var LoginEndpoint: String
    
    var LoginMfaRequired: Boolean
  }
  object CloudInfo {
    
    inline def apply(
      FirstPartyAuthorityUrl: String,
      KustoClientAppId: String,
      KustoClientRedirectUri: String,
      KustoServiceResourceId: String,
      LoginEndpoint: String,
      LoginMfaRequired: Boolean
    ): CloudInfo = {
      val __obj = js.Dynamic.literal(FirstPartyAuthorityUrl = FirstPartyAuthorityUrl.asInstanceOf[js.Any], KustoClientAppId = KustoClientAppId.asInstanceOf[js.Any], KustoClientRedirectUri = KustoClientRedirectUri.asInstanceOf[js.Any], KustoServiceResourceId = KustoServiceResourceId.asInstanceOf[js.Any], LoginEndpoint = LoginEndpoint.asInstanceOf[js.Any], LoginMfaRequired = LoginMfaRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudInfo] (val x: Self) extends AnyVal {
      
      inline def setFirstPartyAuthorityUrl(value: String): Self = StObject.set(x, "FirstPartyAuthorityUrl", value.asInstanceOf[js.Any])
      
      inline def setKustoClientAppId(value: String): Self = StObject.set(x, "KustoClientAppId", value.asInstanceOf[js.Any])
      
      inline def setKustoClientRedirectUri(value: String): Self = StObject.set(x, "KustoClientRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setKustoServiceResourceId(value: String): Self = StObject.set(x, "KustoServiceResourceId", value.asInstanceOf[js.Any])
      
      inline def setLoginEndpoint(value: String): Self = StObject.set(x, "LoginEndpoint", value.asInstanceOf[js.Any])
      
      inline def setLoginMfaRequired(value: Boolean): Self = StObject.set(x, "LoginMfaRequired", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = typings.azureKustoData.typesSrcCloudSettingsMod.CloudSettings
  
  /* This means you don't have to write `default`, but can instead just say `typesSrcCloudSettingsMod.foo` */
  override def _to: typings.azureKustoData.typesSrcCloudSettingsMod.CloudSettings = default
}
