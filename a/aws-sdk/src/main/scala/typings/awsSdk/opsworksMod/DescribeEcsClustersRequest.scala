package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEcsClustersRequest extends js.Object {
  /**
    * A list of ARNs, one for each cluster to be described.
    */
  var EcsClusterArns: js.UndefOr[Strings] = js.native
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * If the previous paginated request did not return all of the remaining results, the response object'sNextToken parameter value is set to a token. To retrieve the next set of results, call DescribeEcsClusters again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A stack ID. DescribeEcsClusters returns a description of the cluster that is registered with the stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeEcsClustersRequest {
  @scala.inline
  def apply(): DescribeEcsClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersRequest]
  }
  @scala.inline
  implicit class DescribeEcsClustersRequestOps[Self <: DescribeEcsClustersRequest] (val x: Self) extends AnyVal {
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
    def setEcsClusterArnsVarargs(value: String*): Self = this.set("EcsClusterArns", js.Array(value :_*))
    @scala.inline
    def setEcsClusterArns(value: Strings): Self = this.set("EcsClusterArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterArns: Self = this.set("EcsClusterArns", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

