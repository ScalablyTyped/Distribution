package typings.chrome.chrome.webNavigation

import typings.chrome.chrome.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEventFilter extends js.Object {
  /** Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of UrlFilter are ignored for this event. */
  var url: js.Array[UrlFilter] = js.native
}

object WebNavigationEventFilter {
  @scala.inline
  def apply(url: js.Array[UrlFilter]): WebNavigationEventFilter = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationEventFilter]
  }
  @scala.inline
  implicit class WebNavigationEventFilterOps[Self <: WebNavigationEventFilter] (val x: Self) extends AnyVal {
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
    def setUrlVarargs(value: UrlFilter*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: js.Array[UrlFilter]): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

