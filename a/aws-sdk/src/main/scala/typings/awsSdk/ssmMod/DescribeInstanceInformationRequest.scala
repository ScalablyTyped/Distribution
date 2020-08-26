package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this Filters data type instead of InstanceInformationFilterList, which is deprecated.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.native
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the Filters data type. Filters enables you to return instance information by filtering based on tags applied to managed instances.  Attempting to use InstanceInformationFilterList and Filters leads to an exception error.  
    */
  var InstanceInformationFilterList: js.UndefOr[typings.awsSdk.ssmMod.InstanceInformationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceInformationRequest {
  @scala.inline
  def apply(): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
  @scala.inline
  implicit class DescribeInstanceInformationRequestOps[Self <: DescribeInstanceInformationRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: InstanceInformationStringFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: InstanceInformationStringFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setInstanceInformationFilterListVarargs(value: InstanceInformationFilter*): Self = this.set("InstanceInformationFilterList", js.Array(value :_*))
    @scala.inline
    def setInstanceInformationFilterList(value: InstanceInformationFilterList): Self = this.set("InstanceInformationFilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInformationFilterList: Self = this.set("InstanceInformationFilterList", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResultsEC2Compatible): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

