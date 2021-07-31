package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewaysResult extends StObject {
  
  /**
    * Information about the local gateways.
    */
  var LocalGateways: js.UndefOr[LocalGatewaySet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewaysResult {
  
  @scala.inline
  def apply(): DescribeLocalGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewaysResultMutableBuilder[Self <: DescribeLocalGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGateways(value: LocalGatewaySet): Self = StObject.set(x, "LocalGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewaysUndefined: Self = StObject.set(x, "LocalGateways", js.undefined)
    
    @scala.inline
    def setLocalGatewaysVarargs(value: LocalGateway*): Self = StObject.set(x, "LocalGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
