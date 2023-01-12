package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMounted extends StObject {
  
  var isMounted: Boolean
}
object IsMounted {
  
  inline def apply(isMounted: Boolean): IsMounted = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMounted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMounted] (val x: Self) extends AnyVal {
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
  }
}
