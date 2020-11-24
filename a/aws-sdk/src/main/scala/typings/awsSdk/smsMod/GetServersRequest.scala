package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServersRequest extends js.Object {
  
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The server addresses.
    */
  var vmServerAddressList: js.UndefOr[VmServerAddressList] = js.native
}
object GetServersRequest {
  
  @scala.inline
  def apply(): GetServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServersRequest]
  }
  
  @scala.inline
  implicit class GetServersRequestOps[Self <: GetServersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setVmServerAddressListVarargs(value: VmServerAddress*): Self = this.set("vmServerAddressList", js.Array(value :_*))
    
    @scala.inline
    def setVmServerAddressList(value: VmServerAddressList): Self = this.set("vmServerAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmServerAddressList: Self = this.set("vmServerAddressList", js.undefined)
  }
}
