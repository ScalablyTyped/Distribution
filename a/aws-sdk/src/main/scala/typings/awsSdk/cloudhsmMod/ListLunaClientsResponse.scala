package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLunaClientsResponse extends StObject {
  
  /**
    * The list of clients.
    */
  var ClientList: typings.awsSdk.cloudhsmMod.ClientList
  
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListLunaClientsResponse {
  
  @scala.inline
  def apply(ClientList: ClientList): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
  
  @scala.inline
  implicit class ListLunaClientsResponseMutableBuilder[Self <: ListLunaClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientList(value: ClientList): Self = StObject.set(x, "ClientList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientListVarargs(value: ClientArn*): Self = StObject.set(x, "ClientList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
