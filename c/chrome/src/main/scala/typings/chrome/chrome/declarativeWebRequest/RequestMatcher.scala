package typings.chrome.chrome.declarativeWebRequest

import typings.chrome.chrome.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMatcher extends js.Object {
  var contentType: js.UndefOr[js.Array[String]] = js.undefined
  var excludeContentType: js.UndefOr[js.Array[String]] = js.undefined
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  var resourceType: js.UndefOr[String] = js.undefined
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  var url: js.UndefOr[UrlFilter] = js.undefined
}

object RequestMatcher {
  @scala.inline
  def apply(
    contentType: js.Array[String] = null,
    excludeContentType: js.Array[String] = null,
    excludeResponseHeader: js.Array[HeaderFilter] = null,
    resourceType: String = null,
    responseHeaders: js.Array[HeaderFilter] = null,
    url: UrlFilter = null
  ): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (excludeContentType != null) __obj.updateDynamic("excludeContentType")(excludeContentType.asInstanceOf[js.Any])
    if (excludeResponseHeader != null) __obj.updateDynamic("excludeResponseHeader")(excludeResponseHeader.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMatcher]
  }
}

