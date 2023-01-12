package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CFIPs extends StObject {
  
  def browse(): js.Promise[js.Object]
}
object CFIPs {
  
  inline def apply(browse: () => js.Promise[js.Object]): CFIPs = {
    val __obj = js.Dynamic.literal(browse = js.Any.fromFunction0(browse))
    __obj.asInstanceOf[CFIPs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CFIPs] (val x: Self) extends AnyVal {
    
    inline def setBrowse(value: () => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction0(value))
  }
}
