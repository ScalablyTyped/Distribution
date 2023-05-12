package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceV12
  extends StObject
     with ServiceBase {
  
  var services: js.UndefOr[js.Array[ServiceV12]] = js.undefined
}
object ServiceV12 {
  
  inline def apply(name: String): ServiceV12 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceV12]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceV12] (val x: Self) extends AnyVal {
    
    inline def setServices(value: js.Array[ServiceV12]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV12*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
