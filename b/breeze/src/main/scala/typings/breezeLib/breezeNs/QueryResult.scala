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

