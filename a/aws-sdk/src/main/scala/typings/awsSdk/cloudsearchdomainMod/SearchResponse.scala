package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResponse extends js.Object {
  /**
    * The requested facet information.
    */
  var facets: js.UndefOr[Facets] = js.native
  /**
    * The documents that match the search criteria.
    */
  var hits: js.UndefOr[Hits] = js.native
  /**
    * The requested field statistics information.
    */
  var stats: js.UndefOr[Stats] = js.native
  /**
    * The status information returned for the search request.
    */
  var status: js.UndefOr[SearchStatus] = js.native
}

object SearchResponse {
  @scala.inline
  def apply(facets: Facets = null, hits: Hits = null, stats: Stats = null, status: SearchStatus = null): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (hits != null) __obj.updateDynamic("hits")(hits.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
}

