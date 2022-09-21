package typings.chrome.anon

import typings.chrome.chrome.declarativeNetRequest.DomainType
import typings.chrome.chrome.declarativeNetRequest.RequestMethod
import typings.chrome.chrome.declarativeNetRequest.ResourceType
import typings.chrome.chrome.declarativeNetRequest.RuleCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  excludedResourceTypes :std.Array<chrome.chrome.declarativeNetRequest.ResourceType> | undefined} & {  domainType :chrome.chrome.declarativeNetRequest.DomainType | undefined,   domains :std.Array<string> | undefined,   excludedDomains :std.Array<string> | undefined,   initiatorDomains :std.Array<string> | undefined,   excludedInitiatorDomains :std.Array<string> | undefined,   requestDomains :std.Array<string> | undefined,   excludedRequestDomains :std.Array<string> | undefined,   excludedRequestMethods :std.Array<chrome.chrome.declarativeNetRequest.RequestMethod> | undefined,   excludedResourceTypes :std.Array<chrome.chrome.declarativeNetRequest.ResourceType> | undefined,   excludedTabIds :std.Array<number> | undefined,   isUrlFilterCaseSensitive :boolean | undefined,   regexFilter :string | undefined,   requestMethods :std.Array<chrome.chrome.declarativeNetRequest.RequestMethod> | undefined,   tabIds :std.Array<number> | undefined,   urlFilter :string | undefined} */
trait excludedResourceTypesArra
  extends StObject
     with RuleCondition {
  
  /**
    * Specifies whether the network request is first-party or third-party to the domain from which it originated.
    * If omitted, all requests are accepted.
    */
  var domainType: js.UndefOr[DomainType] = js.undefined
  
  /**
    * @deprecated since Chrome 101. Use initiatorDomains instead.
    * The rule will only match network requests originating from the list of domains.
    * If the list is omitted, the rule is applied to requests from all domains.
    * An empty list is not allowed.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    * This matches against the request initiator and not the request url.
    */
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @deprecated since Chrome 101. Use excludedInitiatorDomains instead
    *
    * The rule will not match network requests originating from the list of excludedDomains.
    * If the list is empty or omitted, no domains are excluded.
    * This takes precedence over domains.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    * This matches against the request initiator and not the request url.
    */
  var excludedDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The rule will not match network requests originating from the list of excludedInitiatorDomains.
    * If the list is empty or omitted, no domains are excluded.
    * This takes precedence over initiatorDomains.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    * This matches against the request initiator and not the request url.
    */
  var excludedInitiatorDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The rule will not match network requests when the domains matches one from the list of excludedRequestDomains.
    * If the list is empty or omitted, no domains are excluded.
    * This takes precedence over requestDomains.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    */
  var excludedRequestDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of request methods which the rule won't match.
    * Only one of requestMethods and excludedRequestMethods should be specified.
    * If neither of them is specified, all request methods are matched.
    */
  var excludedRequestMethods: js.UndefOr[js.Array[RequestMethod]] = js.undefined
  
  /**
    * List of resource types which the rule won't match.
    * Only one of {@link chrome.declarativeNetRequest.RuleCondition.resourceTypes}
    * and {@link chrome.declarativeNetRequest.RuleCondition.excludedResourceTypes} should be specified.
    * If neither of them is specified, all resource types except "main_frame" are blocked.
    */
  /**
    * List of resource types which the rule won't match.
    * Only one of {@link chrome.declarativeNetRequest.RuleCondition.resourceTypes}
    * and {@link chrome.declarativeNetRequest.RuleCondition.excludedResourceTypes} should be specified.
    * If neither of them is specified, all resource types except "main_frame" are blocked.
    */
  var excludedResourceTypes: js.UndefOr[js.Array[ResourceType]] = js.undefined
  
  /**
    * List of {@link chrome.tabs.Tab.id} which the rule should not match.
    * An ID of {@link chrome.tabs.TAB_ID_NONE} excludes requests which don't originate from a tab.
    * Only supported for session-scoped rules.
    */
  var excludedTabIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The rule will only match network requests originating from the list of initiatorDomains.
    * If the list is omitted, the rule is applied to requests from all domains.
    * An empty list is not allowed.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    * This matches against the request initiator and not the request url.
    */
  var initiatorDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the urlFilter or regexFilter (whichever is specified) is case sensitive.
    * Default is true.
    */
  var isUrlFilterCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Regular expression to match against the network request url.
    * This follows the RE2 syntax.
    *
    * Note: Only one of urlFilter or regexFilter can be specified.
    *
    * Note: The regexFilter must be composed of only ASCII characters.
    * This is matched against a url where the host is encoded in the punycode format (in case of internationalized domains) and any other non-ascii characters are url encoded in utf-8.
    */
  var regexFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The rule will only match network requests when the domain matches one from the list of requestDomains.
    * If the list is omitted, the rule is applied to requests from all domains.
    * An empty list is not allowed.
    *
    * Notes:
    * Sub-domains like "a.example.com" are also allowed.
    * The entries must consist of only ascii characters.
    * Use punycode encoding for internationalized domains.
    */
  var requestDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of HTTP request methods which the rule can match. An empty list is not allowed.
    * Note: Specifying a {@link chrome.declarativeNetRequest.RuleCondition.requestMethods} rule condition will also exclude non-HTTP(s) requests,
    * whereas specifying {@link chrome.declarativeNetRequest.RuleCondition.excludedRequestMethods} will not.
    */
  var requestMethods: js.UndefOr[js.Array[RequestMethod]] = js.undefined
  
  /**
    * List of {@link chrome.tabs.Tab.id} which the rule should not match.
    * An ID of {@link chrome.tabs.TAB_ID_NONE} excludes requests which don't originate from a tab.
    * An empty list is not allowed. Only supported for session-scoped rules.
    */
  var tabIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The pattern which is matched against the network request url.
    * Supported constructs:
    *
    * '*' : Wildcard: Matches any number of characters.
    *
    * '|' : Left/right anchor: If used at either end of the pattern, specifies the beginning/end of the url respectively.
    *
    * '||' : Domain name anchor: If used at the beginning of the pattern, specifies the start of a (sub-)domain of the URL.
    *
    * '^' : Separator character: This matches anything except a letter, a digit or one of the following: _ - . %.
    * This can also match the end of the URL.
    *
    * Therefore urlFilter is composed of the following parts: (optional Left/Domain name anchor) + pattern + (optional Right anchor).
    *
    * If omitted, all urls are matched. An empty string is not allowed.
    *
    * A pattern beginning with || is not allowed. Use instead.
    *
    * Note: Only one of urlFilter or regexFilter can be specified.
    *
    * Note: The urlFilter must be composed of only ASCII characters.
    * This is matched against a url where the host is encoded in the punycode format (in case of internationalized domains) and any other non-ascii characters are url encoded in utf-8.
    * For example, when the request url is http://abc.рф?q=ф, the urlFilter will be matched against the url http://abc.xn--p1ai/?q=%D1%84.
    */
  var urlFilter: js.UndefOr[String] = js.undefined
}
object excludedResourceTypesArra {
  
