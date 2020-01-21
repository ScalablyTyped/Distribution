package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandler extends js.Object {
  /** Allow the permission request. */
  def allow(): Unit
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): Unit
}

object PermissionRequestHandler {
  @scala.inline
  def apply(allow: () => Unit, deny: () => Unit): PermissionRequestHandler = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny))
  
    __obj.asInstanceOf[PermissionRequestHandler]
  }
}

