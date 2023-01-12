package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateBasedStatement extends StObject {
  
  /**
    * Setting that indicates how to aggregate the request counts. The options are the following:   IP - Aggregate the request counts on the IP address from the web request origin.   FORWARDED_IP - Aggregate the request counts on the first IP address in an HTTP header. If you use this, configure the ForwardedIPConfig, to specify the header to use.   
    */
  var AggregateKeyType: RateBasedStatementAggregateKeyType
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.  This is required if AggregateKeyType is set to FORWARDED_IP.
    */
  var ForwardedIPConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ForwardedIPConfig] = js.undefined
  
  /**
    * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a ScopeDownStatement, this limit is applied only to the requests that match the statement.
    */
  var Limit: RateLimit
  
  /**
    * An optional nested statement that narrows the scope of the web requests that are evaluated by the rate-based statement. Requests are only tracked by the rate-based statement if they match the scope-down statement. You can use any nestable Statement in the scope-down statement, and you can nest statements at any level, the same as you can for a rule statement. 
    */
  var ScopeDownStatement: js.UndefOr[Statement] = js.undefined
}
object RateBasedStatement {
  
  inline def apply(AggregateKeyType: RateBasedStatementAggregateKeyType, Limit: RateLimit): RateBasedStatement = {
    val __obj = js.Dynamic.literal(AggregateKeyType = AggregateKeyType.asInstanceOf[js.Any], Limit = Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RateBasedStatement] (val x: Self) extends AnyVal {
    
    inline def setAggregateKeyType(value: RateBasedStatementAggregateKeyType): Self = StObject.set(x, "AggregateKeyType", value.asInstanceOf[js.Any])
    
    inline def setForwardedIPConfig(value: ForwardedIPConfig): Self = StObject.set(x, "ForwardedIPConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardedIPConfigUndefined: Self = StObject.set(x, "ForwardedIPConfig", js.undefined)
    
    inline def setLimit(value: RateLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatement(value: Statement): Self = StObject.set(x, "ScopeDownStatement", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatementUndefined: Self = StObject.set(x, "ScopeDownStatement", js.undefined)
  }
}