  inline def apply(): excludedResourceTypesArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[excludedResourceTypesArra]
  }
  
  extension [Self <: excludedResourceTypesArra](x: Self) {
    
    inline def setDomainType(value: DomainType): Self = StObject.set(x, "domainType", value.asInstanceOf[js.Any])
    
    inline def setDomainTypeUndefined: Self = StObject.set(x, "domainType", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setExcludedDomains(value: js.Array[String]): Self = StObject.set(x, "excludedDomains", value.asInstanceOf[js.Any])
    
    inline def setExcludedDomainsUndefined: Self = StObject.set(x, "excludedDomains", js.undefined)
    
    inline def setExcludedDomainsVarargs(value: String*): Self = StObject.set(x, "excludedDomains", js.Array(value*))
    
    inline def setExcludedInitiatorDomains(value: js.Array[String]): Self = StObject.set(x, "excludedInitiatorDomains", value.asInstanceOf[js.Any])
    
    inline def setExcludedInitiatorDomainsUndefined: Self = StObject.set(x, "excludedInitiatorDomains", js.undefined)
    
    inline def setExcludedInitiatorDomainsVarargs(value: String*): Self = StObject.set(x, "excludedInitiatorDomains", js.Array(value*))
    
    inline def setExcludedRequestDomains(value: js.Array[String]): Self = StObject.set(x, "excludedRequestDomains", value.asInstanceOf[js.Any])
    
    inline def setExcludedRequestDomainsUndefined: Self = StObject.set(x, "excludedRequestDomains", js.undefined)
    
    inline def setExcludedRequestDomainsVarargs(value: String*): Self = StObject.set(x, "excludedRequestDomains", js.Array(value*))
    
    inline def setExcludedRequestMethods(value: js.Array[RequestMethod]): Self = StObject.set(x, "excludedRequestMethods", value.asInstanceOf[js.Any])
    
    inline def setExcludedRequestMethodsUndefined: Self = StObject.set(x, "excludedRequestMethods", js.undefined)
    
    inline def setExcludedRequestMethodsVarargs(value: RequestMethod*): Self = StObject.set(x, "excludedRequestMethods", js.Array(value*))
    
    inline def setExcludedResourceTypes(value: js.Array[ResourceType]): Self = StObject.set(x, "excludedResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedResourceTypesUndefined: Self = StObject.set(x, "excludedResourceTypes", js.undefined)
    
    inline def setExcludedResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "excludedResourceTypes", js.Array(value*))
    
    inline def setExcludedTabIds(value: js.Array[Double]): Self = StObject.set(x, "excludedTabIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedTabIdsUndefined: Self = StObject.set(x, "excludedTabIds", js.undefined)
    
    inline def setExcludedTabIdsVarargs(value: Double*): Self = StObject.set(x, "excludedTabIds", js.Array(value*))
    
    inline def setInitiatorDomains(value: js.Array[String]): Self = StObject.set(x, "initiatorDomains", value.asInstanceOf[js.Any])
    
    inline def setInitiatorDomainsUndefined: Self = StObject.set(x, "initiatorDomains", js.undefined)
    
    inline def setInitiatorDomainsVarargs(value: String*): Self = StObject.set(x, "initiatorDomains", js.Array(value*))
    
    inline def setIsUrlFilterCaseSensitive(value: Boolean): Self = StObject.set(x, "isUrlFilterCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setIsUrlFilterCaseSensitiveUndefined: Self = StObject.set(x, "isUrlFilterCaseSensitive", js.undefined)
    
    inline def setRegexFilter(value: String): Self = StObject.set(x, "regexFilter", value.asInstanceOf[js.Any])
    
    inline def setRegexFilterUndefined: Self = StObject.set(x, "regexFilter", js.undefined)
    
    inline def setRequestDomains(value: js.Array[String]): Self = StObject.set(x, "requestDomains", value.asInstanceOf[js.Any])
    
    inline def setRequestDomainsUndefined: Self = StObject.set(x, "requestDomains", js.undefined)
    
    inline def setRequestDomainsVarargs(value: String*): Self = StObject.set(x, "requestDomains", js.Array(value*))
    
    inline def setRequestMethods(value: js.Array[RequestMethod]): Self = StObject.set(x, "requestMethods", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodsUndefined: Self = StObject.set(x, "requestMethods", js.undefined)
    
    inline def setRequestMethodsVarargs(value: RequestMethod*): Self = StObject.set(x, "requestMethods", js.Array(value*))
    
    inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    inline def setTabIdsUndefined: Self = StObject.set(x, "tabIds", js.undefined)
    
    inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
    
    inline def setUrlFilter(value: String): Self = StObject.set(x, "urlFilter", value.asInstanceOf[js.Any])
    
    inline def setUrlFilterUndefined: Self = StObject.set(x, "urlFilter", js.undefined)
  }
}
