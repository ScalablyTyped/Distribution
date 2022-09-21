package typings.azureMsalCommon

import typings.azureMsalCommon.azureRegionMod.AzureRegion
import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.clientCredentialsMod.ClientAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonClientCredentialRequestMod {
  
  trait CommonClientCredentialRequest
    extends StObject
       with BaseAuthRequest {
    
    var azureRegion: js.UndefOr[AzureRegion] = js.undefined
    
    var clientAssertion: js.UndefOr[ClientAssertion] = js.undefined
    
    var skipCache: js.UndefOr[Boolean] = js.undefined
  }
  object CommonClientCredentialRequest {
    
    inline def apply(authority: String, correlationId: String, scopes: js.Array[String]): CommonClientCredentialRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonClientCredentialRequest]
    }
    
    extension [Self <: CommonClientCredentialRequest](x: Self) {
      
      inline def setAzureRegion(value: AzureRegion): Self = StObject.set(x, "azureRegion", value.asInstanceOf[js.Any])
      
      inline def setAzureRegionUndefined: Self = StObject.set(x, "azureRegion", js.undefined)
      
      inline def setClientAssertion(value: ClientAssertion): Self = StObject.set(x, "clientAssertion", value.asInstanceOf[js.Any])
      
      inline def setClientAssertionUndefined: Self = StObject.set(x, "clientAssertion", js.undefined)
      
      inline def setSkipCache(value: Boolean): Self = StObject.set(x, "skipCache", value.asInstanceOf[js.Any])
      
      inline def setSkipCacheUndefined: Self = StObject.set(x, "skipCache", js.undefined)
    }
  }
}
