package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskDefinitionsRequest extends js.Object {
  /**
    * The full family name with which to filter the ListTaskDefinitions results. Specifying a familyPrefix limits the listed task definitions to task definition revisions that belong to that family.
    */
  var familyPrefix: js.UndefOr[String] = js.native
  /**
    * The maximum number of task definition results returned by ListTaskDefinitions in paginated output. When this parameter is used, ListTaskDefinitions only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListTaskDefinitions request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListTaskDefinitions returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The nextToken value returned from a ListTaskDefinitions request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The order in which to sort the results. Valid values are ASC and DESC. By default (ASC), task definitions are listed lexicographically by family name and in ascending numerical order by revision so that the newest task definitions in a family are listed last. Setting this parameter to DESC reverses the sort order on family name and revision so that the newest task definitions in a family are listed first.
    */
  var sort: js.UndefOr[SortOrder] = js.native
  /**
    * The task definition status with which to filter the ListTaskDefinitions results. By default, only ACTIVE task definitions are listed. By setting this parameter to INACTIVE, you can view task definitions that are INACTIVE as long as an active task or service still references them. If you paginate the resulting output, be sure to keep the status value constant in each subsequent request.
    */
  var status: js.UndefOr[TaskDefinitionStatus] = js.native
}

object ListTaskDefinitionsRequest {
  @scala.inline
  def apply(): ListTaskDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionsRequest]
  }
  @scala.inline
  implicit class ListTaskDefinitionsRequestOps[Self <: ListTaskDefinitionsRequest] (val x: Self) extends AnyVal {
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
    def setFamilyPrefix(value: String): Self = this.set("familyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyPrefix: Self = this.set("familyPrefix", js.undefined)
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSort(value: SortOrder): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStatus(value: TaskDefinitionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

