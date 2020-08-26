package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePoliciesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principal.
    */
  var principal: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: ResourceArnList = js.native
}

object GetResourcePoliciesRequest {
  @scala.inline
  def apply(resourceArns: ResourceArnList): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
  @scala.inline
  implicit class GetResourcePoliciesRequestOps[Self <: GetResourcePoliciesRequest] (val x: Self) extends AnyVal {
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
    def setResourceArnsVarargs(value: String*): Self = this.set("resourceArns", js.Array(value :_*))
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("resourceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPrincipal(value: String): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
  }
  
}

