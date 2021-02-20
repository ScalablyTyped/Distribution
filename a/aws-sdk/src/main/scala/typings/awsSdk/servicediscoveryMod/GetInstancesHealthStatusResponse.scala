package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstancesHealthStatusResponse extends StObject {
  
  /**
    * If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.native
  
  /**
    * A complex type that contains the IDs and the health status of the instances that you specified in the GetInstancesHealthStatus request.
    */
  var Status: js.UndefOr[InstanceHealthStatusMap] = js.native
}
object GetInstancesHealthStatusResponse {
  
  @scala.inline
  def apply(): GetInstancesHealthStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancesHealthStatusResponse]
  }
  
  @scala.inline
  implicit class GetInstancesHealthStatusResponseMutableBuilder[Self <: GetInstancesHealthStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceHealthStatusMap): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
