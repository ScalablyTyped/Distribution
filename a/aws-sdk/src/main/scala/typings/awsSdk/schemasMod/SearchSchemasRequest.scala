package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSchemasRequest extends StObject {
  
  /**
    * Specifying this limits the results to only schemas that include the provided keywords.
    */
  var Keywords: string
  
  var Limit: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
}
object SearchSchemasRequest {
  
  inline def apply(Keywords: string, RegistryName: string): SearchSchemasRequest = {
    val __obj = js.Dynamic.literal(Keywords = Keywords.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemasRequest]
  }
  
  extension [Self <: SearchSchemasRequest](x: Self) {
    
    inline def setKeywords(value: string): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
