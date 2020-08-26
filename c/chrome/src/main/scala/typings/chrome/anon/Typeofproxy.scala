package typings.chrome.anon

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproxy extends js.Object {
  var onProxyError: ProxyErrorEvent = js.native
  var settings: ChromeSetting = js.native
}

object Typeofproxy {
  @scala.inline
  def apply(onProxyError: ProxyErrorEvent, settings: ChromeSetting): Typeofproxy = {
    val __obj = js.Dynamic.literal(onProxyError = onProxyError.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
  @scala.inline
  implicit class TypeofproxyOps[Self <: Typeofproxy] (val x: Self) extends AnyVal {
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
    def setOnProxyError(value: ProxyErrorEvent): Self = this.set("onProxyError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: ChromeSetting): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

