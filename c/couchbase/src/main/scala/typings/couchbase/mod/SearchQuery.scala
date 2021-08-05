package typings.couchbase.mod

import typings.couchbase.mod.SearchQuery.Consistency
import typings.couchbase.mod.SearchQuery.HighlightStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("couchbase", "SearchQuery")
  @js.native
  val ^ : js.Any = js.native
  
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
    def apply(value: Double): js.UndefOr[Consistency & Double] = js.native
    
    /**
      * This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUNDED
      extends StObject
         with Consistency
    /* 0 */ val NOT_BOUNDED: typings.couchbase.mod.SearchQuery.Consistency.NOT_BOUNDED & Double = js.native
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
    def apply(value: Double): js.UndefOr[HighlightStyle & Double] = js.native
    
    /**
      * This causes hits to be highlighted with ANSI character codes.
      */
    @js.native
    sealed trait ANSI
      extends StObject
         with HighlightStyle
    /* 2 */ val ANSI: typings.couchbase.mod.SearchQuery.HighlightStyle.ANSI & Double = js.native
    
    /**
      * This causes hits to be highlighted using the default style.
      */
    @js.native
    sealed trait DEFAULT
      extends StObject
         with HighlightStyle
    /* 0 */ val DEFAULT: typings.couchbase.mod.SearchQuery.HighlightStyle.DEFAULT & Double = js.native
    
    /**
      * This causes hits to be highlighted using HTML tags.
      */
    @js.native
    sealed trait HTML
      extends StObject
         with HighlightStyle
    /* 1 */ val HTML: typings.couchbase.mod.SearchQuery.HighlightStyle.HTML & Double = js.native
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
  inline def boolean(): BooleanQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[BooleanQuery]
  
  /**
    * Creates a BooleanFieldQuery for searching boolean fields in an index.
    */
  /* static member */
  inline def booleanField(`val`: Boolean): BooleanFieldQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("booleanField")(`val`.asInstanceOf[js.Any]).asInstanceOf[BooleanFieldQuery]
  
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  /* static member */
  inline def conjuncts(queries: Query*): ConjunctionQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("conjuncts")(queries.asInstanceOf[js.Any]).asInstanceOf[ConjunctionQuery]
  /**
    * Creates a query for matches all of a list of subqueries in an index.
    */
  /* static member */
  inline def conjuncts(queries: js.Array[Query]): ConjunctionQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("conjuncts")(queries.asInstanceOf[js.Any]).asInstanceOf[ConjunctionQuery]
  
  /**
    * Creates a search query for matching date ranges in an index.
    */
  /* static member */
  inline def dateRange(): DateRangeQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("dateRange")().asInstanceOf[DateRangeQuery]
  
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /* static member */
  inline def disjuncts(queries: Query*): DisjunctionQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("disjuncts")(queries.asInstanceOf[js.Any]).asInstanceOf[DisjunctionQuery]
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /* static member */
  inline def disjuncts(queries: js.Array[Query]): DisjunctionQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("disjuncts")(queries.asInstanceOf[js.Any]).asInstanceOf[DisjunctionQuery]
  
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  /* static member */
  inline def docIds(ids: String*): DocIdQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("docIds")(ids.asInstanceOf[js.Any]).asInstanceOf[DocIdQuery]
  /**
    * Creates a query which allows you to match a list of document IDs in an index.
    */
  /* static member */
  inline def docIds(ids: js.Array[String]): DocIdQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("docIds")(ids.asInstanceOf[js.Any]).asInstanceOf[DocIdQuery]
  
  /**
    * Creates a geographical bounding-box based query.
    * @param tl_lat Top-left latitude.
    * @param tl_lon Top-left longitude.
    * @param br_lat Bottom-right latitude.
    * @param br_lon Bottom-right longitude.
    */
  /* static member */
  inline def geoBoundingBoxQuery(tl_lat: Double, tl_lon: Double, br_lat: Double, br_lon: Double): GeoBoundingBoxQuery_ = (^.asInstanceOf[js.Dynamic].applyDynamic("geoBoundingBoxQuery")(tl_lat.asInstanceOf[js.Any], tl_lon.asInstanceOf[js.Any], br_lat.asInstanceOf[js.Any], br_lon.asInstanceOf[js.Any])).asInstanceOf[GeoBoundingBoxQuery_]
  
  /**
    * Creates a geographical distance based query.
    */
  /* static member */
  inline def geoDistanceQuery(): GeoDistanceQuery_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoDistanceQuery")().asInstanceOf[GeoDistanceQuery_]
  
  /**
    * Creates a search query for matching text.
    */
  /* static member */
  inline def `match`(`match`: String): MatchQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(`match`.asInstanceOf[js.Any]).asInstanceOf[MatchQuery]
  
  /**
    * Creates a search query which matches anything.
    */
  /* static member */
  inline def matchAll(): MatchAllQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("matchAll")().asInstanceOf[MatchAllQuery]
  
  /**
    * Creates a search query which matches nothing.
    */
  /* static member */
  inline def matchNone(): MatchAllQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNone")().asInstanceOf[MatchAllQuery]
  
  /**
    * Creates a search query for matching phrases in an index.
    */
  /* static member */
  inline def matchPhrase(phrase: String): MatchPhraseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[MatchPhraseQuery]
  
  /**
    * Creates a new search query from an index name and search query definition.
    * @param indexName The FTS index to search in.
    * @param query The body of the FTS query.
    */
  /* static member */
  inline def `new`(indexName: String, query: Query): SearchQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("new")(indexName.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[SearchQuery]
  
  /**
    * Creates a search query for matching numeric ranges in an index.
    */
  /* static member */
  inline def numericRange(): NumericRangeQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("numericRange")().asInstanceOf[NumericRangeQuery]
  
  /**
    * Creates a search query for a prefix in an index.
    */
  /* static member */
  inline def phrase(terms: js.Array[String]): PhraseQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("phrase")(terms.asInstanceOf[js.Any]).asInstanceOf[PhraseQuery]
  
  /**
    * Creates a search query for a prefix in an index.
    */
  /* static member */
  inline def prefix(prefix: String): PrefixQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[PrefixQuery]
  
  /**
    * Creates a query for matches any of a list of subqueries in an index.
    */
  /**
    * Creates a search query for matching string.
    */
  /* static member */
  inline def queryString(query: String): QueryStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("queryString")(query.asInstanceOf[js.Any]).asInstanceOf[QueryStringQuery]
  
  /**
    * Creates a search query for matching against a regexp query in an index.
    */
  /* static member */
  inline def regexp(regexp: String): RegexpQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(regexp.asInstanceOf[js.Any]).asInstanceOf[RegexpQuery]
  
  /**
    * Creates a search query for searching terms in an index.
    */
  /* static member */
  inline def term(term: String): TermQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("term")(term.asInstanceOf[js.Any]).asInstanceOf[TermQuery]
  
  /**
    * Creates a search query for matching term ranges in the index.
    */
  /* static member */
  inline def termRange(): TermRangeQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("termRange")().asInstanceOf[TermRangeQuery]
  
  /**
    * Creates a search query for matching a string with wildcards in an index.
    */
  /* static member */
  inline def wildcard(wildcard: String): WildcardQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("wildcard")(wildcard.asInstanceOf[js.Any]).asInstanceOf[WildcardQuery]
}
