package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueryLoggingConfigsResponse extends js.Object {
  /**
    * If a response includes the last of the query logging configurations that are associated with the current AWS account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListQueryLoggingConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array that contains one QueryLoggingConfig element for each configuration for DNS query logging that is associated with the current AWS account.
    */
  var QueryLoggingConfigs: typings.awsSdk.route53Mod.QueryLoggingConfigs = js.native
}

object ListQueryLoggingConfigsResponse {
  @scala.inline
  def apply(QueryLoggingConfigs: QueryLoggingConfigs): ListQueryLoggingConfigsResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfigs = QueryLoggingConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueryLoggingConfigsResponse]
  }
  @scala.inline
  implicit class ListQueryLoggingConfigsResponseOps[Self <: ListQueryLoggingConfigsResponse] (val x: Self) extends AnyVal {
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
    def setQueryLoggingConfigsVarargs(value: QueryLoggingConfig*): Self = this.set("QueryLoggingConfigs", js.Array(value :_*))
    @scala.inline
    def setQueryLoggingConfigs(value: QueryLoggingConfigs): Self = this.set("QueryLoggingConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

