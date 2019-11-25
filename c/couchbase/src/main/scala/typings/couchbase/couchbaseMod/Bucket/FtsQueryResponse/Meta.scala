package typings.couchbase.couchbaseMod.Bucket.FtsQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a search query response.
  */
trait Meta extends js.Object {
  /**
    * Any non-fatal errors that occurred during query processing.
    */
  var errors: js.Any
  /**
    * The resulting facet information for any facets that were specified
    * in the search query.
    */
  var facets: js.Any
  /**
    * The maximum score out of all the results in this query.
    */
  var maxScore: Double
  /**
    * The status information for this query, includes properties
    * such as total, failed, and successful.
    */
  var status: js.Any
  /**
    * The time spent processing this query.
    */
  var took: Double
  /**
    * The total number of hits that were available for this search query.
    */
  var totalHits: Double
}

object Meta {
  @scala.inline
  def apply(errors: js.Any, facets: js.Any, maxScore: Double, status: js.Any, took: Double, totalHits: Double): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], maxScore = maxScore.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], totalHits = totalHits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Meta]
  }
}

