package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatement extends js.Object {
  /**
    * Setting that indicates how to aggregate the request counts. Currently, you must set this to IP. The request counts are aggregated on IP addresses. 
    */
  var AggregateKeyType: RateBasedStatementAggregateKeyType = js.native
  /**
    * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a ScopDownStatement, this limit is applied only to the requests that match the statement.
    */
  var Limit: RateLimit = js.native
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement.
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.native
}

object RateBasedStatement {
  @scala.inline
  def apply(
    AggregateKeyType: RateBasedStatementAggregateKeyType,
    Limit: RateLimit,
    ScopeDownStatement: Statement = null
  ): RateBasedStatement = {
    val __obj = js.Dynamic.literal(AggregateKeyType = AggregateKeyType.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    if (ScopeDownStatement != null) __obj.updateDynamic("ScopeDownStatement")(ScopeDownStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedStatement]
  }
}

