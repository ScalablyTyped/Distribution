package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSchemasResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of SearchSchemaSummary information.
    */
  var Schemas: js.UndefOr[listOfSearchSchemaSummary] = js.undefined
}
object SearchSchemasResponse {
  
  inline def apply(): SearchSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemasResponse]
  }
  
  extension [Self <: SearchSchemasResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemas(value: listOfSearchSchemaSummary): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SearchSchemaSummary*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
