package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonSilentFlowRequestMod {
  
  trait CommonSilentFlowRequest
    extends StObject
       with BaseAuthRequest {
    
    var account: AccountInfo
    
    var forceRefresh: Boolean
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object CommonSilentFlowRequest {
    
    inline def apply(
      account: AccountInfo,
      authority: String,
      correlationId: String,
      forceRefresh: Boolean,
      scopes: js.Array[String]
    ): CommonSilentFlowRequest = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], forceRefresh = forceRefresh.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonSilentFlowRequest]
    }
    
    extension [Self <: CommonSilentFlowRequest](x: Self) {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
