package typings.couchbase.mod

import typings.couchbase.mod.SearchQuery.Consistency
import typings.couchbase.mod.SearchQuery.HighlightStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("couchbase", "SearchQuery")
@js.native
abstract class SearchQuery () extends StObject {
  
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
object SearchQuery {
  
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
  
  @js.native
  sealed trait Consistency extends StObject
  /**
    * Enumeration for specifying FTS consistency semantics.
    */
  @JSImport("couchbase", "SearchQuery.Consistency")
  @js.native
  object Consistency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
    
    /**
      * This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUNDED extends Consistency
    /* 0 */ val NOT_BOUNDED: typings.couchbase.mod.SearchQuery.Consistency.NOT_BOUNDED with Double = js.native
  }
  
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
  
  @JSImport("couchbase", "SearchQuery.DisjunctionQuery")
  @js.native
  abstract class DisjunctionQuery () extends Query {
    
    /**
      * Defines the amount to boost the query.
      * @param boost Amount to boost the query.
      */
    def boost(boost: Double): this.type = js.native
    
    /**
      * Specifies additional predicate queries.
      * @param queries Additional predicate queries.
      */
    def or(queries: Query*): this.type = js.native
    /**
      * Specifies additional predicate queries.
      * @param queries Additional predicate queries.
      */
    def or(queries: js.Array[Query]): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchQuery.DocIdQuery")
  @js.native
  abstract class DocIdQuery () extends Query {
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.GeoBoundingBoxQuery")
  @js.native
  abstract class GeoBoundingBoxQuery_ () extends Query {
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.GeoDistanceQuery")
  @js.native
  abstract class GeoDistanceQuery_ () extends Query {
    
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
  }
  
  @js.native
  sealed trait HighlightStyle extends StObject
  /**
    * Enumeration for specifying FTS highlight styling.
    */
  @JSImport("couchbase", "SearchQuery.HighlightStyle")
  @js.native
  object HighlightStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HighlightStyle with Double] = js.native
    
    /**
      * This causes hits to be highlighted with ANSI character codes.
      */
    @js.native
    sealed trait ANSI extends HighlightStyle
    /* 2 */ val ANSI: typings.couchbase.mod.SearchQuery.HighlightStyle.ANSI with Double = js.native
    
    /**
      * This causes hits to be highlighted using the default style.
      */
    @js.native
    sealed trait DEFAULT extends HighlightStyle
    /* 0 */ val DEFAULT: typings.couchbase.mod.SearchQuery.HighlightStyle.DEFAULT with Double = js.native
    
    /**
      * This causes hits to be highlighted using HTML tags.
      */
    @js.native
    sealed trait HTML extends HighlightStyle
    /* 1 */ val HTML: typings.couchbase.mod.SearchQuery.HighlightStyle.HTML with Double = js.native
  }
  
  @JSImport("couchbase", "SearchQuery.MatchAllQuery")
  @js.native
  abstract class MatchAllQuery () extends Query
  
  @JSImport("couchbase", "SearchQuery.MatchNoneQuery")
  @js.native
  abstract class MatchNoneQuery () extends Query
  
  @JSImport("couchbase", "SearchQuery.MatchPhraseQuery")
  @js.native
  abstract class MatchPhraseQuery () extends Query {
    
    /**
      * Specifies the analyzer to use for the query.
      * @param analyzer Analyzer to use for the query.
      */
    def analyzer(analyzer: String): this.type = js.native
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.MatchQuery")
  @js.native
  abstract class MatchQuery () extends Query {
    
    /**
      * Specifies the analyzer to use for the query.
      * @param analyzer Analyzer to use for the query.
      */
    def analyzer(analyzer: String): this.type = js.native
    
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
      * Defines the level of fuzziness for the query.
      * @param fuzziness Level of fuzziness for the query.
      */
    def fuzziness(fuzziness: Double): this.type = js.native
    
    /**
      * Specifies the prefix length to consider for the query.
      * @param prefixLength Prefix length to consider for the query.
      */
    def prefixLength(prefixLength: Double): this.type = js.native
  }
  
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
  
  @JSImport("couchbase", "SearchQuery.PhraseQuery")
  @js.native
  abstract class PhraseQuery () extends Query {
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.PrefixQuery")
  @js.native
  abstract class PrefixQuery () extends Query {
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.Query")
  @js.native
  abstract class Query () extends StObject
  
  @JSImport("couchbase", "SearchQuery.QueryStringQuery")
  @js.native
  abstract class QueryStringQuery () extends Query {
    
    /**
      * Defines the amount to boost the query.
      * @param boost Amount to boost the query.
      */
    def boost(boost: Double): this.type = js.native
  }
  
