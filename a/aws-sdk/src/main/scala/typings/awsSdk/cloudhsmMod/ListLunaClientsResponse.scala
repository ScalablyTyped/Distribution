package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLunaClientsResponse extends js.Object {
  
  /**
    * The list of clients.
    */
  var ClientList: typings.awsSdk.cloudhsmMod.ClientList = js.native
  
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListLunaClientsResponse {
  
  @scala.inline
  def apply(ClientList: ClientList): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
  
  @scala.inline
  implicit class ListLunaClientsResponseOps[Self <: ListLunaClientsResponse] (val x: Self) extends AnyVal {
    
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
    def setClientListVarargs(value: ClientArn*): Self = this.set("ClientList", js.Array(value :_*))
    
    @scala.inline
    def setClientList(value: ClientList): Self = this.set("ClientList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
