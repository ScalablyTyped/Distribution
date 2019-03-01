package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.undefined
  /** Raw response from the server */
  var httpResponse: HttpResponse
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[scala.Double] = js.undefined
  /** Query that was executed */
  var query: EntityQuery
  /** Top level entities returned */
  var results: js.Array[Entity]
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(
    httpResponse: HttpResponse,
    query: EntityQuery,
    results: js.Array[Entity],
    entityManager: EntityManager = null,
    inlineCount: scala.Int | scala.Double = null,
    retrievedEntities: js.Array[Entity] = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpResponse")(httpResponse)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("results")(results)
    if (entityManager != null) __obj.updateDynamic("entityManager")(entityManager)
    if (inlineCount != null) __obj.updateDynamic("inlineCount")(inlineCount.asInstanceOf[js.Any])
    if (retrievedEntities != null) __obj.updateDynamic("retrievedEntities")(retrievedEntities)
    __obj.asInstanceOf[QueryResult]
  }
}

