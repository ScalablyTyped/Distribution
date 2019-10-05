package typings.couchbase.couchbaseMod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

