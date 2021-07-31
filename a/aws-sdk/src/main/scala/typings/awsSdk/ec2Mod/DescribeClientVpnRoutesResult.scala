package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnRoutesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * Information about the Client VPN endpoint routes.
    */
  var Routes: js.UndefOr[ClientVpnRouteSet] = js.undefined
}
object DescribeClientVpnRoutesResult {
  
  @scala.inline
  def apply(): DescribeClientVpnRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnRoutesResult]
  }
  
  @scala.inline
  implicit class DescribeClientVpnRoutesResultMutableBuilder[Self <: DescribeClientVpnRoutesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoutes(value: ClientVpnRouteSet): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: ClientVpnRoute*): Self = StObject.set(x, "Routes", js.Array(value :_*))
  }
}
