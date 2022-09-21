package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.undefined
  
  /** Raw response from the server */
  var httpResponse: HttpResponse
  
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[Double] = js.undefined
  
  /** Query that was executed */
  var query: EntityQuery
  
  /** Top level entities returned */
  var results: js.Array[Entity]
  
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.undefined
}
object QueryResult {
  
  inline def apply(httpResponse: HttpResponse, query: EntityQuery, results: js.Array[Entity]): QueryResult = {
    val __obj = js.Dynamic.literal(httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  extension [Self <: QueryResult](x: Self) {
    
    inline def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    inline def setEntityManagerUndefined: Self = StObject.set(x, "entityManager", js.undefined)
    
    inline def setHttpResponse(value: HttpResponse): Self = StObject.set(x, "httpResponse", value.asInstanceOf[js.Any])
    
    inline def setInlineCount(value: Double): Self = StObject.set(x, "inlineCount", value.asInstanceOf[js.Any])
    
    inline def setInlineCountUndefined: Self = StObject.set(x, "inlineCount", js.undefined)
    
    inline def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[Entity]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Entity*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setRetrievedEntities(value: js.Array[Entity]): Self = StObject.set(x, "retrievedEntities", value.asInstanceOf[js.Any])
    
    inline def setRetrievedEntitiesUndefined: Self = StObject.set(x, "retrievedEntities", js.undefined)
    
    inline def setRetrievedEntitiesVarargs(value: Entity*): Self = StObject.set(x, "retrievedEntities", js.Array(value*))
  }
}
