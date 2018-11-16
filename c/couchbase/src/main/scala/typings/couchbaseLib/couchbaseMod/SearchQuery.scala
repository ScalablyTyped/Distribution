package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery")
@js.native
abstract class SearchQuery () extends js.Object {
  /**
       * Adds a SearchFacet object to return information about as part of the execution of this query.
       */
  def addFacet(name: java.lang.String, facet: SearchFacet): this.type = js.native
  /**
       * Specify the consistency level for this query.
       */
  def consistency(`val`: couchbaseLib.couchbaseMod.SearchQueryNs.Consistency): this.type = js.native
  /**
       * Includes information about the internal search semantics used to execute your query.
       */
  def explain(explain: scala.Boolean): this.type = js.native
  /**
       * Specifies the fields you wish to receive in the result set.
       */
  def fields(fields: java.lang.String*): this.type = js.native
  /**
       * Specifies the fields you wish to receive in the result set.
       */
  def fields(fields: js.Array[java.lang.String]): this.type = js.native
  /**
       * Request a particular highlight style and field list for this query.
       */
  def highlight(style: couchbaseLib.couchbaseMod.SearchQueryNs.HighlightStyle, fields: java.lang.String*): this.type = js.native
  /**
       * Request a particular highlight style and field list for this query.
       */
  def highlight(style: couchbaseLib.couchbaseMod.SearchQueryNs.HighlightStyle, fields: js.Array[java.lang.String]): this.type = js.native
  /**
       * Specifies the maximum number of results to return.
       * @param limit Maximum number of results to return.
       */
  def limit(limit: scala.Double): this.type = js.native
  /**
       * Specifies how many results to skip from the beginning of the result set.
       * @param skip How many results to skip from the beginning of the result set.
       */
  def skip(skip: scala.Double): this.type = js.native
  /**
       * Specifies the fields you wish to sort by in your result set.
       */
  def sort(fields: (java.lang.String | SearchSort)*): this.type = js.native
  /**
       * Specifies the fields you wish to sort by in your result set.
       */
  def sort(fields: js.Array[java.lang.String | SearchSort]): this.type = js.native
  /**
       * Specifies the maximum time to wait for this query to complete.
       * @param timeout Maximum time to wait (in milliseconds) for this query to complete.
       */
  def timeout(timeout: scala.Double): this.type = js.native
}

@JSImport("couchbase", "SearchQuery")
@js.native
object SearchQuery extends js.Object {
  /**
       * Creates a compound BooleanQuery composed of several other query objects.
       */
  def boolean(): couchbaseLib.couchbaseMod.SearchQueryNs.BooleanQuery = js.native
  /**
       * Creates a BooleanFieldQuery for searching boolean fields in an index.
       */
  def booleanField(`val`: scala.Boolean): couchbaseLib.couchbaseMod.SearchQueryNs.BooleanFieldQuery = js.native
  /**
       * Creates a query for matches all of a list of subqueries in an index.
       */
  def conjuncts(queries: couchbaseLib.couchbaseMod.SearchQueryNs.Query*): couchbaseLib.couchbaseMod.SearchQueryNs.ConjunctionQuery = js.native
  /**
       * Creates a query for matches all of a list of subqueries in an index.
       */
  def conjuncts(queries: js.Array[couchbaseLib.couchbaseMod.SearchQueryNs.Query]): couchbaseLib.couchbaseMod.SearchQueryNs.ConjunctionQuery = js.native
  /**
       * Creates a search query for matching date ranges in an index.
       */
  def dateRange(): couchbaseLib.couchbaseMod.SearchQueryNs.DateRangeQuery = js.native
  /**
       * Creates a query for matches any of a list of subqueries in an index.
       */
  def disjuncts(queries: couchbaseLib.couchbaseMod.SearchQueryNs.Query*): couchbaseLib.couchbaseMod.SearchQueryNs.DisjunctionQuery = js.native
  /**
       * Creates a query for matches any of a list of subqueries in an index.
       */
  def disjuncts(queries: js.Array[couchbaseLib.couchbaseMod.SearchQueryNs.Query]): couchbaseLib.couchbaseMod.SearchQueryNs.DisjunctionQuery = js.native
  /**
       * Creates a query which allows you to match a list of document IDs in an index.
       */
  def docIds(ids: java.lang.String*): couchbaseLib.couchbaseMod.SearchQueryNs.DocIdQuery = js.native
  /**
       * Creates a query which allows you to match a list of document IDs in an index.
       */
  def docIds(ids: js.Array[java.lang.String]): couchbaseLib.couchbaseMod.SearchQueryNs.DocIdQuery = js.native
  /**
       * Creates a geographical bounding-box based query.
       * @param tl_lat Top-left latitude.
       * @param tl_lon Top-left longitude.
       * @param br_lat Bottom-right latitude.
       * @param br_lon Bottom-right longitude.
       */
  def geoBoundingBoxQuery(tl_lat: scala.Double, tl_lon: scala.Double, br_lat: scala.Double, br_lon: scala.Double): couchbaseLib.couchbaseMod.SearchQueryNs.GeoBoundingBoxQuery = js.native
  /**
       * Creates a geographical distance based query.
       */
  def geoDistanceQuery(): couchbaseLib.couchbaseMod.SearchQueryNs.GeoDistanceQuery = js.native
  /**
       * Creates a search query for matching text.
       */
  def `match`(`match`: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.MatchQuery = js.native
  /**
       * Creates a search query which matches anything.
       */
  def matchAll(): couchbaseLib.couchbaseMod.SearchQueryNs.MatchAllQuery = js.native
  /**
       * Creates a search query which matches nothing.
       */
  def matchNone(): couchbaseLib.couchbaseMod.SearchQueryNs.MatchAllQuery = js.native
  /**
       * Creates a search query for matching phrases in an index.
       */
  def matchPhrase(phrase: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.MatchPhraseQuery = js.native
  /**
       * Creates a new search query from an index name and search query definition.
       * @param indexName The FTS index to search in.
       * @param query The body of the FTS query.
       */
  def `new`(indexName: java.lang.String, query: couchbaseLib.couchbaseMod.SearchQueryNs.Query): couchbaseLib.couchbaseMod.SearchQuery = js.native
  /**
       * Creates a search query for matching numeric ranges in an index.
       */
  def numericRange(): couchbaseLib.couchbaseMod.SearchQueryNs.NumericRangeQuery = js.native
  /**
       * Creates a search query for a prefix in an index.
       */
  def phrase(terms: js.Array[java.lang.String]): couchbaseLib.couchbaseMod.SearchQueryNs.PhraseQuery = js.native
  /**
       * Creates a search query for a prefix in an index.
       */
  def prefix(prefix: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.PrefixQuery = js.native
  /**
       * Creates a query for matches any of a list of subqueries in an index.
       */
  
  /**
       * Creates a search query for matching string.
       */
  def queryString(query: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.QueryStringQuery = js.native
  /**
       * Creates a search query for matching against a regexp query in an index.
       */
  def regexp(regexp: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.RegexpQuery = js.native
  /**
       * Creates a search query for searching terms in an index.
       */
  def term(term: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.TermQuery = js.native
  /**
       * Creates a search query for matching term ranges in the index.
       */
  def termRange(): couchbaseLib.couchbaseMod.SearchQueryNs.TermRangeQuery = js.native
  /**
       * Creates a search query for matching a string with wildcards in an index.
       */
  def wildcard(wildcard: java.lang.String): couchbaseLib.couchbaseMod.SearchQueryNs.WildcardQuery = js.native
}

