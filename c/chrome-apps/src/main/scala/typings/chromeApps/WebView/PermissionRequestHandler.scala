package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRequestHandler extends StObject {
  
  /** Allow the permission request. */
  def allow(): Unit
  
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): Unit
}
object PermissionRequestHandler {
  
  inline def apply(allow: () => Unit, deny: () => Unit): PermissionRequestHandler = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny))
    __obj.asInstanceOf[PermissionRequestHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRequestHandler] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: () => Unit): Self = StObject.set(x, "allow", js.Any.fromFunction0(value))
    
    inline def setDeny(value: () => Unit): Self = StObject.set(x, "deny", js.Any.fromFunction0(value))
  }
}
