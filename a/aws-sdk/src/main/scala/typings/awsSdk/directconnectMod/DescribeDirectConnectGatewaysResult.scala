package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewaysResult extends StObject {
  
  /**
    * The Direct Connect gateways.
    */
  var directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.native
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeDirectConnectGatewaysResult {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewaysResultMutableBuilder[Self <: DescribeDirectConnectGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGateways(value: DirectConnectGatewayList): Self = StObject.set(x, "directConnectGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewaysUndefined: Self = StObject.set(x, "directConnectGateways", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewaysVarargs(value: DirectConnectGateway*): Self = StObject.set(x, "directConnectGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
