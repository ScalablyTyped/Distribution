package typings.couchbase.mod.Bucket.FtsQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a search query response.
  */
@js.native
trait Meta extends js.Object {
  /**
    * Any non-fatal errors that occurred during query processing.
    */
  var errors: js.Any = js.native
  /**
    * The resulting facet information for any facets that were specified
    * in the search query.
    */
  var facets: js.Any = js.native
  /**
    * The maximum score out of all the results in this query.
    */
  var maxScore: Double = js.native
  /**
    * The status information for this query, includes properties
    * such as total, failed, and successful.
    */
  var status: js.Any = js.native
  /**
    * The time spent processing this query.
    */
  var took: Double = js.native
  /**
    * The total number of hits that were available for this search query.
    */
  var totalHits: Double = js.native
}

object Meta {
  @scala.inline
  def apply(errors: js.Any, facets: js.Any, maxScore: Double, status: js.Any, took: Double, totalHits: Double): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], maxScore = maxScore.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], totalHits = totalHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacets(value: js.Any): Self = this.set("facets", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxScore(value: Double): Self = this.set("maxScore", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTook(value: Double): Self = this.set("took", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalHits(value: Double): Self = this.set("totalHits", value.asInstanceOf[js.Any])
  }
  
}

