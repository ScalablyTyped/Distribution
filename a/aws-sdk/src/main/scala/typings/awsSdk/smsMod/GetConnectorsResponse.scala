package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectorsResponse extends js.Object {
  
  /**
    * Information about the registered connectors.
    */
  var connectorList: js.UndefOr[ConnectorList] = js.native
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetConnectorsResponse {
  
  @scala.inline
  def apply(): GetConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectorsResponse]
  }
  
  @scala.inline
  implicit class GetConnectorsResponseOps[Self <: GetConnectorsResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectorListVarargs(value: Connector*): Self = this.set("connectorList", js.Array(value :_*))
    
    @scala.inline
    def setConnectorList(value: ConnectorList): Self = this.set("connectorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorList: Self = this.set("connectorList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
