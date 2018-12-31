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

