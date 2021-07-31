package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcPeeringConnectionsOutput extends StObject {
  
  /**
    * A collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
}
object DescribeVpcPeeringConnectionsOutput {
  
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
  
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsOutputMutableBuilder[Self <: DescribeVpcPeeringConnectionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = StObject.set(x, "VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionsUndefined: Self = StObject.set(x, "VpcPeeringConnections", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = StObject.set(x, "VpcPeeringConnections", js.Array(value :_*))
  }
}
