package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SearchQuery.Consistency
import typings.couchbase.couchbaseMod.SearchQuery.HighlightStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery")
@js.native
abstract class SearchQuery_ () extends js.Object {
  /**
    * Adds a SearchFacet object to return information about as part of the execution of this query.
    */
  def addFacet(name: String, facet: SearchFacet): this.type = js.native
  /**
    * Specify the consistency level for this query.
    */
  def consistency(`val`: Consistency): this.type = js.native
  /**
    * Includes information about the internal search semantics used to execute your query.
    */
  def explain(explain: Boolean): this.type = js.native
  /**
    * Specifies the fields you wish to receive in the result set.
    */
  def fields(fields: String*): this.type = js.native
  /**
    * Specifies the fields you wish to receive in the result set.
    */
  def fields(fields: js.Array[String]): this.type = js.native
  /**
    * Request a particular highlight style and field list for this query.
    */
  def highlight(style: HighlightStyle, fields: String*): this.type = js.native
  /**
    * Request a particular highlight style and field list for this query.
    */
  def highlight(style: HighlightStyle, fields: js.Array[String]): this.type = js.native
  /**
    * Specifies the maximum number of results to return.
    * @param limit Maximum number of results to return.
    */
  def limit(limit: Double): this.type = js.native
  /**
    * Specifies how many results to skip from the beginning of the result set.
    * @param skip How many results to skip from the beginning of the result set.
    */
  def skip(skip: Double): this.type = js.native
  /**
    * Specifies the fields you wish to sort by in your result set.
    */
  def sort(fields: (String | SearchSort)*): this.type = js.native
  /**
    * Specifies the fields you wish to sort by in your result set.
    */
  def sort(fields: js.Array[String | SearchSort]): this.type = js.native
  /**
    * Specifies the maximum time to wait for this query to complete.
    * @param timeout Maximum time to wait (in milliseconds) for this query to complete.
    */
  def timeout(timeout: Double): this.type = js.native
}

