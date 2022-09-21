package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationsResponse extends StObject {
  
  /**
    * The list of ListIntegrations instances.
    */
  var Items: js.UndefOr[IntegrationList] = js.undefined
  
  /**
    * The pagination token from the previous ListIntegrations API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListIntegrationsResponse {
  
  inline def apply(): ListIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntegrationsResponse]
  }
  
  extension [Self <: ListIntegrationsResponse](x: Self) {
    
    inline def setItems(value: IntegrationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListIntegrationItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
