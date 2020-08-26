package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInboundCrossClusterSearchConnectionsResponse extends js.Object {
  /**
    * Consists of list of InboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[InboundCrossClusterSearchConnections] = js.native
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object DescribeInboundCrossClusterSearchConnectionsResponse {
  @scala.inline
  def apply(): DescribeInboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInboundCrossClusterSearchConnectionsResponse]
  }
  @scala.inline
  implicit class DescribeInboundCrossClusterSearchConnectionsResponseOps[Self <: DescribeInboundCrossClusterSearchConnectionsResponse] (val x: Self) extends AnyVal {
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
    def setCrossClusterSearchConnectionsVarargs(value: InboundCrossClusterSearchConnection*): Self = this.set("CrossClusterSearchConnections", js.Array(value :_*))
    @scala.inline
    def setCrossClusterSearchConnections(value: InboundCrossClusterSearchConnections): Self = this.set("CrossClusterSearchConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossClusterSearchConnections: Self = this.set("CrossClusterSearchConnections", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

