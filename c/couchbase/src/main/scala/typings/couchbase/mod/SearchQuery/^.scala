package typings.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery")
@js.native
object ^ extends js.Object {
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
  def `new`(indexName: String, query: Query): typings.couchbase.mod.SearchQuery = js.native
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

