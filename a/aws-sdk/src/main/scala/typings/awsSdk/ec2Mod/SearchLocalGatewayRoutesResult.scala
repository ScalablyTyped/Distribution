package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchLocalGatewayRoutesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[LocalGatewayRouteList] = js.undefined
}
object SearchLocalGatewayRoutesResult {
  
  @scala.inline
  def apply(): SearchLocalGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchLocalGatewayRoutesResult]
  }
  
  @scala.inline
  implicit class SearchLocalGatewayRoutesResultMutableBuilder[Self <: SearchLocalGatewayRoutesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoutes(value: LocalGatewayRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: LocalGatewayRoute*): Self = StObject.set(x, "Routes", js.Array(value :_*))
  }
}
