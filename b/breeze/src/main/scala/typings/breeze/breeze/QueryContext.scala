package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext extends js.Object {
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
  implicit class QueryContextOps[Self <: QueryContext] (val x: Self) extends AnyVal {
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
    def setDataService(value: DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityManager(value: EntityManager): Self = this.set("entityManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: EntityQuery | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = this.set("queryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

