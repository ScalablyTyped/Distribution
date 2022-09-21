package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDataHolderBrandServiceEndpoint
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Base URI for the Data Holder extension endpoints to the Consumer Data Standard (optional)
    */
  var extensionBaseUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Base URI for the Data Holder's Consumer Data Standard information security endpoints
    */
  var infosecBaseUri: String
  
  /**
    * Base URI for the Data Holder's Consumer Data Standard public endpoints
    */
  var publicBaseUri: String
  
  /**
    * Base URI for the Data Holder's Consumer Data Standard resource endpoints
    */
  var resourceBaseUri: String
  
  /**
    * The major version of the high level standards. This is not the version of the endpoint or the payload being requested but the version of the overall standards being applied. This version number will be "v" followed by the major version of the standards as a positive integer (e.g. v1, v12 or v76)
    */
  var version: String
  
  /**
    * Publicly available website or web resource URI
    */
  var websiteUri: String
}
object RegisterDataHolderBrandServiceEndpoint {
  
  inline def apply(
    infosecBaseUri: String,
    publicBaseUri: String,
    resourceBaseUri: String,
    version: String,
    websiteUri: String
  ): RegisterDataHolderBrandServiceEndpoint = {
    val __obj = js.Dynamic.literal(infosecBaseUri = infosecBaseUri.asInstanceOf[js.Any], publicBaseUri = publicBaseUri.asInstanceOf[js.Any], resourceBaseUri = resourceBaseUri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], websiteUri = websiteUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDataHolderBrandServiceEndpoint]
  }
  
  extension [Self <: RegisterDataHolderBrandServiceEndpoint](x: Self) {
    
    inline def setExtensionBaseUri(value: String): Self = StObject.set(x, "extensionBaseUri", value.asInstanceOf[js.Any])
    
    inline def setExtensionBaseUriNull: Self = StObject.set(x, "extensionBaseUri", null)
    
    inline def setExtensionBaseUriUndefined: Self = StObject.set(x, "extensionBaseUri", js.undefined)
    
    inline def setInfosecBaseUri(value: String): Self = StObject.set(x, "infosecBaseUri", value.asInstanceOf[js.Any])
    
    inline def setPublicBaseUri(value: String): Self = StObject.set(x, "publicBaseUri", value.asInstanceOf[js.Any])
    
    inline def setResourceBaseUri(value: String): Self = StObject.set(x, "resourceBaseUri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUri(value: String): Self = StObject.set(x, "websiteUri", value.asInstanceOf[js.Any])
  }
}
