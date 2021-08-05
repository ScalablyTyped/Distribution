package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIDConnectProviderResponse extends StObject {
  
  /**
    * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider.
    */
  var ClientIDList: js.UndefOr[clientIDListType] = js.undefined
  
  /**
    * The date and time when the IAM OIDC provider resource object was created in the AWS account.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined
  
  /**
    * The URL that the IAM OIDC provider resource object is associated with. For more information, see CreateOpenIDConnectProvider.
    */
  var Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined
}
object GetOpenIDConnectProviderResponse {
  
  inline def apply(): GetOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIDConnectProviderResponse]
  }
  
  extension [Self <: GetOpenIDConnectProviderResponse](x: Self) {
    
    inline def setClientIDList(value: clientIDListType): Self = StObject.set(x, "ClientIDList", value.asInstanceOf[js.Any])
    
    inline def setClientIDListUndefined: Self = StObject.set(x, "ClientIDList", js.undefined)
    
    inline def setClientIDListVarargs(value: clientIDType*): Self = StObject.set(x, "ClientIDList", js.Array(value :_*))
    
    inline def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setThumbprintList(value: thumbprintListType): Self = StObject.set(x, "ThumbprintList", value.asInstanceOf[js.Any])
    
    inline def setThumbprintListUndefined: Self = StObject.set(x, "ThumbprintList", js.undefined)
    
    inline def setThumbprintListVarargs(value: thumbprintType*): Self = StObject.set(x, "ThumbprintList", js.Array(value :_*))
    
    inline def setUrl(value: OpenIDConnectProviderUrlType): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
