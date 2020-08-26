package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredResourceCountsResponse extends js.Object {
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
  implicit class GetDiscoveredResourceCountsResponseOps[Self <: GetDiscoveredResourceCountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourceCountsVarargs(value: ResourceCount*): Self = this.set("resourceCounts", js.Array(value :_*))
    @scala.inline
    def setResourceCounts(value: ResourceCounts): Self = this.set("resourceCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCounts: Self = this.set("resourceCounts", js.undefined)
    @scala.inline
    def setTotalDiscoveredResources(value: Long): Self = this.set("totalDiscoveredResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDiscoveredResources: Self = this.set("totalDiscoveredResources", js.undefined)
  }
  
}

