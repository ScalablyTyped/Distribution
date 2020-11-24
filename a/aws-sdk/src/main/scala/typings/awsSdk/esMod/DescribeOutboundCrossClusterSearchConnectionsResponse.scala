package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOutboundCrossClusterSearchConnectionsResponse extends js.Object {
  
  /**
    * Consists of list of OutboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[OutboundCrossClusterSearchConnections] = js.native
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}
object DescribeOutboundCrossClusterSearchConnectionsResponse {
  
  @scala.inline
  def apply(): DescribeOutboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOutboundCrossClusterSearchConnectionsResponse]
  }
  
  @scala.inline
  implicit class DescribeOutboundCrossClusterSearchConnectionsResponseOps[Self <: DescribeOutboundCrossClusterSearchConnectionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCrossClusterSearchConnectionsVarargs(value: OutboundCrossClusterSearchConnection*): Self = this.set("CrossClusterSearchConnections", js.Array(value :_*))
    
    @scala.inline
    def setCrossClusterSearchConnections(value: OutboundCrossClusterSearchConnections): Self = this.set("CrossClusterSearchConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossClusterSearchConnections: Self = this.set("CrossClusterSearchConnections", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
