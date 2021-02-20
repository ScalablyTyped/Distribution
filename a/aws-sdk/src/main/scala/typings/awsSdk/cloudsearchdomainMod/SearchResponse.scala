package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse extends StObject {
  
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
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacets(value: Facets): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    @scala.inline
    def setHits(value: Hits): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatus(value: SearchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
