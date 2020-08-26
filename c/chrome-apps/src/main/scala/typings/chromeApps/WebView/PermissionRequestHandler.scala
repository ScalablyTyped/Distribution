package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionRequestHandler extends js.Object {
  /** Allow the permission request. */
  def allow(): Unit = js.native
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): Unit = js.native
}

object PermissionRequestHandler {
  @scala.inline
  def apply(allow: () => Unit, deny: () => Unit): PermissionRequestHandler = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny))
    __obj.asInstanceOf[PermissionRequestHandler]
  }
  @scala.inline
  implicit class PermissionRequestHandlerOps[Self <: PermissionRequestHandler] (val x: Self) extends AnyVal {
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
    def setAllow(value: () => Unit): Self = this.set("allow", js.Any.fromFunction0(value))
    @scala.inline
    def setDeny(value: () => Unit): Self = this.set("deny", js.Any.fromFunction0(value))
  }
  
}

