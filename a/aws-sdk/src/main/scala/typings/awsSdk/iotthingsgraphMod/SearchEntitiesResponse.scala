package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchEntitiesResponse extends StObject {
  
  /**
    * An array of descriptions for each entity returned in the search result.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.undefined
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchEntitiesResponse {
  
  inline def apply(): SearchEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchEntitiesResponse]
  }
  
  extension [Self <: SearchEntitiesResponse](x: Self) {
    
    inline def setDescriptions(value: EntityDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: EntityDescription*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
