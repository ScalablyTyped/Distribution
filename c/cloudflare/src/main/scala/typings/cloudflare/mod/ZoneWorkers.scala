package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneWorkers extends StObject {
  
  def validate(zone_id: String, script: String): js.Promise[js.Object]
}
object ZoneWorkers {
  
  inline def apply(validate: (String, String) => js.Promise[js.Object]): ZoneWorkers = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[ZoneWorkers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoneWorkers] (val x: Self) extends AnyVal {
    
    inline def setValidate(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
