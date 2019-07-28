package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SearchQueryNs.Consistency
import typings.couchbase.couchbaseMod.SearchQueryNs.HighlightStyle
import typings.couchbase.couchbaseMod.SearchQueryNs.Query
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery")
@js.native
object SearchQueryNs extends js.Object {
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
  sealed trait Consistency extends js.Object
  
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
  
  @js.native
  abstract class GeoBoundingBoxQuery () extends Query {
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
  abstract class GeoDistanceQuery () extends Query {
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
  sealed trait HighlightStyle extends js.Object
  
  @js.native
  abstract class MatchAllQuery () extends Query
  
  @js.native
  abstract class MatchNoneQuery () extends Query
  
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
  
  @js.native
  abstract class Query () extends js.Object
  
  @js.native
  abstract class QueryStringQuery () extends Query {
    /**
      * Defines the amount to boost the query.
      * @param boost Amount to boost the query.
      */
    def boost(boost: Double): this.type = js.native
  }
  
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
    * Enumeration for specifying FTS consistency semantics.
    */
  @js.native
  object Consistency extends js.Object {
    /**
      * This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUNDED extends Consistency
    
    /* 0 */ val NOT_BOUNDED: typings.couchbase.couchbaseMod.SearchQueryNs.Consistency.NOT_BOUNDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
  }
  
  /**
    * Enumeration for specifying FTS highlight styling.
    */
  @js.native
  object HighlightStyle extends js.Object {
    /**
      * This causes hits to be highlighted with ANSI character codes.
      */
    @js.native
    sealed trait ANSI extends HighlightStyle
    
    /**
      * This causes hits to be highlighted using the default style.
      */
    @js.native
    sealed trait DEFAULT extends HighlightStyle
    
    /**
      * This causes hits to be highlighted using HTML tags.
      */
    @js.native
    sealed trait HTML extends HighlightStyle
    
    /* 2 */ val ANSI: typings.couchbase.couchbaseMod.SearchQueryNs.HighlightStyle.ANSI with Double = js.native
    /* 0 */ val DEFAULT: typings.couchbase.couchbaseMod.SearchQueryNs.HighlightStyle.DEFAULT with Double = js.native
    /* 1 */ val HTML: typings.couchbase.couchbaseMod.SearchQueryNs.HighlightStyle.HTML with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HighlightStyle with Double] = js.native
  }
  
}

