package typings.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchQuery.TermRangeQuery")
@js.native
abstract class TermRangeQuery () extends Query {
  
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
    * Defines the upper bound of the term range query.
    * @param max The upper bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to false.
    */
  def max(max: String): this.type = js.native
  def max(max: String, inclusive: Boolean): this.type = js.native
  
  /**
    * Defines the lower bound of the term range query.
    * @param min The lower bound of the query.
    * @param inclusive True to set an inclusive bound. Defaults to true.
    */
  def min(min: String): this.type = js.native
  def min(min: String, inclusive: Boolean): this.type = js.native
}
