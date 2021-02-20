package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcPeeringConnectionsResult extends StObject {
  
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
  implicit class DescribeVpcPeeringConnectionsResultMutableBuilder[Self <: DescribeVpcPeeringConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = StObject.set(x, "VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionsUndefined: Self = StObject.set(x, "VpcPeeringConnections", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = StObject.set(x, "VpcPeeringConnections", js.Array(value :_*))
  }
}
