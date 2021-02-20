package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualInterfaceTestHistoryResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceTestHistory: js.UndefOr[VirtualInterfaceTestHistoryList] = js.native
}
object ListVirtualInterfaceTestHistoryResponse {
  
  @scala.inline
  def apply(): ListVirtualInterfaceTestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryResponse]
  }
  
  @scala.inline
  implicit class ListVirtualInterfaceTestHistoryResponseMutableBuilder[Self <: ListVirtualInterfaceTestHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceTestHistory(value: VirtualInterfaceTestHistoryList): Self = StObject.set(x, "virtualInterfaceTestHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceTestHistoryUndefined: Self = StObject.set(x, "virtualInterfaceTestHistory", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceTestHistoryVarargs(value: VirtualInterfaceTestHistory*): Self = StObject.set(x, "virtualInterfaceTestHistory", js.Array(value :_*))
  }
}
