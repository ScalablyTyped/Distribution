package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticGpusRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Elastic Graphics accelerator IDs.
    */
  var ElasticGpuIds: js.UndefOr[ElasticGpuIdSet] = js.native
  /**
    * The filters.    availability-zone - The Availability Zone in which the Elastic Graphics accelerator resides.    elastic-gpu-health - The status of the Elastic Graphics accelerator (OK | IMPAIRED).    elastic-gpu-state - The state of the Elastic Graphics accelerator (ATTACHED).    elastic-gpu-type - The type of Elastic Graphics accelerator; for example, eg1.medium.    instance-id - The ID of the instance to which the Elastic Graphics accelerator is associated.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000.
    */
  var MaxResults: js.UndefOr[DescribeElasticGpusMaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeElasticGpusRequest {
  @scala.inline
  def apply(): DescribeElasticGpusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticGpusRequest]
  }
  @scala.inline
  implicit class DescribeElasticGpusRequestOps[Self <: DescribeElasticGpusRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setElasticGpuIdsVarargs(value: ElasticGpuId*): Self = this.set("ElasticGpuIds", js.Array(value :_*))
    @scala.inline
    def setElasticGpuIds(value: ElasticGpuIdSet): Self = this.set("ElasticGpuIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuIds: Self = this.set("ElasticGpuIds", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: DescribeElasticGpusMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

