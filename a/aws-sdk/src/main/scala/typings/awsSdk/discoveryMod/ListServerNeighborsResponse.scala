package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServerNeighborsResponse extends StObject {
  
  /**
    * Count of distinct servers that are one hop away from the given server.
    */
  var knownDependencyCount: js.UndefOr[Long] = js.undefined
  
  /**
    * List of distinct servers that are one hop away from the given server.
    */
  var neighbors: NeighborDetailsList
  
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListServerNeighborsResponse {
  
  inline def apply(neighbors: NeighborDetailsList): ListServerNeighborsResponse = {
    val __obj = js.Dynamic.literal(neighbors = neighbors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsResponse]
  }
  
  extension [Self <: ListServerNeighborsResponse](x: Self) {
    
    inline def setKnownDependencyCount(value: Long): Self = StObject.set(x, "knownDependencyCount", value.asInstanceOf[js.Any])
    
    inline def setKnownDependencyCountUndefined: Self = StObject.set(x, "knownDependencyCount", js.undefined)
    
    inline def setNeighbors(value: NeighborDetailsList): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
    
    inline def setNeighborsVarargs(value: NeighborConnectionDetail*): Self = StObject.set(x, "neighbors", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
