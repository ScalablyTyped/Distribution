package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcPeeringConnectionsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the VPC peering connections.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}
object DescribeVpcPeeringConnectionsResult {
  
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsResultOps[Self <: DescribeVpcPeeringConnectionsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = this.set("VpcPeeringConnections", js.Array(value :_*))
    
    @scala.inline
    def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = this.set("VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnections: Self = this.set("VpcPeeringConnections", js.undefined)
  }
}
