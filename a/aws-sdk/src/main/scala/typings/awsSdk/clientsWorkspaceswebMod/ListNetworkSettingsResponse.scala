package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkSettingsResponse extends StObject {
  
  /**
    * The network settings.
    */
  var networkSettings: js.UndefOr[NetworkSettingsList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkSettingsResponse {
  
  inline def apply(): ListNetworkSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkSettingsResponse]
  }
  
  extension [Self <: ListNetworkSettingsResponse](x: Self) {
    
    inline def setNetworkSettings(value: NetworkSettingsList): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsUndefined: Self = StObject.set(x, "networkSettings", js.undefined)
    
    inline def setNetworkSettingsVarargs(value: NetworkSettingsSummary*): Self = StObject.set(x, "networkSettings", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
