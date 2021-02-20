package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryContext extends StObject {
  
  var dataService: DataService = js.native
  
  var entityManager: EntityManager = js.native
  
  var query: EntityQuery | String = js.native
  
  var queryOptions: QueryOptions = js.native
  
  var url: String = js.native
}
object QueryContext {
  
  @scala.inline
  def apply(
    dataService: DataService,
    entityManager: EntityManager,
    query: EntityQuery | String,
    queryOptions: QueryOptions,
    url: String
  ): QueryContext = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], entityManager = entityManager.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
  
  @scala.inline
  implicit class QueryContextMutableBuilder[Self <: QueryContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: EntityQuery | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
