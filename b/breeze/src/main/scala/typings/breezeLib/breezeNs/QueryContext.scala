package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var dataService: DataService
  var entityManager: EntityManager
  var query: EntityQuery | java.lang.String
  var queryOptions: QueryOptions
  var url: java.lang.String
}

object QueryContext {
  @scala.inline
  def apply(
    dataService: DataService,
    entityManager: EntityManager,
    query: EntityQuery | java.lang.String,
    queryOptions: QueryOptions,
    url: java.lang.String
  ): QueryContext = {
    val __obj = js.Dynamic.literal(dataService = dataService, entityManager = entityManager, query = query.asInstanceOf[js.Any], queryOptions = queryOptions, url = url)
  
    __obj.asInstanceOf[QueryContext]
  }
}

