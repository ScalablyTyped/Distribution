package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServerNeighborsResponse extends js.Object {
  
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
  implicit class ListServerNeighborsResponseOps[Self <: ListServerNeighborsResponse] (val x: Self) extends AnyVal {
    
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
    def setNeighborsVarargs(value: NeighborConnectionDetail*): Self = this.set("neighbors", js.Array(value :_*))
    
    @scala.inline
    def setNeighbors(value: NeighborDetailsList): Self = this.set("neighbors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownDependencyCount(value: Long): Self = this.set("knownDependencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnownDependencyCount: Self = this.set("knownDependencyCount", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
