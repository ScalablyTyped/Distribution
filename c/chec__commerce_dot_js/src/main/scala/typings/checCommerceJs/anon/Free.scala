package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Free extends StObject {
  
  var free: Boolean
  
  var fulfilled: Boolean
}
object Free {
  
  inline def apply(free: Boolean, fulfilled: Boolean): Free = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], fulfilled = fulfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Free]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Free] (val x: Self) extends AnyVal {
    
    inline def setFree(value: Boolean): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setFulfilled(value: Boolean): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
  }
}
