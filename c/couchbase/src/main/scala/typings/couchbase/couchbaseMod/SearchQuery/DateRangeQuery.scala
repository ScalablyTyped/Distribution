package typings.couchbase.couchbaseMod.SearchQuery

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery.DateRangeQuery")
@js.native
abstract class DateRangeQuery () extends Query {
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  def end(end: String): this.type = js.native
  def end(end: String, inclusive: Boolean): this.type = js.native
  /**
    * Defines the upper bound of the date range query.
    * @param end The upper bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to false.
    */
  def end(end: Date): this.type = js.native
  def end(end: Date, inclusive: Boolean): this.type = js.native
  /**
    * Specifies the field to query.
    * @param field The field to query.
    */
  def field(field: String): this.type = js.native
  def start(start: String): this.type = js.native
  def start(start: String, inclusive: Boolean): this.type = js.native
  /**
    * Defines the lower bound of the date range query.
    * @param start The lower bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to true.
    */
  def start(start: Date): this.type = js.native
  def start(start: Date, inclusive: Boolean): this.type = js.native
}

