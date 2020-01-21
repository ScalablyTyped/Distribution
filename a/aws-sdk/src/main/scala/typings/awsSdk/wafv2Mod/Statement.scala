package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  /**
    * A logical rule statement used to combine other rule statements with AND logic. You provide more than one Statement within the AndStatement. 
    */
  var AndStatement: js.UndefOr[typings.awsSdk.wafv2Mod.AndStatement] = js.native
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is refered to as a string match statement.
    */
  var ByteMatchStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ByteMatchStatement] = js.native
  /**
    * A rule statement used to identify web requests based on country of origin. 
    */
  var GeoMatchStatement: js.UndefOr[typings.awsSdk.wafv2Mod.GeoMatchStatement] = js.native
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this, create an IPSet that specifies the addresses you want to detect, then use the ARN of that set in this statement. To create an IP set, see CreateIPSet. Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically updates all rules that reference it.
    */
  var IPSetReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.IPSetReferenceStatement] = js.native
  /**
    * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name and the name of the rule group in this statement. You can retrieve the required names by calling ListAvailableManagedRuleGroups. You can't nest a ManagedRuleGroupStatement, for example for use inside a NotStatement or OrStatement. It can only be referenced as a top-level statement within a rule.
    */
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupStatement] = js.native
  /**
    * A logical rule statement used to negate the results of another rule statement. You provide one Statement within the NotStatement.
    */
  var NotStatement: js.UndefOr[typings.awsSdk.wafv2Mod.NotStatement] = js.native
  /**
    * A logical rule statement used to combine other rule statements with OR logic. You provide more than one Statement within the OrStatement. 
    */
  var OrStatement: js.UndefOr[typings.awsSdk.wafv2Mod.OrStatement] = js.native
  /**
    * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this to put a temporary block on requests from an IP address that is sending excessive requests. When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate falls below the limit. You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so that it only counts requests that match the nested statement. For example, based on recent requests that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the following nested statements:   An IP match statement with an IP set that specified the address 192.0.2.44.   A string match statement that searches in the User-Agent header for the string BadBot.   In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and are not affected by this rule. You cannot nest a RateBasedStatement, for example for use inside a NotStatement or OrStatement. It can only be referenced as a top-level statement within a rule.
    */
  var RateBasedStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RateBasedStatement] = js.native
  /**
    * A rule statement used to search web request components for matches with regular expressions. To use this, create a RegexPatternSet that specifies the expressions that you want to detect, then use the ARN of that set in this statement. A web request matches the pattern set rule statement if the request component matches any of the patterns in the set. To create a regex pattern set, see CreateRegexPatternSet. Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically updates all rules that reference it.
    */
  var RegexPatternSetReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RegexPatternSetReferenceStatement] = js.native
  /**
    * A rule statement used to run the rules that are defined in a RuleGroup. To use this, create a rule group with your rules, then provide the ARN of the rule group in this statement. You cannot nest a RuleGroupReferenceStatement, for example for use inside a NotStatement or OrStatement. It can only be referenced as a top-level statement within a rule.
    */
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RuleGroupReferenceStatement] = js.native
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement to look for query strings that are longer than 100 bytes.  If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block requests that have a request body greater than 8192 bytes. If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one character. For example, the URI /logo.jpg is nine characters long.
    */
  var SizeConstraintStatement: js.UndefOr[typings.awsSdk.wafv2Mod.SizeConstraintStatement] = js.native
  /**
    * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database. To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to allow or block requests that appear to contain malicious SQL code.
    */
  var SqliMatchStatement: js.UndefOr[typings.awsSdk.wafv2Mod.SqliMatchStatement] = js.native
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for character sequences that are likely to be malicious strings. 
    */
  var XssMatchStatement: js.UndefOr[typings.awsSdk.wafv2Mod.XssMatchStatement] = js.native
}

object Statement {
  @scala.inline
  def apply(
    AndStatement: AndStatement = null,
    ByteMatchStatement: ByteMatchStatement = null,
    GeoMatchStatement: GeoMatchStatement = null,
    IPSetReferenceStatement: IPSetReferenceStatement = null,
    ManagedRuleGroupStatement: ManagedRuleGroupStatement = null,
    NotStatement: NotStatement = null,
    OrStatement: OrStatement = null,
    RateBasedStatement: RateBasedStatement = null,
    RegexPatternSetReferenceStatement: RegexPatternSetReferenceStatement = null,
    RuleGroupReferenceStatement: RuleGroupReferenceStatement = null,
    SizeConstraintStatement: SizeConstraintStatement = null,
    SqliMatchStatement: SqliMatchStatement = null,
    XssMatchStatement: XssMatchStatement = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    if (AndStatement != null) __obj.updateDynamic("AndStatement")(AndStatement.asInstanceOf[js.Any])
    if (ByteMatchStatement != null) __obj.updateDynamic("ByteMatchStatement")(ByteMatchStatement.asInstanceOf[js.Any])
    if (GeoMatchStatement != null) __obj.updateDynamic("GeoMatchStatement")(GeoMatchStatement.asInstanceOf[js.Any])
    if (IPSetReferenceStatement != null) __obj.updateDynamic("IPSetReferenceStatement")(IPSetReferenceStatement.asInstanceOf[js.Any])
    if (ManagedRuleGroupStatement != null) __obj.updateDynamic("ManagedRuleGroupStatement")(ManagedRuleGroupStatement.asInstanceOf[js.Any])
    if (NotStatement != null) __obj.updateDynamic("NotStatement")(NotStatement.asInstanceOf[js.Any])
    if (OrStatement != null) __obj.updateDynamic("OrStatement")(OrStatement.asInstanceOf[js.Any])
    if (RateBasedStatement != null) __obj.updateDynamic("RateBasedStatement")(RateBasedStatement.asInstanceOf[js.Any])
    if (RegexPatternSetReferenceStatement != null) __obj.updateDynamic("RegexPatternSetReferenceStatement")(RegexPatternSetReferenceStatement.asInstanceOf[js.Any])
    if (RuleGroupReferenceStatement != null) __obj.updateDynamic("RuleGroupReferenceStatement")(RuleGroupReferenceStatement.asInstanceOf[js.Any])
    if (SizeConstraintStatement != null) __obj.updateDynamic("SizeConstraintStatement")(SizeConstraintStatement.asInstanceOf[js.Any])
    if (SqliMatchStatement != null) __obj.updateDynamic("SqliMatchStatement")(SqliMatchStatement.asInstanceOf[js.Any])
    if (XssMatchStatement != null) __obj.updateDynamic("XssMatchStatement")(XssMatchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

