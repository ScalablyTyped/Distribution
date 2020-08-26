package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceSharesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner = js.native
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
  /**
    * The status of the resource share.
    */
  var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.native
  /**
    * One or more tag filters.
    */
  var tagFilters: js.UndefOr[TagFilters] = js.native
}

object GetResourceSharesRequest {
  @scala.inline
  def apply(resourceOwner: ResourceOwner): GetResourceSharesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSharesRequest]
  }
  @scala.inline
  implicit class GetResourceSharesRequestOps[Self <: GetResourceSharesRequest] (val x: Self) extends AnyVal {
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
    def setResourceOwner(value: ResourceOwner): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = this.set("resourceShareArns", js.Array(value :_*))
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = this.set("resourceShareArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArns: Self = this.set("resourceShareArns", js.undefined)
    @scala.inline
    def setResourceShareStatus(value: ResourceShareStatus): Self = this.set("resourceShareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareStatus: Self = this.set("resourceShareStatus", js.undefined)
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = this.set("tagFilters", js.Array(value :_*))
    @scala.inline
    def setTagFilters(value: TagFilters): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
  }
  
}

