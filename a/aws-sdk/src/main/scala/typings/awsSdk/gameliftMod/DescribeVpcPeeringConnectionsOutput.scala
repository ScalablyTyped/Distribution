package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcPeeringConnectionsOutput extends js.Object {
  
  /**
    * A collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}
object DescribeVpcPeeringConnectionsOutput {
  
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
  
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsOutputOps[Self <: DescribeVpcPeeringConnectionsOutput] (val x: Self) extends AnyVal {
    
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
    def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = this.set("VpcPeeringConnections", js.Array(value :_*))
    
    @scala.inline
    def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = this.set("VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnections: Self = this.set("VpcPeeringConnections", js.undefined)
  }
}
