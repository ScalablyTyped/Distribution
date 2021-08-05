package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceConfigHistoryResponse extends StObject {
  
  /**
    * A list that contains the configuration history of one or more resources.
    */
  var configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetResourceConfigHistoryResponse {
  
  inline def apply(): GetResourceConfigHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceConfigHistoryResponse]
  }
  
  extension [Self <: GetResourceConfigHistoryResponse](x: Self) {
    
    inline def setConfigurationItems(value: ConfigurationItemList): Self = StObject.set(x, "configurationItems", value.asInstanceOf[js.Any])
    
    inline def setConfigurationItemsUndefined: Self = StObject.set(x, "configurationItems", js.undefined)
    
    inline def setConfigurationItemsVarargs(value: ConfigurationItem*): Self = StObject.set(x, "configurationItems", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
