package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverRulesResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * If more than MaxResults resolver rules match the specified criteria, you can submit another ListResolverRules request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  /**
    * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
    */
  var ResolverRules: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRules] = js.native
}

object ListResolverRulesResponse {
  @scala.inline
  def apply(): ListResolverRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRulesResponse]
  }
  @scala.inline
  implicit class ListResolverRulesResponseOps[Self <: ListResolverRulesResponse] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResolverRulesVarargs(value: ResolverRule*): Self = this.set("ResolverRules", js.Array(value :_*))
    @scala.inline
    def setResolverRules(value: ResolverRules): Self = this.set("ResolverRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverRules: Self = this.set("ResolverRules", js.undefined)
  }
  
}

