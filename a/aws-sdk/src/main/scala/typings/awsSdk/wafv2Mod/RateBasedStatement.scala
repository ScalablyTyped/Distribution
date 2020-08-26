package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatement extends js.Object {
  /**
    * Setting that indicates how to aggregate the request counts. The options are the following:   IP - Aggregate the request counts on the IP address from the web request origin.   FORWARDED_IP - Aggregate the request counts on the first IP address in an HTTP header. If you use this, configure the ForwardedIPConfig, to specify the header to use.   
    */
  var AggregateKeyType: RateBasedStatementAggregateKeyType = js.native
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.  This is required if AggregateKeyType is set to FORWARDED_IP.
    */
  var ForwardedIPConfig: js.UndefOr[typings.awsSdk.wafv2Mod.ForwardedIPConfig] = js.native
  /**
    * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a ScopeDownStatement, this limit is applied only to the requests that match the statement.
    */
  var Limit: RateLimit = js.native
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement.
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.native
}

object RateBasedStatement {
  @scala.inline
  def apply(AggregateKeyType: RateBasedStatementAggregateKeyType, Limit: RateLimit): RateBasedStatement = {
    val __obj = js.Dynamic.literal(AggregateKeyType = AggregateKeyType.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedStatement]
  }
  @scala.inline
  implicit class RateBasedStatementOps[Self <: RateBasedStatement] (val x: Self) extends AnyVal {
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
    def setAggregateKeyType(value: RateBasedStatementAggregateKeyType): Self = this.set("AggregateKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: RateLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardedIPConfig(value: ForwardedIPConfig): Self = this.set("ForwardedIPConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedIPConfig: Self = this.set("ForwardedIPConfig", js.undefined)
    @scala.inline
    def setScopeDownStatement(value: Statement): Self = this.set("ScopeDownStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeDownStatement: Self = this.set("ScopeDownStatement", js.undefined)
  }
  
}

