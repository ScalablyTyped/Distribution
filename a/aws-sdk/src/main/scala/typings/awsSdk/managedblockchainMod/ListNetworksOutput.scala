package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNetworksOutput extends js.Object {
  
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
  implicit class ListNetworksOutputOps[Self <: ListNetworksOutput] (val x: Self) extends AnyVal {
    
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
    def setNetworksVarargs(value: NetworkSummary*): Self = this.set("Networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: NetworkSummaryList): Self = this.set("Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("Networks", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
