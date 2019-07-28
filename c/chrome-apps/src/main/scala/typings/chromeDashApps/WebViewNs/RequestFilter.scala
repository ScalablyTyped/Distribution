package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing filters to apply to webRequest events. */
trait RequestFilter extends js.Object {
  /** Optional. */
  var tabId: js.UndefOr[integer] = js.undefined
  /**
    * A list of request types. Requests that cannot match any of the types will be filtered out.
    */
  var types: js.UndefOr[js.Array[ResourceType]] = js.undefined
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[String]
  /** Optional. */
  var windowId: js.UndefOr[integer] = js.undefined
}

object RequestFilter {
  @scala.inline
  def apply(
    urls: js.Array[String],
    tabId: js.UndefOr[integer] = js.undefined,
    types: js.Array[ResourceType] = null,
    windowId: js.UndefOr[integer] = js.undefined
  ): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId)
    if (types != null) __obj.updateDynamic("types")(types)
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId)
    __obj.asInstanceOf[RequestFilter]
  }
}

