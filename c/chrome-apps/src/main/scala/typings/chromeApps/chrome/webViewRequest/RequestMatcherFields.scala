package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.events.UrlFilter
import typings.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMatcherFields extends js.Object {
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header)
    * is contained in the list. */
  var contentType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header) is not contained in the list.
    */
  var excludeContentType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Matches if none of the request headers is matched by any of the HeaderFilters.
    */
  var excludeRequestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if none of the response headers is matched by any of the HeaderFilters.
    */
  var excludeResponseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if the conditions of the UrlFilter are fulfilled for the
    * 'first party' URL of the request. The 'first party' URL of a request,
    * when present, can be different from the request's target URL, and
    * describes what is considered 'first party' for the sake of third-party
    * checks for cookies.
    */
  var firstPartyForCookiesUrl: js.UndefOr[UrlFilter] = js.native
  /**
    * Matches if some of the request headers is matched by one of the HeaderFilters.
    */
  var requestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if the request type of a request is contained in the list.
    * Requests that cannot match any of the types will be filtered out. */
  var resourceType: js.UndefOr[js.Array[ResourceType]] = js.native
  /**
    * Matches if some of the response headers is matched by one of the HeaderFilters.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Contains a list of strings describing stages.
    * If this attribute is present, then it limits the applicable stages to those listed.
    * Note that the whole condition is only applicable in stages compatible with all attributes. */
  var stages: js.UndefOr[js.Array[Stage]] = js.native
  /**
    * If set to true, matches requests that are subject to third-party cookie policies.
    * If set to false, matches all other requests.
    */
  var thirdPartyForCookies: js.UndefOr[Boolean] = js.native
  /** Matches if the conditions of the UrlFilter are fulfilled for the URL of the request. */
  var url: js.UndefOr[UrlFilter] = js.native
}

object RequestMatcherFields {
  @scala.inline
  def apply(): RequestMatcherFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcherFields]
  }
  @scala.inline
  implicit class RequestMatcherFieldsOps[Self <: RequestMatcherFields] (val x: Self) extends AnyVal {
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
    def setContentTypeVarargs(value: String*): Self = this.set("contentType", js.Array(value :_*))
    @scala.inline
    def setContentType(value: js.Array[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setExcludeContentTypeVarargs(value: String*): Self = this.set("excludeContentType", js.Array(value :_*))
    @scala.inline
    def setExcludeContentType(value: js.Array[String]): Self = this.set("excludeContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeContentType: Self = this.set("excludeContentType", js.undefined)
    @scala.inline
    def setExcludeRequestHeadersVarargs(value: HeaderFilter*): Self = this.set("excludeRequestHeaders", js.Array(value :_*))
    @scala.inline
    def setExcludeRequestHeaders(value: js.Array[HeaderFilter]): Self = this.set("excludeRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeRequestHeaders: Self = this.set("excludeRequestHeaders", js.undefined)
    @scala.inline
    def setExcludeResponseHeadersVarargs(value: HeaderFilter*): Self = this.set("excludeResponseHeaders", js.Array(value :_*))
    @scala.inline
    def setExcludeResponseHeaders(value: js.Array[HeaderFilter]): Self = this.set("excludeResponseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeResponseHeaders: Self = this.set("excludeResponseHeaders", js.undefined)
    @scala.inline
    def setFirstPartyForCookiesUrl(value: UrlFilter): Self = this.set("firstPartyForCookiesUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPartyForCookiesUrl: Self = this.set("firstPartyForCookiesUrl", js.undefined)
    @scala.inline
    def setRequestHeadersVarargs(value: HeaderFilter*): Self = this.set("requestHeaders", js.Array(value :_*))
    @scala.inline
    def setRequestHeaders(value: js.Array[HeaderFilter]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    @scala.inline
    def setResourceTypeVarargs(value: ResourceType*): Self = this.set("resourceType", js.Array(value :_*))
    @scala.inline
    def setResourceType(value: js.Array[ResourceType]): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderFilter*): Self = this.set("responseHeaders", js.Array(value :_*))
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderFilter]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setStagesVarargs(value: Stage*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: js.Array[Stage]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
    @scala.inline
    def setThirdPartyForCookies(value: Boolean): Self = this.set("thirdPartyForCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyForCookies: Self = this.set("thirdPartyForCookies", js.undefined)
    @scala.inline
    def setUrl(value: UrlFilter): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

