package typings.chromeDashApps.chromeNs.webViewRequestNs

import typings.chromeDashApps.chromeNs.eventsNs.UrlFilter
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMatcherFields extends js.Object {
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header)
    * is contained in the list. */
  var contentType: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header) is not contained in the list.
    */
  var excludeContentType: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Matches if none of the request headers is matched by any of the HeaderFilters.
    */
  var excludeRequestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  /**
    * Matches if none of the response headers is matched by any of the HeaderFilters.
    */
  var excludeResponseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  /**
    * Matches if the conditions of the UrlFilter are fulfilled for the
    * 'first party' URL of the request. The 'first party' URL of a request,
    * when present, can be different from the request's target URL, and
    * describes what is considered 'first party' for the sake of third-party
    * checks for cookies.
    */
  var firstPartyForCookiesUrl: js.UndefOr[UrlFilter] = js.undefined
  /**
    * Matches if some of the request headers is matched by one of the HeaderFilters.
    */
  var requestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  /**
    * Matches if the request type of a request is contained in the list.
    * Requests that cannot match any of the types will be filtered out. */
  var resourceType: js.UndefOr[js.Array[ResourceType]] = js.undefined
  /**
    * Matches if some of the response headers is matched by one of the HeaderFilters.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  /**
    * Contains a list of strings describing stages.
    * If this attribute is present, then it limits the applicable stages to those listed.
    * Note that the whole condition is only applicable in stages compatible with all attributes. */
  var stages: js.UndefOr[js.Array[Stage]] = js.undefined
  /**
    * If set to true, matches requests that are subject to third-party cookie policies.
    * If set to false, matches all other requests.
    */
  var thirdPartyForCookies: js.UndefOr[Boolean] = js.undefined
  /** Matches if the conditions of the UrlFilter are fulfilled for the URL of the request. */
  var url: js.UndefOr[UrlFilter] = js.undefined
}

object RequestMatcherFields {
  @scala.inline
  def apply(
    contentType: js.Array[String] = null,
    excludeContentType: js.Array[String] = null,
    excludeRequestHeaders: js.Array[HeaderFilter] = null,
    excludeResponseHeaders: js.Array[HeaderFilter] = null,
    firstPartyForCookiesUrl: UrlFilter = null,
    requestHeaders: js.Array[HeaderFilter] = null,
    resourceType: js.Array[ResourceType] = null,
    responseHeaders: js.Array[HeaderFilter] = null,
    stages: js.Array[Stage] = null,
    thirdPartyForCookies: js.UndefOr[Boolean] = js.undefined,
    url: UrlFilter = null
  ): RequestMatcherFields = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (excludeContentType != null) __obj.updateDynamic("excludeContentType")(excludeContentType)
    if (excludeRequestHeaders != null) __obj.updateDynamic("excludeRequestHeaders")(excludeRequestHeaders)
    if (excludeResponseHeaders != null) __obj.updateDynamic("excludeResponseHeaders")(excludeResponseHeaders)
    if (firstPartyForCookiesUrl != null) __obj.updateDynamic("firstPartyForCookiesUrl")(firstPartyForCookiesUrl)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (stages != null) __obj.updateDynamic("stages")(stages)
    if (!js.isUndefined(thirdPartyForCookies)) __obj.updateDynamic("thirdPartyForCookies")(thirdPartyForCookies)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestMatcherFields]
  }
}

