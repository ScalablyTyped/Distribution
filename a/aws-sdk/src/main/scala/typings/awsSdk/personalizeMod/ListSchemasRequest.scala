package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasRequest extends StObject {
  
  /**
    * The maximum number of schemas to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListSchemas for getting the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSchemasRequest {
  
  inline def apply(): ListSchemasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasRequest]
  }
  
  extension [Self <: ListSchemasRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
