package typings.couchbase.couchbaseMod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery.BooleanFieldQuery")
@js.native
abstract class BooleanFieldQuery () extends Query {
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  /**
    * Specifies the field to query.
    * @param boost The field to query.
    */
  def field(field: String): this.type = js.native
}

