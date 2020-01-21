package typings.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery.BooleanQuery")
@js.native
abstract class BooleanQuery () extends Query {
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  /**
    * Specifies a predicate query which must match.
    * @param query
    */
  def must(query: Query): this.type = js.native
  /**
    * Specifies a predicate query which must not match.
    * @param query
    */
  def mustNot(query: Query): this.type = js.native
  /**
    * Specifies a predicate query which should match.
    * @param query
    */
  def should(query: Query): this.type = js.native
  /**
    * Specifies the minimum score for should predicate matches.
    * @param shouldMin
    */
  def shouldMin(shouldMin: Double): this.type = js.native
}

