package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServerNeighborsResponse extends StObject {
  
  /**
    * Count of distinct servers that are one hop away from the given server.
    */
  var knownDependencyCount: js.UndefOr[Long] = js.native
  
  /**
    * List of distinct servers that are one hop away from the given server.
    */
  var neighbors: NeighborDetailsList = js.native
  
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListServerNeighborsResponse {
  
  @scala.inline
  def apply(neighbors: NeighborDetailsList): ListServerNeighborsResponse = {
    val __obj = js.Dynamic.literal(neighbors = neighbors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsResponse]
  }
  
  @scala.inline
  implicit class ListServerNeighborsResponseMutableBuilder[Self <: ListServerNeighborsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnownDependencyCount(value: Long): Self = StObject.set(x, "knownDependencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownDependencyCountUndefined: Self = StObject.set(x, "knownDependencyCount", js.undefined)
    
    @scala.inline
    def setNeighbors(value: NeighborDetailsList): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborsVarargs(value: NeighborConnectionDetail*): Self = StObject.set(x, "neighbors", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
