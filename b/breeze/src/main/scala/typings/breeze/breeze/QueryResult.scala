package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult extends js.Object {
  
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.native
  
  /** Raw response from the server */
  var httpResponse: HttpResponse = js.native
  
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[Double] = js.native
  
  /** Query that was executed */
  var query: EntityQuery = js.native
  
  /** Top level entities returned */
  var results: js.Array[Entity] = js.native
  
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply(httpResponse: HttpResponse, query: EntityQuery, results: js.Array[Entity]): QueryResult = {
    val __obj = js.Dynamic.literal(httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = this.set("httpResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Entity*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Entity]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityManager(value: EntityManager): Self = this.set("entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityManager: Self = this.set("entityManager", js.undefined)
    
    @scala.inline
    def setInlineCount(value: Double): Self = this.set("inlineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineCount: Self = this.set("inlineCount", js.undefined)
    
    @scala.inline
    def setRetrievedEntitiesVarargs(value: Entity*): Self = this.set("retrievedEntities", js.Array(value :_*))
    
    @scala.inline
    def setRetrievedEntities(value: js.Array[Entity]): Self = this.set("retrievedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievedEntities: Self = this.set("retrievedEntities", js.undefined)
  }
}
