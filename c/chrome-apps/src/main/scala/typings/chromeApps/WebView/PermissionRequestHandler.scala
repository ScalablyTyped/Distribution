package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionRequestHandler extends StObject {
  
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
  implicit class PermissionRequestHandlerMutableBuilder[Self <: PermissionRequestHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: () => Unit): Self = StObject.set(x, "allow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeny(value: () => Unit): Self = StObject.set(x, "deny", js.Any.fromFunction0(value))
  }
}
