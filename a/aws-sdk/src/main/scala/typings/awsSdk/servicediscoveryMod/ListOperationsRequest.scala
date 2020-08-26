package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsRequest extends js.Object {
  /**
    * A complex type that contains specifications for the operations that you want to list, for example, operations that you started between a specified start date and end date. If you specify more than one filter, an operation must match all filters to be returned by ListOperations.
    */
  var Filters: js.UndefOr[OperationFilters] = js.native
  /**
    * The maximum number of items that you want AWS Cloud Map to return in the response to a ListOperations request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 operations.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicediscoveryMod.MaxResults] = js.native
  /**
    * For the first ListOperations request, omit this value. If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.native
}

object ListOperationsRequest {
  @scala.inline
  def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  @scala.inline
  implicit class ListOperationsRequestOps[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: OperationFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: OperationFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

