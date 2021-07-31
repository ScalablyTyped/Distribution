package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointConnectionsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more VPC endpoint connections.
    */
  var VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet] = js.undefined
}
object DescribeVpcEndpointConnectionsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointConnectionsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointConnectionsResultMutableBuilder[Self <: DescribeVpcEndpointConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcEndpointConnections(value: VpcEndpointConnectionSet): Self = StObject.set(x, "VpcEndpointConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointConnectionsUndefined: Self = StObject.set(x, "VpcEndpointConnections", js.undefined)
    
    @scala.inline
    def setVpcEndpointConnectionsVarargs(value: VpcEndpointConnection*): Self = StObject.set(x, "VpcEndpointConnections", js.Array(value :_*))
  }
}
