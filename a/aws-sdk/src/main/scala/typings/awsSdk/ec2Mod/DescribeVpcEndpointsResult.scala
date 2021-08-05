package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the endpoints.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.undefined
}
object DescribeVpcEndpointsResult {
  
  inline def apply(): DescribeVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointsResult]
  }
  
  extension [Self <: DescribeVpcEndpointsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcEndpoints(value: VpcEndpointSet): Self = StObject.set(x, "VpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointsUndefined: Self = StObject.set(x, "VpcEndpoints", js.undefined)
    
    inline def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "VpcEndpoints", js.Array(value :_*))
  }
}
