package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SearchQueryNs.BooleanFieldQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.BooleanQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.ConjunctionQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.Consistency
import typings.couchbase.couchbaseMod.SearchQueryNs.DateRangeQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.DisjunctionQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.DocIdQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.GeoBoundingBoxQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.GeoDistanceQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.HighlightStyle
import typings.couchbase.couchbaseMod.SearchQueryNs.MatchAllQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.MatchPhraseQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.MatchQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.NumericRangeQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.PhraseQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.PrefixQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.Query
import typings.couchbase.couchbaseMod.SearchQueryNs.QueryStringQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.RegexpQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.TermQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.TermRangeQuery
import typings.couchbase.couchbaseMod.SearchQueryNs.WildcardQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery")
@js.native
abstract class SearchQuery () extends js.Object {
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

/* static members */
@JSImport("couchbase", "SearchQuery")
@js.native
object SearchQuery extends js.Object {
  /**
    * Creates a compound BooleanQuery composed of several other query objects.
    */
  def boolean(): BooleanQuery = js.native
  /**
    * Creates a BooleanFieldQuery for searching boolean fields in an index.
    */
  def booleanField(`val`: Boolean): BooleanFieldQuery = js.native
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  def conjuncts(queries: Query*): ConjunctionQuery = js.native
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  def conjuncts(queries: js.Array[Query]): ConjunctionQuery = js.native
  /**
    * Creates a search query for matching date ranges in an index.
    */
  def dateRange(): DateRangeQuery = js.native
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  def disjuncts(queries: Query*): DisjunctionQuery = js.native
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  def disjuncts(queries: js.Array[Query]): DisjunctionQuery = js.native
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  def docIds(ids: String*): DocIdQuery = js.native
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  def docIds(ids: js.Array[String]): DocIdQuery = js.native
  /**
    * Creates a geographical bounding-box based query.
    * @param tl_lat Top-left latitude.
    * @param tl_lon Top-left longitude.
    * @param br_lat Bottom-right latitude.
    * @param br_lon Bottom-right longitude.
    */
  def geoBoundingBoxQuery(tl_lat: Double, tl_lon: Double, br_lat: Double, br_lon: Double): GeoBoundingBoxQuery = js.native
  /**
    * Creates a geographical distance based query.
    */
  def geoDistanceQuery(): GeoDistanceQuery = js.native
  /**
    * Creates a search query for matching text.
    */
  def `match`(`match`: String): MatchQuery = js.native
  /**
    * Creates a search query which matches anything.
    */
  def matchAll(): MatchAllQuery = js.native
  /**
    * Creates a search query which matches nothing.
    */
  def matchNone(): MatchAllQuery = js.native
  /**
    * Creates a search query for matching phrases in an index.
    */
  def matchPhrase(phrase: String): MatchPhraseQuery = js.native
  /**
    * Creates a new search query from an index name and search query definition.
    * @param indexName The FTS index to search in.
    * @param query The body of the FTS query.
    */
  def `new`(indexName: String, query: Query): SearchQuery = js.native
  /**
    * Creates a search query for matching numeric ranges in an index.
    */
  def numericRange(): NumericRangeQuery = js.native
  /**
    * Creates a search query for a prefix in an index.
    */
  def phrase(terms: js.Array[String]): PhraseQuery = js.native
  /**
    * Creates a search query for a prefix in an index.
    */
  def prefix(prefix: String): PrefixQuery = js.native
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /**
    * Creates a search query for matching string.
    */
  def queryString(query: String): QueryStringQuery = js.native
  /**
    * Creates a search query for matching against a regexp query in an index.
    */
  def regexp(regexp: String): RegexpQuery = js.native
  /**
    * Creates a search query for searching terms in an index.
    */
  def term(term: String): TermQuery = js.native
  /**
    * Creates a search query for matching term ranges in the index.
    */
  def termRange(): TermRangeQuery = js.native
  /**
    * Creates a search query for matching a string with wildcards in an index.
    */
  def wildcard(wildcard: String): WildcardQuery = js.native
}

