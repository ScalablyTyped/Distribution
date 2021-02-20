package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the endpoints.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.native
}
object DescribeVpcEndpointsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointsResultMutableBuilder[Self <: DescribeVpcEndpointsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcEndpoints(value: VpcEndpointSet): Self = StObject.set(x, "VpcEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointsUndefined: Self = StObject.set(x, "VpcEndpoints", js.undefined)
    
    @scala.inline
    def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "VpcEndpoints", js.Array(value :_*))
  }
}
