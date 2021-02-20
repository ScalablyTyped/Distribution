package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNetworksOutput extends StObject {
  
  /**
    * An array of NetworkSummary objects that contain configuration properties for each network.
    */
  var Networks: js.UndefOr[NetworkSummaryList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListNetworksOutput {
  
  @scala.inline
  def apply(): ListNetworksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworksOutput]
  }
  
  @scala.inline
  implicit class ListNetworksOutputMutableBuilder[Self <: ListNetworksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworks(value: NetworkSummaryList): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "Networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkSummary*): Self = StObject.set(x, "Networks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
