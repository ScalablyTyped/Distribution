package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoveredResourceCountsResponse extends StObject {
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The list of ResourceCount objects. Each object is listed in descending order by the number of resources.
    */
  var resourceCounts: js.UndefOr[ResourceCounts] = js.native
  
  /**
    * The total number of resources that AWS Config is recording in the region for your account. If you specify resource types in the request, AWS Config returns only the total number of resources for those resource types.  Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.   You make a call to the GetDiscoveredResourceCounts action and specify the resource type, "AWS::EC2::Instances", in the request.   AWS Config returns 25 for totalDiscoveredResources.  
    */
  var totalDiscoveredResources: js.UndefOr[Long] = js.native
}
object GetDiscoveredResourceCountsResponse {
  
  @scala.inline
  def apply(): GetDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoveredResourceCountsResponse]
  }
  
  @scala.inline
  implicit class GetDiscoveredResourceCountsResponseMutableBuilder[Self <: GetDiscoveredResourceCountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceCounts(value: ResourceCounts): Self = StObject.set(x, "resourceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCountsUndefined: Self = StObject.set(x, "resourceCounts", js.undefined)
    
    @scala.inline
    def setResourceCountsVarargs(value: ResourceCount*): Self = StObject.set(x, "resourceCounts", js.Array(value :_*))
    
    @scala.inline
    def setTotalDiscoveredResources(value: Long): Self = StObject.set(x, "totalDiscoveredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDiscoveredResourcesUndefined: Self = StObject.set(x, "totalDiscoveredResources", js.undefined)
  }
}
