package typings.awsSdk.wafregionalMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WAFRegional extends Service {
  @JSName("config")
  var config_WAFRegional: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
    */
  def associateWebACL(): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]): Request[AssociateWebACLResponse, AWSError] = js.native
  /**
    * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
    */
  def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(
    params: AssociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]
  ): Request[AssociateWebACLResponse, AWSError] = js.native
  /**
    * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createByteMatchSet(): Request[CreateByteMatchSetResponse, AWSError] = js.native
  def createByteMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateByteMatchSetResponse, Unit]): Request[CreateByteMatchSetResponse, AWSError] = js.native
  /**
    * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createByteMatchSet(params: CreateByteMatchSetRequest): Request[CreateByteMatchSetResponse, AWSError] = js.native
  def createByteMatchSet(
    params: CreateByteMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateByteMatchSetResponse, Unit]
  ): Request[CreateByteMatchSetResponse, AWSError] = js.native
  /**
    * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createGeoMatchSet(): Request[CreateGeoMatchSetResponse, AWSError] = js.native
  def createGeoMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateGeoMatchSetResponse, Unit]): Request[CreateGeoMatchSetResponse, AWSError] = js.native
  /**
    * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createGeoMatchSet(params: CreateGeoMatchSetRequest): Request[CreateGeoMatchSetResponse, AWSError] = js.native
  def createGeoMatchSet(
    params: CreateGeoMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGeoMatchSetResponse, Unit]
  ): Request[CreateGeoMatchSetResponse, AWSError] = js.native
  /**
    * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createIPSet(): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(
    params: CreateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]
  ): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRateBasedRule(): Request[CreateRateBasedRuleResponse, AWSError] = js.native
  def createRateBasedRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRateBasedRuleResponse, Unit]): Request[CreateRateBasedRuleResponse, AWSError] = js.native
  /**
    * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRateBasedRule(params: CreateRateBasedRuleRequest): Request[CreateRateBasedRuleResponse, AWSError] = js.native
  def createRateBasedRule(
    params: CreateRateBasedRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRateBasedRuleResponse, Unit]
  ): Request[CreateRateBasedRuleResponse, AWSError] = js.native
  /**
    * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRegexMatchSet(): Request[CreateRegexMatchSetResponse, AWSError] = js.native
  def createRegexMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexMatchSetResponse, Unit]): Request[CreateRegexMatchSetResponse, AWSError] = js.native
  /**
    * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRegexMatchSet(params: CreateRegexMatchSetRequest): Request[CreateRegexMatchSetResponse, AWSError] = js.native
  def createRegexMatchSet(
    params: CreateRegexMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexMatchSetResponse, Unit]
  ): Request[CreateRegexMatchSetResponse, AWSError] = js.native
  /**
    * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRegexPatternSet(): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(
    params: CreateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]
  ): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRule(): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]): Request[CreateRuleResponse, AWSError] = js.native
  /**
    * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRule(params: CreateRuleRequest): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(
    params: CreateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]
  ): Request[CreateRuleResponse, AWSError] = js.native
  /**
    * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRuleGroup(): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(
    params: CreateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]
  ): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createSizeConstraintSet(): Request[CreateSizeConstraintSetResponse, AWSError] = js.native
  def createSizeConstraintSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateSizeConstraintSetResponse, Unit]): Request[CreateSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createSizeConstraintSet(params: CreateSizeConstraintSetRequest): Request[CreateSizeConstraintSetResponse, AWSError] = js.native
  def createSizeConstraintSet(
    params: CreateSizeConstraintSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSizeConstraintSetResponse, Unit]
  ): Request[CreateSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createSqlInjectionMatchSet(): Request[CreateSqlInjectionMatchSetResponse, AWSError] = js.native
  def createSqlInjectionMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateSqlInjectionMatchSetResponse, Unit]): Request[CreateSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createSqlInjectionMatchSet(params: CreateSqlInjectionMatchSetRequest): Request[CreateSqlInjectionMatchSetResponse, AWSError] = js.native
  def createSqlInjectionMatchSet(
    params: CreateSqlInjectionMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSqlInjectionMatchSetResponse, Unit]
  ): Request[CreateSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
    */
  def createWebACL(): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]): Request[CreateWebACLResponse, AWSError] = js.native
  /**
    * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
    */
  def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(
    params: CreateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]
  ): Request[CreateWebACLResponse, AWSError] = js.native
  /**
    * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createXssMatchSet(): Request[CreateXssMatchSetResponse, AWSError] = js.native
  def createXssMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateXssMatchSetResponse, Unit]): Request[CreateXssMatchSetResponse, AWSError] = js.native
  /**
    * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def createXssMatchSet(params: CreateXssMatchSetRequest): Request[CreateXssMatchSetResponse, AWSError] = js.native
  def createXssMatchSet(
    params: CreateXssMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateXssMatchSetResponse, Unit]
  ): Request[CreateXssMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
    */
  def deleteByteMatchSet(): Request[DeleteByteMatchSetResponse, AWSError] = js.native
  def deleteByteMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteByteMatchSetResponse, Unit]): Request[DeleteByteMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
    */
  def deleteByteMatchSet(params: DeleteByteMatchSetRequest): Request[DeleteByteMatchSetResponse, AWSError] = js.native
  def deleteByteMatchSet(
    params: DeleteByteMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteByteMatchSetResponse, Unit]
  ): Request[DeleteByteMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
    */
  def deleteGeoMatchSet(): Request[DeleteGeoMatchSetResponse, AWSError] = js.native
  def deleteGeoMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGeoMatchSetResponse, Unit]): Request[DeleteGeoMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
    */
  def deleteGeoMatchSet(params: DeleteGeoMatchSetRequest): Request[DeleteGeoMatchSetResponse, AWSError] = js.native
  def deleteGeoMatchSet(
    params: DeleteGeoMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGeoMatchSetResponse, Unit]
  ): Request[DeleteGeoMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
    */
  def deleteIPSet(): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
    */
  def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(
    params: DeleteIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]
  ): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    * Permanently deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Permanently deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(
    params: DeleteLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]
  ): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
    */
  def deletePermissionPolicy(): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  def deletePermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionPolicyResponse, Unit]): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  /**
    * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
    */
  def deletePermissionPolicy(params: DeletePermissionPolicyRequest): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  def deletePermissionPolicy(
    params: DeletePermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionPolicyResponse, Unit]
  ): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  /**
    * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
    */
  def deleteRateBasedRule(): Request[DeleteRateBasedRuleResponse, AWSError] = js.native
  def deleteRateBasedRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRateBasedRuleResponse, Unit]): Request[DeleteRateBasedRuleResponse, AWSError] = js.native
  /**
    * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
    */
  def deleteRateBasedRule(params: DeleteRateBasedRuleRequest): Request[DeleteRateBasedRuleResponse, AWSError] = js.native
  def deleteRateBasedRule(
    params: DeleteRateBasedRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRateBasedRuleResponse, Unit]
  ): Request[DeleteRateBasedRuleResponse, AWSError] = js.native
  /**
    * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
    */
  def deleteRegexMatchSet(): Request[DeleteRegexMatchSetResponse, AWSError] = js.native
  def deleteRegexMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexMatchSetResponse, Unit]): Request[DeleteRegexMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
    */
  def deleteRegexMatchSet(params: DeleteRegexMatchSetRequest): Request[DeleteRegexMatchSetResponse, AWSError] = js.native
  def deleteRegexMatchSet(
    params: DeleteRegexMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexMatchSetResponse, Unit]
  ): Request[DeleteRegexMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
    */
  def deleteRegexPatternSet(): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
    */
  def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(
    params: DeleteRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]
  ): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
    */
  def deleteRule(): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]): Request[DeleteRuleResponse, AWSError] = js.native
  /**
    * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
    */
  def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]
  ): Request[DeleteRuleResponse, AWSError] = js.native
  /**
    * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
    */
  def deleteRuleGroup(): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]): Request[DeleteRuleGroupResponse, AWSError] = js.native
  /**
    * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
    */
  def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(
    params: DeleteRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]
  ): Request[DeleteRuleGroupResponse, AWSError] = js.native
  /**
    * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
    */
  def deleteSizeConstraintSet(): Request[DeleteSizeConstraintSetResponse, AWSError] = js.native
  def deleteSizeConstraintSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSizeConstraintSetResponse, Unit]): Request[DeleteSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
    */
  def deleteSizeConstraintSet(params: DeleteSizeConstraintSetRequest): Request[DeleteSizeConstraintSetResponse, AWSError] = js.native
  def deleteSizeConstraintSet(
    params: DeleteSizeConstraintSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSizeConstraintSetResponse, Unit]
  ): Request[DeleteSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
    */
  def deleteSqlInjectionMatchSet(): Request[DeleteSqlInjectionMatchSetResponse, AWSError] = js.native
  def deleteSqlInjectionMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSqlInjectionMatchSetResponse, Unit]): Request[DeleteSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
    */
  def deleteSqlInjectionMatchSet(params: DeleteSqlInjectionMatchSetRequest): Request[DeleteSqlInjectionMatchSetResponse, AWSError] = js.native
  def deleteSqlInjectionMatchSet(
    params: DeleteSqlInjectionMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSqlInjectionMatchSetResponse, Unit]
  ): Request[DeleteSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
    */
  def deleteWebACL(): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]): Request[DeleteWebACLResponse, AWSError] = js.native
  /**
    * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
    */
  def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(
    params: DeleteWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]
  ): Request[DeleteWebACLResponse, AWSError] = js.native
  /**
    * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
    */
  def deleteXssMatchSet(): Request[DeleteXssMatchSetResponse, AWSError] = js.native
  def deleteXssMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteXssMatchSetResponse, Unit]): Request[DeleteXssMatchSetResponse, AWSError] = js.native
  /**
    * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
    */
  def deleteXssMatchSet(params: DeleteXssMatchSetRequest): Request[DeleteXssMatchSetResponse, AWSError] = js.native
  def deleteXssMatchSet(
    params: DeleteXssMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteXssMatchSetResponse, Unit]
  ): Request[DeleteXssMatchSetResponse, AWSError] = js.native
  /**
    * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
    */
  def disassociateWebACL(): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]): Request[DisassociateWebACLResponse, AWSError] = js.native
  /**
    * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
    */
  def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(
    params: DisassociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]
  ): Request[DisassociateWebACLResponse, AWSError] = js.native
  /**
    * Returns the ByteMatchSet specified by ByteMatchSetId.
    */
  def getByteMatchSet(): Request[GetByteMatchSetResponse, AWSError] = js.native
  def getByteMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ GetByteMatchSetResponse, Unit]): Request[GetByteMatchSetResponse, AWSError] = js.native
  /**
    * Returns the ByteMatchSet specified by ByteMatchSetId.
    */
  def getByteMatchSet(params: GetByteMatchSetRequest): Request[GetByteMatchSetResponse, AWSError] = js.native
  def getByteMatchSet(
    params: GetByteMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetByteMatchSetResponse, Unit]
  ): Request[GetByteMatchSetResponse, AWSError] = js.native
  /**
    * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
    */
  def getChangeToken(): Request[GetChangeTokenResponse, AWSError] = js.native
  def getChangeToken(callback: js.Function2[/* err */ AWSError, /* data */ GetChangeTokenResponse, Unit]): Request[GetChangeTokenResponse, AWSError] = js.native
  /**
    * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
    */
  def getChangeToken(params: GetChangeTokenRequest): Request[GetChangeTokenResponse, AWSError] = js.native
  def getChangeToken(
    params: GetChangeTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeTokenResponse, Unit]
  ): Request[GetChangeTokenResponse, AWSError] = js.native
  /**
    * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    INSYNC: Propagation is complete.  
    */
  def getChangeTokenStatus(): Request[GetChangeTokenStatusResponse, AWSError] = js.native
  def getChangeTokenStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetChangeTokenStatusResponse, Unit]): Request[GetChangeTokenStatusResponse, AWSError] = js.native
  /**
    * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    INSYNC: Propagation is complete.  
    */
  def getChangeTokenStatus(params: GetChangeTokenStatusRequest): Request[GetChangeTokenStatusResponse, AWSError] = js.native
  def getChangeTokenStatus(
    params: GetChangeTokenStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangeTokenStatusResponse, Unit]
  ): Request[GetChangeTokenStatusResponse, AWSError] = js.native
  /**
    * Returns the GeoMatchSet that is specified by GeoMatchSetId.
    */
  def getGeoMatchSet(): Request[GetGeoMatchSetResponse, AWSError] = js.native
  def getGeoMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ GetGeoMatchSetResponse, Unit]): Request[GetGeoMatchSetResponse, AWSError] = js.native
  /**
    * Returns the GeoMatchSet that is specified by GeoMatchSetId.
    */
  def getGeoMatchSet(params: GetGeoMatchSetRequest): Request[GetGeoMatchSetResponse, AWSError] = js.native
  def getGeoMatchSet(
    params: GetGeoMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGeoMatchSetResponse, Unit]
  ): Request[GetGeoMatchSetResponse, AWSError] = js.native
  /**
    * Returns the IPSet that is specified by IPSetId.
    */
  def getIPSet(): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]): Request[GetIPSetResponse, AWSError] = js.native
  /**
    * Returns the IPSet that is specified by IPSetId.
    */
  def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(
    params: GetIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]
  ): Request[GetIPSetResponse, AWSError] = js.native
  /**
    * Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(
    params: GetLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]
  ): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Returns the IAM policy attached to the RuleGroup.
    */
  def getPermissionPolicy(): Request[GetPermissionPolicyResponse, AWSError] = js.native
  def getPermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionPolicyResponse, Unit]): Request[GetPermissionPolicyResponse, AWSError] = js.native
  /**
    * Returns the IAM policy attached to the RuleGroup.
    */
  def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse, AWSError] = js.native
  def getPermissionPolicy(
    params: GetPermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionPolicyResponse, Unit]
  ): Request[GetPermissionPolicyResponse, AWSError] = js.native
  /**
    * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
    */
  def getRateBasedRule(): Request[GetRateBasedRuleResponse, AWSError] = js.native
  def getRateBasedRule(callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedRuleResponse, Unit]): Request[GetRateBasedRuleResponse, AWSError] = js.native
  /**
    * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
    */
  def getRateBasedRule(params: GetRateBasedRuleRequest): Request[GetRateBasedRuleResponse, AWSError] = js.native
  def getRateBasedRule(
    params: GetRateBasedRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedRuleResponse, Unit]
  ): Request[GetRateBasedRuleResponse, AWSError] = js.native
  /**
    * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
    */
  def getRateBasedRuleManagedKeys(): Request[GetRateBasedRuleManagedKeysResponse, AWSError] = js.native
  def getRateBasedRuleManagedKeys(callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedRuleManagedKeysResponse, Unit]): Request[GetRateBasedRuleManagedKeysResponse, AWSError] = js.native
  /**
    * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
    */
  def getRateBasedRuleManagedKeys(params: GetRateBasedRuleManagedKeysRequest): Request[GetRateBasedRuleManagedKeysResponse, AWSError] = js.native
  def getRateBasedRuleManagedKeys(
    params: GetRateBasedRuleManagedKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedRuleManagedKeysResponse, Unit]
  ): Request[GetRateBasedRuleManagedKeysResponse, AWSError] = js.native
  /**
    * Returns the RegexMatchSet specified by RegexMatchSetId.
    */
  def getRegexMatchSet(): Request[GetRegexMatchSetResponse, AWSError] = js.native
  def getRegexMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ GetRegexMatchSetResponse, Unit]): Request[GetRegexMatchSetResponse, AWSError] = js.native
  /**
    * Returns the RegexMatchSet specified by RegexMatchSetId.
    */
  def getRegexMatchSet(params: GetRegexMatchSetRequest): Request[GetRegexMatchSetResponse, AWSError] = js.native
  def getRegexMatchSet(
    params: GetRegexMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegexMatchSetResponse, Unit]
  ): Request[GetRegexMatchSetResponse, AWSError] = js.native
  /**
    * Returns the RegexPatternSet specified by RegexPatternSetId.
    */
  def getRegexPatternSet(): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]): Request[GetRegexPatternSetResponse, AWSError] = js.native
  /**
    * Returns the RegexPatternSet specified by RegexPatternSetId.
    */
  def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(
    params: GetRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]
  ): Request[GetRegexPatternSetResponse, AWSError] = js.native
  /**
    * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
    */
  def getRule(): Request[GetRuleResponse, AWSError] = js.native
  def getRule(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]): Request[GetRuleResponse, AWSError] = js.native
  /**
    * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
    */
  def getRule(params: GetRuleRequest): Request[GetRuleResponse, AWSError] = js.native
  def getRule(
    params: GetRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]
  ): Request[GetRuleResponse, AWSError] = js.native
  /**
    * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
    */
  def getRuleGroup(): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]): Request[GetRuleGroupResponse, AWSError] = js.native
  /**
    * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
    */
  def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(
    params: GetRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]
  ): Request[GetRuleGroupResponse, AWSError] = js.native
  /**
    * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
    */
  def getSampledRequests(): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]): Request[GetSampledRequestsResponse, AWSError] = js.native
  /**
    * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
    */
  def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(
    params: GetSampledRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]
  ): Request[GetSampledRequestsResponse, AWSError] = js.native
  /**
    * Returns the SizeConstraintSet specified by SizeConstraintSetId.
    */
  def getSizeConstraintSet(): Request[GetSizeConstraintSetResponse, AWSError] = js.native
  def getSizeConstraintSet(callback: js.Function2[/* err */ AWSError, /* data */ GetSizeConstraintSetResponse, Unit]): Request[GetSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Returns the SizeConstraintSet specified by SizeConstraintSetId.
    */
  def getSizeConstraintSet(params: GetSizeConstraintSetRequest): Request[GetSizeConstraintSetResponse, AWSError] = js.native
  def getSizeConstraintSet(
    params: GetSizeConstraintSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSizeConstraintSetResponse, Unit]
  ): Request[GetSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
    */
  def getSqlInjectionMatchSet(): Request[GetSqlInjectionMatchSetResponse, AWSError] = js.native
  def getSqlInjectionMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ GetSqlInjectionMatchSetResponse, Unit]): Request[GetSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
    */
  def getSqlInjectionMatchSet(params: GetSqlInjectionMatchSetRequest): Request[GetSqlInjectionMatchSetResponse, AWSError] = js.native
  def getSqlInjectionMatchSet(
    params: GetSqlInjectionMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSqlInjectionMatchSetResponse, Unit]
  ): Request[GetSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Returns the WebACL that is specified by WebACLId.
    */
  def getWebACL(): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]): Request[GetWebACLResponse, AWSError] = js.native
  /**
    * Returns the WebACL that is specified by WebACLId.
    */
  def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(
    params: GetWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]
  ): Request[GetWebACLResponse, AWSError] = js.native
  /**
    * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
    */
  def getWebACLForResource(): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]): Request[GetWebACLForResourceResponse, AWSError] = js.native
  /**
    * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
    */
  def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(
    params: GetWebACLForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]
  ): Request[GetWebACLForResourceResponse, AWSError] = js.native
  /**
    * Returns the XssMatchSet that is specified by XssMatchSetId.
    */
  def getXssMatchSet(): Request[GetXssMatchSetResponse, AWSError] = js.native
  def getXssMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ GetXssMatchSetResponse, Unit]): Request[GetXssMatchSetResponse, AWSError] = js.native
  /**
    * Returns the XssMatchSet that is specified by XssMatchSetId.
    */
  def getXssMatchSet(params: GetXssMatchSetRequest): Request[GetXssMatchSetResponse, AWSError] = js.native
  def getXssMatchSet(
    params: GetXssMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetXssMatchSetResponse, Unit]
  ): Request[GetXssMatchSetResponse, AWSError] = js.native
  /**
    * Returns an array of ActivatedRule objects.
    */
  def listActivatedRulesInRuleGroup(): Request[ListActivatedRulesInRuleGroupResponse, AWSError] = js.native
  def listActivatedRulesInRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListActivatedRulesInRuleGroupResponse, Unit]): Request[ListActivatedRulesInRuleGroupResponse, AWSError] = js.native
  /**
    * Returns an array of ActivatedRule objects.
    */
  def listActivatedRulesInRuleGroup(params: ListActivatedRulesInRuleGroupRequest): Request[ListActivatedRulesInRuleGroupResponse, AWSError] = js.native
  def listActivatedRulesInRuleGroup(
    params: ListActivatedRulesInRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActivatedRulesInRuleGroupResponse, Unit]
  ): Request[ListActivatedRulesInRuleGroupResponse, AWSError] = js.native
  /**
    * Returns an array of ByteMatchSetSummary objects.
    */
  def listByteMatchSets(): Request[ListByteMatchSetsResponse, AWSError] = js.native
  def listByteMatchSets(callback: js.Function2[/* err */ AWSError, /* data */ ListByteMatchSetsResponse, Unit]): Request[ListByteMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of ByteMatchSetSummary objects.
    */
  def listByteMatchSets(params: ListByteMatchSetsRequest): Request[ListByteMatchSetsResponse, AWSError] = js.native
  def listByteMatchSets(
    params: ListByteMatchSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListByteMatchSetsResponse, Unit]
  ): Request[ListByteMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of GeoMatchSetSummary objects in the response.
    */
  def listGeoMatchSets(): Request[ListGeoMatchSetsResponse, AWSError] = js.native
  def listGeoMatchSets(callback: js.Function2[/* err */ AWSError, /* data */ ListGeoMatchSetsResponse, Unit]): Request[ListGeoMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of GeoMatchSetSummary objects in the response.
    */
  def listGeoMatchSets(params: ListGeoMatchSetsRequest): Request[ListGeoMatchSetsResponse, AWSError] = js.native
  def listGeoMatchSets(
    params: ListGeoMatchSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGeoMatchSetsResponse, Unit]
  ): Request[ListGeoMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of IPSetSummary objects in the response.
    */
  def listIPSets(): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    * Returns an array of IPSetSummary objects in the response.
    */
  def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(
    params: ListIPSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]
  ): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    * Returns an array of LoggingConfiguration objects.
    */
  def listLoggingConfigurations(): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  /**
    * Returns an array of LoggingConfiguration objects.
    */
  def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(
    params: ListLoggingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]
  ): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  /**
    * Returns an array of RuleSummary objects.
    */
  def listRateBasedRules(): Request[ListRateBasedRulesResponse, AWSError] = js.native
  def listRateBasedRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRateBasedRulesResponse, Unit]): Request[ListRateBasedRulesResponse, AWSError] = js.native
  /**
    * Returns an array of RuleSummary objects.
    */
  def listRateBasedRules(params: ListRateBasedRulesRequest): Request[ListRateBasedRulesResponse, AWSError] = js.native
  def listRateBasedRules(
    params: ListRateBasedRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRateBasedRulesResponse, Unit]
  ): Request[ListRateBasedRulesResponse, AWSError] = js.native
  /**
    * Returns an array of RegexMatchSetSummary objects.
    */
  def listRegexMatchSets(): Request[ListRegexMatchSetsResponse, AWSError] = js.native
  def listRegexMatchSets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegexMatchSetsResponse, Unit]): Request[ListRegexMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of RegexMatchSetSummary objects.
    */
  def listRegexMatchSets(params: ListRegexMatchSetsRequest): Request[ListRegexMatchSetsResponse, AWSError] = js.native
  def listRegexMatchSets(
    params: ListRegexMatchSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegexMatchSetsResponse, Unit]
  ): Request[ListRegexMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of RegexPatternSetSummary objects.
    */
  def listRegexPatternSets(): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  /**
    * Returns an array of RegexPatternSetSummary objects.
    */
  def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(
    params: ListRegexPatternSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]
  ): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  /**
    * Returns an array of resources associated with the specified web ACL.
    */
  def listResourcesForWebACL(): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  /**
    * Returns an array of resources associated with the specified web ACL.
    */
  def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(
    params: ListResourcesForWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]
  ): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  /**
    * Returns an array of RuleGroup objects.
    */
  def listRuleGroups(): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    * Returns an array of RuleGroup objects.
    */
  def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(
    params: ListRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]
  ): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    * Returns an array of RuleSummary objects.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Returns an array of RuleSummary objects.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Returns an array of SizeConstraintSetSummary objects.
    */
  def listSizeConstraintSets(): Request[ListSizeConstraintSetsResponse, AWSError] = js.native
  def listSizeConstraintSets(callback: js.Function2[/* err */ AWSError, /* data */ ListSizeConstraintSetsResponse, Unit]): Request[ListSizeConstraintSetsResponse, AWSError] = js.native
  /**
    * Returns an array of SizeConstraintSetSummary objects.
    */
  def listSizeConstraintSets(params: ListSizeConstraintSetsRequest): Request[ListSizeConstraintSetsResponse, AWSError] = js.native
  def listSizeConstraintSets(
    params: ListSizeConstraintSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSizeConstraintSetsResponse, Unit]
  ): Request[ListSizeConstraintSetsResponse, AWSError] = js.native
  /**
    * Returns an array of SqlInjectionMatchSet objects.
    */
  def listSqlInjectionMatchSets(): Request[ListSqlInjectionMatchSetsResponse, AWSError] = js.native
  def listSqlInjectionMatchSets(callback: js.Function2[/* err */ AWSError, /* data */ ListSqlInjectionMatchSetsResponse, Unit]): Request[ListSqlInjectionMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of SqlInjectionMatchSet objects.
    */
  def listSqlInjectionMatchSets(params: ListSqlInjectionMatchSetsRequest): Request[ListSqlInjectionMatchSetsResponse, AWSError] = js.native
  def listSqlInjectionMatchSets(
    params: ListSqlInjectionMatchSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSqlInjectionMatchSetsResponse, Unit]
  ): Request[ListSqlInjectionMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of RuleGroup objects that you are subscribed to.
    */
  def listSubscribedRuleGroups(): Request[ListSubscribedRuleGroupsResponse, AWSError] = js.native
  def listSubscribedRuleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedRuleGroupsResponse, Unit]): Request[ListSubscribedRuleGroupsResponse, AWSError] = js.native
  /**
    * Returns an array of RuleGroup objects that you are subscribed to.
    */
  def listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest): Request[ListSubscribedRuleGroupsResponse, AWSError] = js.native
  def listSubscribedRuleGroups(
    params: ListSubscribedRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribedRuleGroupsResponse, Unit]
  ): Request[ListSubscribedRuleGroupsResponse, AWSError] = js.native
  /**
    * 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns an array of WebACLSummary objects in the response.
    */
  def listWebACLs(): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]): Request[ListWebACLsResponse, AWSError] = js.native
  /**
    * Returns an array of WebACLSummary objects in the response.
    */
  def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(
    params: ListWebACLsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]
  ): Request[ListWebACLsResponse, AWSError] = js.native
  /**
    * Returns an array of XssMatchSet objects.
    */
  def listXssMatchSets(): Request[ListXssMatchSetsResponse, AWSError] = js.native
  def listXssMatchSets(callback: js.Function2[/* err */ AWSError, /* data */ ListXssMatchSetsResponse, Unit]): Request[ListXssMatchSetsResponse, AWSError] = js.native
  /**
    * Returns an array of XssMatchSet objects.
    */
  def listXssMatchSets(params: ListXssMatchSetsRequest): Request[ListXssMatchSetsResponse, AWSError] = js.native
  def listXssMatchSets(
    params: ListXssMatchSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListXssMatchSetsResponse, Unit]
  ): Request[ListXssMatchSetsResponse, AWSError] = js.native
  /**
    * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose.  Create the data firehose with a PUT source and in the region that you are operating. However, if you are capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).   Do not create the data firehose using a Kinesis stream as your source.    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
    */
  def putLoggingConfiguration(): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose.  Create the data firehose with a PUT source and in the region that you are operating. However, if you are capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).   Do not create the data firehose using a Kinesis stream as your source.    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
    */
  def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(
    params: PutLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]
  ): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
    */
  def putPermissionPolicy(): Request[PutPermissionPolicyResponse, AWSError] = js.native
  def putPermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionPolicyResponse, Unit]): Request[PutPermissionPolicyResponse, AWSError] = js.native
  /**
    * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
    */
  def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse, AWSError] = js.native
  def putPermissionPolicy(
    params: PutPermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionPolicyResponse, Unit]
  ): Request[PutPermissionPolicyResponse, AWSError] = js.native
  /**
    * 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateByteMatchSet(): Request[UpdateByteMatchSetResponse, AWSError] = js.native
  def updateByteMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateByteMatchSetResponse, Unit]): Request[UpdateByteMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateByteMatchSet(params: UpdateByteMatchSetRequest): Request[UpdateByteMatchSetResponse, AWSError] = js.native
  def updateByteMatchSet(
    params: UpdateByteMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateByteMatchSetResponse, Unit]
  ): Request[UpdateByteMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateGeoMatchSet(): Request[UpdateGeoMatchSetResponse, AWSError] = js.native
  def updateGeoMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGeoMatchSetResponse, Unit]): Request[UpdateGeoMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateGeoMatchSet(params: UpdateGeoMatchSetRequest): Request[UpdateGeoMatchSetResponse, AWSError] = js.native
  def updateGeoMatchSet(
    params: UpdateGeoMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGeoMatchSetResponse, Unit]
  ): Request[UpdateGeoMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateIPSet(): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(
    params: UpdateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]
  ): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
    */
  def updateRateBasedRule(): Request[UpdateRateBasedRuleResponse, AWSError] = js.native
  def updateRateBasedRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRateBasedRuleResponse, Unit]): Request[UpdateRateBasedRuleResponse, AWSError] = js.native
  /**
    * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
    */
  def updateRateBasedRule(params: UpdateRateBasedRuleRequest): Request[UpdateRateBasedRuleResponse, AWSError] = js.native
  def updateRateBasedRule(
    params: UpdateRateBasedRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRateBasedRuleResponse, Unit]
  ): Request[UpdateRateBasedRuleResponse, AWSError] = js.native
  /**
    * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRegexMatchSet(): Request[UpdateRegexMatchSetResponse, AWSError] = js.native
  def updateRegexMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexMatchSetResponse, Unit]): Request[UpdateRegexMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRegexMatchSet(params: UpdateRegexMatchSetRequest): Request[UpdateRegexMatchSetResponse, AWSError] = js.native
  def updateRegexMatchSet(
    params: UpdateRegexMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexMatchSetResponse, Unit]
  ): Request[UpdateRegexMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRegexPatternSet(): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(
    params: UpdateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]
  ): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRule(): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]): Request[UpdateRuleResponse, AWSError] = js.native
  /**
    * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(
    params: UpdateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]
  ): Request[UpdateRuleResponse, AWSError] = js.native
  /**
    * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRuleGroup(): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(
    params: UpdateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]
  ): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateSizeConstraintSet(): Request[UpdateSizeConstraintSetResponse, AWSError] = js.native
  def updateSizeConstraintSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSizeConstraintSetResponse, Unit]): Request[UpdateSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateSizeConstraintSet(params: UpdateSizeConstraintSetRequest): Request[UpdateSizeConstraintSetResponse, AWSError] = js.native
  def updateSizeConstraintSet(
    params: UpdateSizeConstraintSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSizeConstraintSetResponse, Unit]
  ): Request[UpdateSizeConstraintSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateSqlInjectionMatchSet(): Request[UpdateSqlInjectionMatchSetResponse, AWSError] = js.native
  def updateSqlInjectionMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSqlInjectionMatchSetResponse, Unit]): Request[UpdateSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateSqlInjectionMatchSet(params: UpdateSqlInjectionMatchSetRequest): Request[UpdateSqlInjectionMatchSetResponse, AWSError] = js.native
  def updateSqlInjectionMatchSet(
    params: UpdateSqlInjectionMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSqlInjectionMatchSetResponse, Unit]
  ): Request[UpdateSqlInjectionMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateWebACL(): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]): Request[UpdateWebACLResponse, AWSError] = js.native
  /**
    * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(
    params: UpdateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]
  ): Request[UpdateWebACLResponse, AWSError] = js.native
  /**
    * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateXssMatchSet(): Request[UpdateXssMatchSetResponse, AWSError] = js.native
  def updateXssMatchSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateXssMatchSetResponse, Unit]): Request[UpdateXssMatchSetResponse, AWSError] = js.native
  /**
    * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
    */
  def updateXssMatchSet(params: UpdateXssMatchSetRequest): Request[UpdateXssMatchSetResponse, AWSError] = js.native
  def updateXssMatchSet(
    params: UpdateXssMatchSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateXssMatchSetResponse, Unit]
  ): Request[UpdateXssMatchSetResponse, AWSError] = js.native
}

