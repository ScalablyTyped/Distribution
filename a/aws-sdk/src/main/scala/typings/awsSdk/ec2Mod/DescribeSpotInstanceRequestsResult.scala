package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotInstanceRequestsResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
}
object DescribeSpotInstanceRequestsResult {
  
  @scala.inline
  def apply(): DescribeSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotInstanceRequestsResult]
  }
  
  @scala.inline
  implicit class DescribeSpotInstanceRequestsResultMutableBuilder[Self <: DescribeSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = StObject.set(x, "SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestsUndefined: Self = StObject.set(x, "SpotInstanceRequests", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = StObject.set(x, "SpotInstanceRequests", js.Array(value :_*))
  }
}
