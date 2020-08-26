package typings.chrome.chrome.declarativeWebRequest

import typings.chrome.chrome.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMatcher extends js.Object {
  var contentType: js.UndefOr[js.Array[String]] = js.native
  var excludeContentType: js.UndefOr[js.Array[String]] = js.native
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.native
  var resourceType: js.UndefOr[String] = js.native
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  var url: js.UndefOr[UrlFilter] = js.native
}

object RequestMatcher {
  @scala.inline
  def apply(): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcher]
  }
  @scala.inline
  implicit class RequestMatcherOps[Self <: RequestMatcher] (val x: Self) extends AnyVal {
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
    def setExcludeResponseHeaderVarargs(value: HeaderFilter*): Self = this.set("excludeResponseHeader", js.Array(value :_*))
    @scala.inline
    def setExcludeResponseHeader(value: js.Array[HeaderFilter]): Self = this.set("excludeResponseHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeResponseHeader: Self = this.set("excludeResponseHeader", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderFilter*): Self = this.set("responseHeaders", js.Array(value :_*))
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderFilter]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setUrl(value: UrlFilter): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

