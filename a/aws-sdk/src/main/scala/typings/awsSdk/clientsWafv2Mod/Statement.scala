package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. You provide more than one Statement within the AndStatement. 
    */
  var AndStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.AndStatement] = js.undefined
  
  /**
    * A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the developer guide, this is called a string match statement.
    */
  var ByteMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ByteMatchStatement] = js.undefined
  
  /**
    * A rule statement that labels web requests by country and region and that matches against web requests based on country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.   To manage requests only by country, you can use this statement by itself and specify the countries that you want to match against in the CountryCodes array.    Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more label match rules to run after the geo match rule and configure them to match against the geographic labels and handle the requests as needed.    WAF labels requests using the alpha-2 country and region codes from the International Organization for Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request origin or, if you specify it, the address in the geo match ForwardedIPConfig.  If you use the web request origin, the label formats are awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt; and awswaf:clientip:geo:country:&lt;ISO country code&gt;. If you use a forwarded IP address, the label formats are awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt; and awswaf:forwardedip:geo:country:&lt;ISO country code&gt;. For additional details, see Geographic match rule statement in the WAF Developer Guide. 
    */
  var GeoMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.GeoMatchStatement] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this, create an IPSet that specifies the addresses you want to detect, then use the ARN of that set in this statement. To create an IP set, see CreateIPSet. Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates all rules that reference it.
    */
  var IPSetReferenceStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.IPSetReferenceStatement] = js.undefined
  
  /**
    * A rule statement to match against labels that have been added to the web request by rules that have already run in the web ACL.  The label match statement provides the label or namespace string to search for. The label string can represent a part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label. If you do not provide the fully qualified name in your label match string, WAF performs the search for labels that were added in the same context as the label match statement. 
    */
  var LabelMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LabelMatchStatement] = js.undefined
  
  /**
    * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name and the name of the rule group in this statement. You can retrieve the required names by calling ListAvailableManagedRuleGroups. You cannot nest a ManagedRuleGroupStatement, for example for use inside a NotStatement or OrStatement. It can only be referenced as a top-level statement within a rule.  You are charged additional fees when you use the WAF Bot Control managed rule group AWSManagedRulesBotControlRuleSet or the WAF Fraud Control account takeover prevention (ATP) managed rule group AWSManagedRulesATPRuleSet. For more information, see WAF Pricing. 
    */
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ManagedRuleGroupStatement] = js.undefined
  
  /**
    * A logical rule statement used to negate the results of another rule statement. You provide one Statement within the NotStatement.
    */
  var NotStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NotStatement] = js.undefined
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. You provide more than one Statement within the OrStatement. 
    */
  var OrStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.OrStatement] = js.undefined
  
  /**
    * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this to put a temporary block on requests from an IP address that is sending excessive requests.  WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example, if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate instance of the rate-based rule that gets its own tracking and management by WAF.  When the rule action triggers, WAF blocks additional requests from the IP address until the request rate falls below the limit. You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so that it only counts requests that match the nested statement. For example, based on recent requests that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the following nested statements:   An IP match statement with an IP set that specifies the address 192.0.2.44.   A string match statement that searches in the User-Agent header for the string BadBot.   In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that meet the criteria of both of the nested statements are counted. If the count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet the criteria of both of the nested statements are not counted towards the rate limit and are not affected by this rule. You cannot nest a RateBasedStatement inside another statement, for example inside a NotStatement or OrStatement. You can define a RateBasedStatement inside a web ACL and inside a rule group. 
    */
  var RateBasedStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RateBasedStatement] = js.undefined
  
  /**
    * A rule statement used to search web request components for a match against a single regular expression. 
    */
  var RegexMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RegexMatchStatement] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. To use this, create a RegexPatternSet that specifies the expressions that you want to detect, then use the ARN of that set in this statement. A web request matches the pattern set rule statement if the request component matches any of the patterns in the set. To create a regex pattern set, see CreateRegexPatternSet. Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates all rules that reference it.
    */
  var RegexPatternSetReferenceStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RegexPatternSetReferenceStatement] = js.undefined
  
  /**
    * A rule statement used to run the rules that are defined in a RuleGroup. To use this, create a rule group with your rules, then provide the ARN of the rule group in this statement. You cannot nest a RuleGroupReferenceStatement, for example for use inside a NotStatement or OrStatement. You can only use a rule group reference statement at the top level inside a web ACL. 
    */
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RuleGroupReferenceStatement] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement to look for query strings that are longer than 100 bytes.  If you configure WAF to inspect the request body, WAF inspects only the number of bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this limit is 8 KB (8,192 kilobytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 kilobytes). For CloudFront web ACLs, you can increase the limit in the web ACL AssociationConfig, for additional fees. If you know that the request body for your web requests should never exceed the inspection limit, you could use a size constraint statement to block requests that have a larger request body size. If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one character. For example, the URI /logo.jpg is nine characters long.
    */
  var SizeConstraintStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SizeConstraintStatement] = js.undefined
  
  /**
    * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to do things like modify your database or extract data from it. 
    */
  var SqliMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SqliMatchStatement] = js.undefined
  
  /**
    * A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate web browsers. 
    */
  var XssMatchStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.XssMatchStatement] = js.undefined
}
object Statement {
  
