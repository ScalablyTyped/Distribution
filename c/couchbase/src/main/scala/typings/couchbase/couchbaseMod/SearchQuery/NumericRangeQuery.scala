package typings.couchbase.couchbaseMod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery.NumericRangeQuery")
@js.native
abstract class NumericRangeQuery () extends Query {
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  /**
    * Specifies the field to query.
    * @param field The field to query.
    */
  def field(field: String): this.type = js.native
  /**
    * Defines the upper bound of the numeric range query.
    * @param max The upper bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to false.
    */
  def max(max: Double): this.type = js.native
  def max(max: Double, inclusive: Boolean): this.type = js.native
  /**
    * Defines the lower bound of the numeric range query.
    * @param min The lower bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to true.
    */
  def min(min: Double): this.type = js.native
  def min(min: Double, inclusive: Boolean): this.type = js.native
}

