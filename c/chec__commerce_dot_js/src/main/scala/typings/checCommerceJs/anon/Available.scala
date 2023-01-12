package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  var available: Double
  
  var managed: Boolean
}
object Available {
  
  inline def apply(available: Double, managed: Boolean): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
  }
}
