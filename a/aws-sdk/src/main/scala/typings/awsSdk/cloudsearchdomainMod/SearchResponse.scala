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
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFacets(value: Facets): Self = this.set("facets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacets: Self = this.set("facets", js.undefined)
    @scala.inline
    def setHits(value: Hits): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHits: Self = this.set("hits", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setStatus(value: SearchStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

