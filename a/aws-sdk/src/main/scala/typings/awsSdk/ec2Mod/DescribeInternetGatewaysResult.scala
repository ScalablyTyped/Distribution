package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInternetGatewaysResult extends StObject {
  
  /**
    * Information about one or more internet gateways.
    */
  var InternetGateways: js.UndefOr[InternetGatewayList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInternetGatewaysResult {
  
  @scala.inline
  def apply(): DescribeInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInternetGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeInternetGatewaysResultMutableBuilder[Self <: DescribeInternetGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInternetGateways(value: InternetGatewayList): Self = StObject.set(x, "InternetGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternetGatewaysUndefined: Self = StObject.set(x, "InternetGateways", js.undefined)
    
    @scala.inline
    def setInternetGatewaysVarargs(value: InternetGateway*): Self = StObject.set(x, "InternetGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
