package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOpsItemsRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[OpsItemMaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more filters to limit the response.   Key: CreatedTime Operations: GreaterThan, LessThan   Key: LastModifiedBy Operations: Contains, Equals   Key: LastModifiedTime Operations: GreaterThan, LessThan   Key: Priority Operations: Equals   Key: Source Operations: Contains, Equals   Key: Status Operations: Equals   Key: Title Operations: Contains   Key: OperationalData* Operations: Equals   Key: OperationalDataKey Operations: Equals   Key: OperationalDataValue Operations: Equals, Contains   Key: OpsItemId Operations: Equals   Key: ResourceId Operations: Contains   Key: AutomationId Operations: Equals   *If you filter the response by using the OperationalData operator, specify a key-value pair by using the following JSON format: {"key":"key_name","value":"a_value"}
    */
  var OpsItemFilters: js.UndefOr[typings.awsSdk.ssmMod.OpsItemFilters] = js.native
}

object DescribeOpsItemsRequest {
  @scala.inline
  def apply(): DescribeOpsItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOpsItemsRequest]
  }
  @scala.inline
  implicit class DescribeOpsItemsRequestOps[Self <: DescribeOpsItemsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: OpsItemMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOpsItemFiltersVarargs(value: OpsItemFilter*): Self = this.set("OpsItemFilters", js.Array(value :_*))
    @scala.inline
    def setOpsItemFilters(value: OpsItemFilters): Self = this.set("OpsItemFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItemFilters: Self = this.set("OpsItemFilters", js.undefined)
  }
  
}

