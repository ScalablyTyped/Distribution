package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMatcher extends js.Object {
  var contentType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeContentType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  var resourceType: js.UndefOr[java.lang.String] = js.undefined
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  var url: js.UndefOr[chromeLib.chromeNs.eventsNs.UrlFilter] = js.undefined
}

object RequestMatcher {
  @scala.inline
  def apply(
    contentType: js.Array[java.lang.String] = null,
    excludeContentType: js.Array[java.lang.String] = null,
    excludeResponseHeader: js.Array[HeaderFilter] = null,
    resourceType: java.lang.String = null,
    responseHeaders: js.Array[HeaderFilter] = null,
    url: chromeLib.chromeNs.eventsNs.UrlFilter = null
  ): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (excludeContentType != null) __obj.updateDynamic("excludeContentType")(excludeContentType)
    if (excludeResponseHeader != null) __obj.updateDynamic("excludeResponseHeader")(excludeResponseHeader)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestMatcher]
  }
}

