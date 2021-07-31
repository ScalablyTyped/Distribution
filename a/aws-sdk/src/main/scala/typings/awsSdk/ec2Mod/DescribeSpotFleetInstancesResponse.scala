package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotFleetInstancesResponse extends StObject {
  
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}
object DescribeSpotFleetInstancesResponse {
  
  @scala.inline
  def apply(): DescribeSpotFleetInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetInstancesResponse]
  }
  
  @scala.inline
  implicit class DescribeSpotFleetInstancesResponseMutableBuilder[Self <: DescribeSpotFleetInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveInstances(value: ActiveInstanceSet): Self = StObject.set(x, "ActiveInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveInstancesUndefined: Self = StObject.set(x, "ActiveInstances", js.undefined)
    
    @scala.inline
    def setActiveInstancesVarargs(value: ActiveInstance*): Self = StObject.set(x, "ActiveInstances", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
