package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayRouteTablesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the transit gateway route tables.
    */
  var TransitGatewayRouteTables: js.UndefOr[TransitGatewayRouteTableList] = js.undefined
}
object DescribeTransitGatewayRouteTablesResult {
  
  @scala.inline
  def apply(): DescribeTransitGatewayRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayRouteTablesResultMutableBuilder[Self <: DescribeTransitGatewayRouteTablesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTables(value: TransitGatewayRouteTableList): Self = StObject.set(x, "TransitGatewayRouteTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTablesUndefined: Self = StObject.set(x, "TransitGatewayRouteTables", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTablesVarargs(value: TransitGatewayRouteTable*): Self = StObject.set(x, "TransitGatewayRouteTables", js.Array(value :_*))
  }
}