  inline def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    inline def setAndStatement(value: AndStatement): Self = StObject.set(x, "AndStatement", value.asInstanceOf[js.Any])
    
    inline def setAndStatementUndefined: Self = StObject.set(x, "AndStatement", js.undefined)
    
    inline def setByteMatchStatement(value: ByteMatchStatement): Self = StObject.set(x, "ByteMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setByteMatchStatementUndefined: Self = StObject.set(x, "ByteMatchStatement", js.undefined)
    
    inline def setGeoMatchStatement(value: GeoMatchStatement): Self = StObject.set(x, "GeoMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchStatementUndefined: Self = StObject.set(x, "GeoMatchStatement", js.undefined)
    
    inline def setIPSetReferenceStatement(value: IPSetReferenceStatement): Self = StObject.set(x, "IPSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setIPSetReferenceStatementUndefined: Self = StObject.set(x, "IPSetReferenceStatement", js.undefined)
    
    inline def setLabelMatchStatement(value: LabelMatchStatement): Self = StObject.set(x, "LabelMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setLabelMatchStatementUndefined: Self = StObject.set(x, "LabelMatchStatement", js.undefined)
    
    inline def setManagedRuleGroupStatement(value: ManagedRuleGroupStatement): Self = StObject.set(x, "ManagedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupStatementUndefined: Self = StObject.set(x, "ManagedRuleGroupStatement", js.undefined)
    
    inline def setNotStatement(value: NotStatement): Self = StObject.set(x, "NotStatement", value.asInstanceOf[js.Any])
    
    inline def setNotStatementUndefined: Self = StObject.set(x, "NotStatement", js.undefined)
    
    inline def setOrStatement(value: OrStatement): Self = StObject.set(x, "OrStatement", value.asInstanceOf[js.Any])
    
    inline def setOrStatementUndefined: Self = StObject.set(x, "OrStatement", js.undefined)
    
    inline def setRateBasedStatement(value: RateBasedStatement): Self = StObject.set(x, "RateBasedStatement", value.asInstanceOf[js.Any])
    
    inline def setRateBasedStatementUndefined: Self = StObject.set(x, "RateBasedStatement", js.undefined)
    
    inline def setRegexMatchStatement(value: RegexMatchStatement): Self = StObject.set(x, "RegexMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchStatementUndefined: Self = StObject.set(x, "RegexMatchStatement", js.undefined)
    
    inline def setRegexPatternSetReferenceStatement(value: RegexPatternSetReferenceStatement): Self = StObject.set(x, "RegexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "RegexPatternSetReferenceStatement", js.undefined)
    
    inline def setRuleGroupReferenceStatement(value: RuleGroupReferenceStatement): Self = StObject.set(x, "RuleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupReferenceStatementUndefined: Self = StObject.set(x, "RuleGroupReferenceStatement", js.undefined)
    
    inline def setSizeConstraintStatement(value: SizeConstraintStatement): Self = StObject.set(x, "SizeConstraintStatement", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintStatementUndefined: Self = StObject.set(x, "SizeConstraintStatement", js.undefined)
    
    inline def setSqliMatchStatement(value: SqliMatchStatement): Self = StObject.set(x, "SqliMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setSqliMatchStatementUndefined: Self = StObject.set(x, "SqliMatchStatement", js.undefined)
    
    inline def setXssMatchStatement(value: XssMatchStatement): Self = StObject.set(x, "XssMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setXssMatchStatementUndefined: Self = StObject.set(x, "XssMatchStatement", js.undefined)
  }
}
