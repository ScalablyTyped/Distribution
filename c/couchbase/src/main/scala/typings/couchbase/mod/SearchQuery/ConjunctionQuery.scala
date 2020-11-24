package typings.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchQuery.ConjunctionQuery")
@js.native
abstract class ConjunctionQuery () extends Query {
  
  /**
    * Specifies additional predicate queries.
    * @param queries Additional predicate queries.
    */
  def and(queries: Query*): this.type = js.native
  /**
    * Specifies additional predicate queries.
    * @param queries Additional predicate queries.
    */
  def and(queries: js.Array[Query]): this.type = js.native
  
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
}
