package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchEntitiesRequest extends StObject {
  
  /**
    * The entity types for which to search.
    */
  var entityTypes: EntityTypes
  
  /**
    * Optional filter to apply to the search. Valid filters are NAME NAMESPACE, SEMANTIC_TYPE_PATH and REFERENCED_ENTITY_ID. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state. Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND criteria.
    */
  var filters: js.UndefOr[EntityFilters] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchEntitiesRequest {
  
  inline def apply(entityTypes: EntityTypes): SearchEntitiesRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntitiesRequest]
  }
  
  extension [Self <: SearchEntitiesRequest](x: Self) {
    
    inline def setEntityTypes(value: EntityTypes): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setFilters(value: EntityFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: EntityFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
