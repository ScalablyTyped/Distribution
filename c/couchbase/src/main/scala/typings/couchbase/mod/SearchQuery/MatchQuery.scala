package typings.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
