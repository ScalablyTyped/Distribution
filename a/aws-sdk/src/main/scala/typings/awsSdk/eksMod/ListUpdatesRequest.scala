package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUpdatesRequest extends StObject {
  
  /**
    * The maximum number of update results returned by ListUpdates in paginated output. When you use this parameter, ListUpdates returns only maxResults results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListUpdates request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListUpdates returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.native
  
  /**
    * The name of the Amazon EKS cluster to list updates for.
    */
  var name: String = js.native
  
  /**
    * The nextToken value returned from a previous paginated ListUpdates request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon EKS managed node group to list updates for.
    */
  var nodegroupName: js.UndefOr[String] = js.native
}
object ListUpdatesRequest {
  
  @scala.inline
  def apply(name: String): ListUpdatesRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUpdatesRequest]
  }
  
  @scala.inline
  implicit class ListUpdatesRequestMutableBuilder[Self <: ListUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListUpdatesRequestMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupNameUndefined: Self = StObject.set(x, "nodegroupName", js.undefined)
  }
}
