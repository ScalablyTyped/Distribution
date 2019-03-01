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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataService")(dataService)
    __obj.updateDynamic("entityManager")(entityManager)
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.updateDynamic("queryOptions")(queryOptions)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[QueryContext]
  }
}