  @JSImport("couchbase", "SearchQuery.RegexpQuery")
  @js.native
  abstract class RegexpQuery () extends Query {
    
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
  }
  
  @JSImport("couchbase", "SearchQuery.TermQuery")
  @js.native
  abstract class TermQuery () extends Query {
    
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
      * Defines the level of fuzziness for the query.
      * @param fuzziness Level of fuzziness for the query.
      */
    def fuzziness(fuzziness: Double): this.type = js.native
    
    /**
      * Specifies the prefix length to consider for the query.
      * @param prefixLength Prefix length to consider for the query.
      */
    def prefixLength(prefixLength: Double): this.type = js.native
  }
  
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
  
  @JSImport("couchbase", "SearchQuery.WildcardQuery")
  @js.native
  abstract class WildcardQuery () extends Query {
    
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
  
  /**
    * Creates a compound BooleanQuery composed of several other query objects.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.boolean")
  @js.native
  def boolean(): BooleanQuery = js.native
  
  /**
    * Creates a BooleanFieldQuery for searching boolean fields in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.booleanField")
  @js.native
  def booleanField(`val`: Boolean): BooleanFieldQuery = js.native
  
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.conjuncts")
  @js.native
  def conjuncts(queries: Query*): ConjunctionQuery = js.native
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.conjuncts")
  @js.native
  def conjuncts(queries: js.Array[Query]): ConjunctionQuery = js.native
  
  /**
    * Creates a search query for matching date ranges in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.dateRange")
  @js.native
  def dateRange(): DateRangeQuery = js.native
  
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.disjuncts")
  @js.native
  def disjuncts(queries: Query*): DisjunctionQuery = js.native
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.disjuncts")
  @js.native
  def disjuncts(queries: js.Array[Query]): DisjunctionQuery = js.native
  
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.docIds")
  @js.native
  def docIds(ids: String*): DocIdQuery = js.native
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.docIds")
  @js.native
  def docIds(ids: js.Array[String]): DocIdQuery = js.native
  
  /**
    * Creates a geographical bounding-box based query.
    * @param tl_lat Top-left latitude.
    * @param tl_lon Top-left longitude.
    * @param br_lat Bottom-right latitude.
    * @param br_lon Bottom-right longitude.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.geoBoundingBoxQuery")
  @js.native
  def geoBoundingBoxQuery(tl_lat: Double, tl_lon: Double, br_lat: Double, br_lon: Double): GeoBoundingBoxQuery_ = js.native
  
  /**
    * Creates a geographical distance based query.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.geoDistanceQuery")
  @js.native
  def geoDistanceQuery(): GeoDistanceQuery_ = js.native
  
  /**
    * Creates a search query which matches anything.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.matchAll")
  @js.native
  def matchAll(): MatchAllQuery = js.native
  
  /**
    * Creates a search query which matches nothing.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.matchNone")
  @js.native
  def matchNone(): MatchAllQuery = js.native
  
  /**
    * Creates a search query for matching phrases in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.matchPhrase")
  @js.native
  def matchPhrase(phrase: String): MatchPhraseQuery = js.native
  
  /**
    * Creates a search query for matching numeric ranges in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.numericRange")
  @js.native
  def numericRange(): NumericRangeQuery = js.native
  
  /**
    * Creates a search query for a prefix in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.phrase")
  @js.native
  def phrase(terms: js.Array[String]): PhraseQuery = js.native
  
  /**
    * Creates a search query for a prefix in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.prefix")
  @js.native
  def prefix(prefix: String): PrefixQuery = js.native
  
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /**
    * Creates a search query for matching string.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.queryString")
  @js.native
  def queryString(query: String): QueryStringQuery = js.native
  
  /**
    * Creates a search query for matching against a regexp query in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.regexp")
  @js.native
  def regexp(regexp: String): RegexpQuery = js.native
  
  /**
    * Creates a search query for searching terms in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.term")
  @js.native
  def term(term: String): TermQuery = js.native
  
  /**
    * Creates a search query for matching term ranges in the index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.termRange")
  @js.native
  def termRange(): TermRangeQuery = js.native
  
  /**
    * Creates a search query for matching a string with wildcards in an index.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.wildcard")
  @js.native
  def wildcard(wildcard: String): WildcardQuery = js.native
  
  /**
    * Creates a search query for matching text.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.match")
  @js.native
  def `match`(`match`: String): MatchQuery = js.native
  
  /**
    * Creates a new search query from an index name and search query definition.
    * @param indexName The FTS index to search in.
    * @param query The body of the FTS query.
    */
  /* static member */
  @JSImport("couchbase", "SearchQuery.new")
  @js.native
  def `new`(indexName: String, query: Query): SearchQuery = js.native
}
