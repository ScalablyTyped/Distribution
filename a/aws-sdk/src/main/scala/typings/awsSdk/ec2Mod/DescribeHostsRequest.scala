package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostsRequest extends js.Object {
  /**
    * The filters.    auto-placement - Whether auto-placement is enabled or disabled (on | off).    availability-zone - The Availability Zone of the host.    client-token - The idempotency token that you provided when you allocated the host.    host-reservation-id - The ID of the reservation assigned to this host.    instance-type - The instance type size that the Dedicated Host is configured to support.    state - The allocation state of the Dedicated Host (available | under-assessment | permanent-failure | released | released-permanent-failure).    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
    */
  var HostIds: js.UndefOr[RequestHostIdList] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error. You cannot specify this parameter and the host IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeHostsRequest {
  @scala.inline
  def apply(
    Filter: FilterList = null,
    HostIds: RequestHostIdList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeHostsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (HostIds != null) __obj.updateDynamic("HostIds")(HostIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostsRequest]
  }
}

